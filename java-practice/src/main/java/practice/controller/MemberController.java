package practice.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import practice.domain.Member;
import practice.util.Prompts;

public class MemberController extends GenericController<Member> {
     
    private String dataFilePath;
    
    public MemberController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }
    
    @Override
    public void destroy() {
            try (FileWriter out = new FileWriter(this.dataFilePath);){
                for (Member member : this.list) {
                    out.write(member.toCSVString()+ "\n");
            }
                
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void init() {
        try (
                FileReader in = new FileReader(this.dataFilePath);
                Scanner lineScan = new Scanner(in);){// 파일리더를 스캐너에 넣고
            
            String csv = null;
            
            while (lineScan.hasNextLine()) { // 한줄씩 출력해 내는 기본 코어 코딩!
                csv = lineScan.nextLine();
                
                try {
                    
                    list.add(new Member(csv));
                    
                } catch (CSVFormatException e) {
                    
                    System.out.println("CSV데이터 형식 오류!");
                    e.printStackTrace();
                }
            }
        }catch (IOException e) {e.printStackTrace();}
        
}
    
    @Override
    public void execute() {
        loop:
            while(true) {
                System.out.print("회원관리> ");
                String input = keyScan.nextLine();
                
                switch (input) {
                case "add":    this.doAdd(); break;
                case "list":   this.dolist(); break;
                case "view":   this.doView(); break;
                case "delete": this.dodelete(); break;
                case "update": this.doUpdate(); break;
                case "main":   break loop;
                default: 
                    System.out.println("해당 명령이 없습니다.");
                }
                System.out.println();
            }
         
     }
    
    private void doAdd() {
        Member member;
        System.out.println("회원 등록");
            member = new Member();
            
            member.setEmail(Prompts.inputString("이메일? "));
            
            if (findByEmail(member.getEmail()) != null) {
                System.out.printf("이미 등록된 이메일 입니다.");
                return;
            }
            
            member.setName(Prompts.inputString("이름? "));
            member.setPwd(Prompts.inputString("암호? "));
            
            list.add(member);
    }
    
     private void dolist() {
        
        System.out.println("회원 목록");
        Iterator<Member> iterator = list.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            System.out.printf("이름 : %s\n이메일 : %s\n",  
                    member.getName(), 
                    member.getEmail());
        }
    }
     
     private void doView() {
         System.out.println("회원 상세 정보");
         String email = Prompts.inputString("이메일? ");
         
         Member member = findByEmail(email);
         
         if (member == null) {
             System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
             return;
         }
         System.out.printf("이름 : %s\n이메일 : %s\n암호 : %s\n",  
                 member.getName(), member.getEmail(), member.getPwd()); 
     }
    
     private void doUpdate() {
        String email = Prompts.inputString("이메일? ");
        
        Member member = findByEmail(email);
        
        if (member == null) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
            return;
        }
        
        String name = Prompts.inputString("이름?(%s)", member.getName());
        if (name.isEmpty()) {
            name = member.getName();
        }
        
        String pwd = Prompts.inputString("암호? ");
        if (pwd.isEmpty()) {
            pwd = member.getPwd();
        }
        
        if (Prompts.confirm2("변경 하시겠습니까?(Y/n)")) {
            member.setName(name);
            member.setPwd(pwd);
            System.out.println("변경되었습니다.");
        }else
            System.out.println("변경이 취소되었습니다.");
     }
     
     private void dodelete() {
        System.out.println("회원 삭제");
        String email = Prompts.inputString("이메일? ");
        
        Member member = findByEmail(email);
        
        if (member == null) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
            return;
        }
        
        if(Prompts.confirm2("정말 삭제하시겠습니까?(y/N)")) {
            list.remove(member);
            System.out.println("삭제하였습니다.");
        } else {
            System.out.println("삭제 취소하였습니다.");
        }
        
    }
     
     private Member findByEmail(String email) {
         Iterator<Member> iterator = list.iterator();
         while (iterator.hasNext()) {
             Member member = iterator.next();
             if(member.getEmail().equals(email)) {
                 return member;
             }
         }
         return null;
     }
}

