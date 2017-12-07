package java100.app.Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Member;
import java100.app.domain.Score;
import java100.app.util.Prompts;

public class MemberController extends GenericController<Member> {
    
    private String dataFilePath;
    
    public MemberController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }
    
    @Override
    public void destroy() {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(this.dataFilePath)))
                ) {
            for (Member member : this.list) {
                out.write(member.toCSVString() + "\n");
            }
            out.flush();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void init() {
        
        try (BufferedReader in = new BufferedReader(
                new FileReader(this.dataFilePath));
                Scanner linescan = new Scanner(in);) {
            
            String csv = null;
            while ((csv = in.readLine()) != null) {
                try {
                    list.add(new Member(csv));
                } catch (CSVFormatException e) {
                    System.err.println("CSV 데이터 형식 오류!");
                    e.printStackTrace();
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void excute() {
        loop:
            while (true) {
                System.out.print("회원관리> ");
                String menu = scan.nextLine();

                switch(menu) {
                case "add":  this.doAdd(); break;
                case "list": this.doList(); break;
                case "view": this.doView(); break;
                case "delete":this.doDelete(); break;
                case "update": this.doUpdate(); break;
                case "main": break loop;
                default : System.out.println("해당 명령이 없습니다.");
                }
            }
    }

    private void doUpdate() {
        System.out.println("[회원 정보 수정]");
        String email = Prompts.inputString("이메일? ");

        Member member = findByEmail(email);

        if (member == null) {
            System.out.printf("%s의 회 정보가 없습니다.",email);
        }
        String name = Prompts.inputString("이름? (%s)", member.getName());
        if (name.isEmpty()) {
            name = member.getName();
        }
        String password = Prompts.inputString("암호? (%s)", member.getPassword());
        if (password.isEmpty()) {
            password = member.getPassword();
        }

        if (!Prompts.confirm2("변경하시겠습니까? (y/N)")) {
            System.out.println("변경이 취소되었습니다.");
            return;
        } else {
            member.setName(name);
            member.setPassword(password);
            System.out.println("변경되었습니다.");
        }
    }


    private void doDelete() {
        System.out.println("[회원 삭제]");
        String email = Prompts.inputString("이메일? ");

        Member member = findByEmail(email);

        if (member == null) {
            System.out.printf("%s의 회원 정보가 없습니다.",email);
        } 

        if (!Prompts.confirm2("정말 삭제하시겠습니까? (y/N)")) {
            return;
        } else {
            list.remove(member);
            System.out.println("삭제하였습니다.");
        }
    }

private void doView() {
    System.out.println("[회원 상세 정보]");
    String email = Prompts.inputString("이메일? ");

    Member member =findByEmail(email);

    if (member == null) {
        System.out.printf("%s의 회원 정보가 없습니다.",email);
    } else {
        System.out.printf("이름 : %-4s\n이메일 : %4s\n암호 : %4s\n",
                member.getName(),
                member.getEmail(),
                member.getPassword());
    }        
}

private void doList() {
    System.out.println("[회원 정보]");

    Iterator<Member> iterator = list.iterator();

    while (iterator.hasNext()) {
        Member member = iterator.next();
        System.out.printf("%-4s, %4s\n",
                member.getName(),
                member.getEmail());

    }
}

public void doAdd() {
    System.out.println("[회원 등록]");
    Member member = new Member();
    
    member.setName(Prompts.inputString("이름? "));
    member.setEmail(Prompts.inputString("이메일? "));
    member.setPassword(Prompts.inputString("암호? "));

    boolean isExist = false;
    Iterator<Member> iterator = list.iterator();
    while (iterator.hasNext()) {
        if (iterator.next().getEmail().equals(member.getEmail())){
            isExist = true;
            break;
        }
    }

    if (isExist) {
        System.out.println("이미 등록된 이메일 입니다.");
    } else {
        list.add(member);
    }
}

private Member findByEmail(String email) {
    Iterator<Member> iterator = list.iterator();
    while(iterator.hasNext()) {
        Member member = iterator.next();
        if (member.getEmail().equals(email)) {
            return member;
        }
    }
    return null;
}


}
