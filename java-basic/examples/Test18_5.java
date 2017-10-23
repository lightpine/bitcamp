// ## String 인스턴스의 내용 비교 기타 메서드들

package bitcamp.java100;

public class Test18_5{
    
    public static void main(String[] args) throws Exception {
        String s1 = "ABC가각간";
        
        // replace()
        String s2 = s1.replace("BC", "하하하");
        
        System.out.println(s1);
        System.out.println(s2);
        // String 인스턴스의 값은 한번 정해지면 변경할 수 없다는 사실을 알고있어라
        // 그렇기 때문에 replace 는 새로운 String인스턴스를 생성한다.
        
        // charAT(위치 번호)
        System.out.println(s1.charAt(4));
        
        // indwxOF(앞에서 부터 문자의 시작점을 찾아 리턴)
        System.out.println(s1.indexOf("가각"));
        System.out.println("-----------------------------------1");
        
        // lastindexOf(뒤에서 부터 찾아 리턴)
        s1 = "ABBCDEBBFGH";
        System.out.println(s1.lastIndexOf("BB"));
        
        System.out.println("-----------------------------------2");
        // substring(지정된 인덱스의 문자부터 끝까지 문자열을 출력)
        System.out.println(s1.substring(3));
        
        System.out.println("-----------------------------------3");
        
        // substring(지정된 인덱스의 문자부터 끝 인덱스 직전까지의 문자열을 출력)
        System.out.println(s1.substring(3, 6));
        
        System.out.println("-----------------------------------4");
        s1 = "홍길동";
        
        // startsWith(해당 문자열이 주어진 문자열로 시작하는지 검사한다.)
        System.out.println(s1.startsWith("홍길"));
        System.out.println(s1.startsWith("길"));
        
        System.out.println("-----------------------------------5");
        
        // endsWith(해당 문자열이 주어진 문자열로 끝나는지 검사한다.)
        System.out.println(s1.endsWith("동"));
        System.out.println(s1.endsWith("원"));
        
        System.out.println("-----------------------------------6");
        
        s1 = "홍길동,유관순,안중근,윤봉길,이육사,윤동주";
        
        // contains(해당 문자열에 주어진 문자열이 있는지 검사)
        System.out.println(s1.contains("꺽정"));
        System.out.println(s1.contains("김꺽정"));
        
        System.out.println("-----------------------------------7");
        
        String s3 = "ABC";
        String s4 = "가각간";
        
        // concat(해당 문자열에 주어진 문자열을 추가하여 새 string인스턴스를 생성한다.)
        // 절대로 기존 string 인스턴스에 값이 바뀌지 않는다.
        System.out.println(s3.concat(s4));
        System.out.println(s3);
        System.out.println(s4);
        
        System.out.println("-----------------------------------8");
        
        s3 = new String("탕수육");
        s4 = new String("탕수육2");
        String s5 = new String("탈수육");
        String s6 = new String("탕수육");
        
        // 문자열1.compareTo(문자열2) 
        // 두 문자열이 같으면 0
        // 문자면 1이 문자열 2 보다 알파벳 / 가나다 순서에서 앞서면 음수를 리턴한다.
        // 문자면 1이 문자열 2 보다 알파벳 / 가나다 순서에서 뒤면 음수를 리턴한다.
        // 값은 따지지 않고 양수냐 음수냐에 따라 비교
        // 보통 이 문자열이 먼저갈지 뒤로갈지를 결정하고 적용할 때 사용한다.
        
        System.out.println(s3.compareTo(s6));
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s5));
        
        System.out.println("-----------------------------------9");
        
        s1 = "홍길동";
        s2 = ""; // 빈 문자열
        s3 = null; // 인스턴스가 없음
        
        //isEmpty(문자열이 비어있는지 확인)
        // 있으면 false 있으면 true
        
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        // System.out.println(s3.isEmpty()); // 널포인트 익셉션!!!!!
        
        // length(string인스턴스에 저장된 문자의 개수를 리턴한다.)
        System.out.println(s1.length());
        System.out.println(s2.length());
        //System.out.println(s3.length()); // 널포인트 익셉션!!!!!
        
        System.out.println("-----------------------------------10");
       
        s1 = "홍길동,유관순,,안중근,윤봉길,이육사,윤동주";
        
        String[] arr = s1.split(",");
        for (String s : arr) {
            System.out.println(s);
            System.out.println("-");
        }
        System.out.println();

        System.out.println("-----------------------------------11");
        
        // 구분자를 찾지 못했을땐 통제로 배열에 담아 리턴한다.
        arr = s1.split(" ");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        
        
        // 빈 문자열도 문자열이기 떄문에 배열로 리턴된다.
        // 굉장히 많이 쓰인다!
        s1 = "";
        arr = s1.split(",");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        
        System.out.println("-----------------------------------12");
        
        // toLowerCase(해당 문자열을 모두 소문자로 바꾼 새 String(객체)을 만든 후 그 객체(의 주소)를 리턴)
        // toUpperCase(해당 문자열을 모두 대문자로 바꾼 새 String(객체)을 만든 후 그 객체(의 주소)를 리턴)
        s1 = "Hong Gil Dong";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        
        System.out.println("-----------------------------------13");
        
        // trim(문자열의 양쪽 공백을 날려버린다. 단 중간의 공백은 날려버리지 않는다.)
        // 공백(white space)
        // 스페이스 (스페이스 바를 눌러 추가한 빈 칸 한개),탭, 줄바꿈 모두 공백으로 취급한다.
        
        s1 = "  \t홍\t길  동 \n입니다. \n\n\n\t\n";
        System.out.print(">");
        System.out.print(s1.trim());
        System.out.println("<");
        
        System.out.println("-----------------------------------14");
        
        s1 = "ABC\n가각간\n똘똠똥";
        
        // getBytes()
        // 해당 문자열을 JVM에 설정된 문자집합의 코드 값으로 추출한다.
        // 추출한 코드는 바이트 배열에 저장되어 리턴한다.
        
        byte[] bytes = s1.getBytes();
        for(byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0x00ff));
            System.out.print(" ");
        }
        System.out.println();
        
        // 가능한 문자 집합을 명시하여 바이트 배열을 만들라!
        // OS에 상관없이 동일한 결과를 얻을 수 있다.
        // 인코딩을 정해줄 때는 메인 메서드 옆에 throws Exception을 붙여준다.
        
        // 서로 데이터를 주고 받을 때는 바이트를 기본으로 주고 받는다.
        bytes = s1.getBytes("UTF-8");
        for(byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0x00ff));
            System.out.print(" ");
        }
        System.out.println();
        
        System.out.println("-----------------------------------15");
        
        //String의 클래스 메서드
        // valueOf(값)
        // 주어진 값을 가지고 String 인스턴스를 생성하는 메스드이다.
        s1 = String.valueOf(true);
        s2 = String.valueOf(3.14);
        s3 = String.valueOf(100);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        
        System.out.println("-----------------------------------16");
        s1 = "ABC";
        s2 = "가각간";
        s3 = s1 + s2;
        // 두 인스턴스의 값을 연결하여 새 String개체를 만든다.
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
     }
        
    
}
