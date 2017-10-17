// ## String 정규식을 이용하여 문자열을 검사하기

package bitcamp.java100;


public class Test18_6{
    
    public static void main(String[] args) throws Exception {
        String email = "lightpine@test.com";
        // 정규표현식(Regular Expression) 
        System.out.println(email.matches("lightpine@test.com"));
        
        // . : 임의의 문자 한 개
        // +(한개 이상의) *(0개 이상), ?(0 또는 한개)
        // \\. 그냥 dot 문자
        
        
        System.out.println(email.matches(".+@.+\\..+"));
        
        // \\D <- 숫자를 제외한 문자
        System.out.println(email.matches("^\\D.+@.+\\..+"));
        
        // JAVA API에서 java.util.regex.Pattern 클래스를 확인해서 사용할 것
        
        // 추출
        
        String str = "홍길동(Hong@test.com),임꺽정(Im@test.com),유관순(Yoo@test.com),"
                    + "안중근(Ahn@test.com),윤봉길Youn@test.com)";
        
        //해당 문자열에서 주어진 규칙을 갖는 문자열을 찾아 출력하기
        java.util.regex.Pattern pattern = 
                java.util.regex.Pattern.compile("\\w+@\\w+\\.\\w+");
        //\\w = 소문자 a~z + A~Z + _ + 0 ~ 9까지 포함
        
        java.util.regex.Matcher matcher = pattern.matcher(str);
        
        
        int startIndex = 0;
        
        while(matcher.find(startIndex)) {
            System.out.println(startIndex);
            String matchString = matcher.group();
            startIndex = matcher.end();
            
            System.out.println(matchString);
        }
        
     }
        
    
}
