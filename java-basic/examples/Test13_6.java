package bitcamp.java100;

public class Test13_6{
    
    public static void main(String[] args){
    //배열의 시작 주소를 저장하는 변수 => 레퍼런스.
        
        int[] arr1;

    //new 명령으로 준비된 메모리 => 인스턴스(instance) 또는 객체(object)
        arr1 = new int[3];
    //새로 주소저장하면 기존것은 사용할 수 없게 되며 그 사용할 수 없는 인스턴스를 garbage라 한다.
        arr1 = new int[5];
    // Garbage Collertor
    // jvm 메모리가 부족할 때 OS에 새 메모리를 요청하기 전에 자신의 메모리를 정리

        
    }
}