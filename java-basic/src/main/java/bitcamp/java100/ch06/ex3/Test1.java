// 스태틱 맴버 - 클래스 로딩과 클래스 변수
package bitcamp.java100.ch06.ex3;

public class Test1 {
    public static void main(String[] args) {
        
        System.console().readLine("계속 실행하려면 엔터를 치세요");
        // 클래스 변수 사용
        System.out.println(MyClass.v1); // 이 때 MyClass 파일이 메모리에 로딩됨.
        
        MyClass.v1 += 200; // 이미 MyClass는 메모리에 로딩되었기 떄문에 다시 로딩되지 않는다.
        
        System.console().readLine("계속 실행하려면 엔터를 치세요");
        
        System.out.println(MyClass.v1); 
        
        
    }
}

// 클래스 로딩 
// . class파일을 외부 저장장치에서
// JVM이 관리하는 메모리 영역(Method Area라 부른다.)으로 
// 복사하는것을 말한다.

// 내부기억장치(RAM)가 부족할 때 현재 메모리에 로딩된 데이터 중에서 당장 사용하지 않는 데이터는
// 다시 외부저장장치에 특정 폴더에 실행할 파일이나 읽은 파일을 메모리에 로딩한다.
// 메모리에 로딩된 데이터를 잠시 외부저장장치에 보관하기 위해 만든 폴더를 
// 캐쉬메모리라 부른다.

// 클래스 로딩 절차
// JRE의 라이브러리 폴더에서 클래스를 찾는다.
// ClassPath 환경 변수에 저징된 폴더에서 클래스를 찾는다.
//