package 주은하;

import java.io.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) throws IOException {
        //로또번호 생성
        Random random = new Random();
        Set<Integer> lottoNum = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            lottoNum.add(random.nextInt(45) + 1);
        }
        //로또번호 입력
        System.out.print("로또 번호를 입력해 주세요.");
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> myNum = new HashSet<>();
        while (true) {
            //값 입력 받음
            int num = sc.nextInt();

            //1~45 입력
            if (num < 0 || num > 45) {
                System.out.println("1~45 사이의 번호를 입력해 주세요.");
            } else {
                //중복 알려주기
                for (int n : myNum) {
                    if (n == num) {
                        System.out.println("중복된 번호를 입력하였습니다.");
                    }
                }
                myNum.add(num);
            }
            if (myNum.size() == 6) {
                break;
            }
        }
        System.out.println("당첨 번호 : " + lottoNum);
        System.out.println("입력 번호 : " + myNum);

        //로또번호 비교
        lottoNum.addAll(myNum);
        int result = 12 - lottoNum.size();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        sb.append("맞은 개수는 " + result + "개 입니다.");
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}