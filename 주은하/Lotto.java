package 주은하;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        //로또번호 생성
        Random random = new Random();
        HashSet<Integer> lottoNum = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            lottoNum.add(random.nextInt(45) + 1);
        }
        //로또번호 입력
        System.out.print("로또 번호를 입력해 주세요.");
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> myNum = new HashSet<>();
        while(true) {
            int num = sc.nextInt();
            //중복 방지
                for (int n : myNum) {
                    if (n == num) {
                        System.out.println("중복된 번호를 입력하였습니다.");
                    } else {
                        myNum.add(num);
                    }
                }
                //1~45 입력
            if(num < 0 || num > 45) {
                System.out.println("중복된 번호를 입력하였습니다.");
            }else {
                myNum.add(num);
            }

            if(myNum.size()==6) {
                break;
            }
        }
        //로또번호 비교
        System.out.println("당첨 번호 : "+lottoNum);
        lottoNum.addAll(myNum);
        int result = 12-lottoNum.size();
        System.out.println("맞은 개수는 "+result+"개 입니다.");
    }
}