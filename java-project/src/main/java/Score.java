public class Score {
    // new명령을 사용하는 메모리 설계도이다.
            String name;
            int[] subjects = new int[3];
            int sum;
            float aver;
            
            //메서드 
            public static void compute(Score score) {
                for (int sub : score.subjects) {
                    score.sum += sub;
                }
                score.aver = score.sum / 3f;
            }
            
            public static void print(Score score) {
                System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                        score.name, score.subjects[0], score.subjects[1], score.subjects[2], score.sum, score.aver);
            }
            
            public static void init(Score score, String name, int kor, int eng, int math) {
                score.name = name;
                score.subjects[0] = kor;
                score.subjects[1] = eng;
                score.subjects[2] = math;
                compute(score);

            }
        }
