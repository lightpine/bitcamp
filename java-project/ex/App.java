
public class App {

    public static void main(String[] args) {
        
        int[] kor = {100, 90, 80};
        int[] eng = {90, 80, 100};
        int[] math = {80, 80, 100};
        String[] name = {"홍길동" , "임꺽정", "유관순"};

        for (int i = 0; i < name.length ; i++){
            int sum = kor[i] + eng[i] + math[i];
            float aver = sum / 3.0f;
            System.out.printf("%-4s : 국어 :%4d, 영어 :%4d, 수학 :%4d, 총점 :%4d, 평균 :%6.1f\n", name[i],kor[i], eng[i], math[i], sum, aver);
        }
    
    }    
}
