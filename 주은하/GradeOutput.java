package 주은하;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeOutput {
    public static void main(String[] args) {
        List<Grade> grades = new ArrayList();
        Scanner sc = new Scanner(System.in);

        //성적 입력
        while(true) {
            System.out.println("과목명을 입력해 주세요.");
            String mySub = sc.next();
            System.out.println("성적을 입력해 주세요.");
            int mySco = sc.nextInt();
            Grade grade = new Grade();
            grade.setSubject(mySub);
            grade.setScore(mySco);
            grades.add(grade);

            System.out.println("성적을 산출하려면 0, 더 입력하려면 1을 입력하세요.");
            int check = sc.nextInt();
            if(check != 0 && check != 1) {
                System.out.println("다시 입력하세요.");
            }
            if(check == 0) {
                break;
            }
        }
        //성적 계산
        int sum = 0;
        int avg;
        for(Grade grade : grades) {
            if(grade.getScore() < 30) {
                System.out.println(grade.getSubject() + " : F");
            }else if(grade.getScore() < 60){
                System.out.println(grade.getSubject() + " : D");
            }else if(grade.getScore() < 80){
                System.out.println(grade.getSubject() + " : C");
            }else if(grade.getScore() < 95){
                System.out.println(grade.getSubject() + " : B");
            }else{
                System.out.println(grade.getSubject() + " : A");
            }
            sum += grade.getScore();
        }
        avg = sum / grades.size();

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);


    }
}
