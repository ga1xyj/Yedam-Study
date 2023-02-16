import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    1~45안에서 입력할 수 있다.
    숫자는 한 번만 쓸 수 있다.(중복 숫자 허용 X)
    
    --lottoNUM 맨 앞에 Null 없애기 OK
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lottoNum = "";
        String space = " ";
        int matchCount = 0; // 일치하는 개수

        String[] array = new String[7]; //랜덤 로또번호 담을 배열
        String[] inputArray = new String[7]; //내가 입력한 로또번호 담을 배열

        //랜덤 로또번호 생성기
        for (int i = 0; i < 7; i++) {
            array[i] = Integer.toString((int) ((Math.random() * (45 - 1)) + 1));
            String strNum = array[i];
            lottoNum += strNum;
            if (i != 6) {
                lottoNum += space;
            }
        }
        System.out.println("로또번호:" + lottoNum); //String변환

        Boolean check = false;
        System.out.println("숫자 1~45 중 원하시는 번호 6개를 공백(1칸)으로 구분하여 입력해주세요");

        while (!check) {
            String inputNum = br.readLine(); //번호 입력받기
            StringTokenizer st = new StringTokenizer(inputNum); //입력받은 번호 공백으로 자르기

            if (st.countTokens() != 7) { //입력받은 번호가 7개가 아니면 리턴
                System.out.println("입력한 숫자의 개수를 다시 확인해주세요!");
                continue;
            }

            for (int i = 0; st.hasMoreTokens(); i++) { //자른 토큰값 배열에 담기
                inputArray[i] = st.nextToken();
                System.out.println("입력한로또번호=> " + inputArray[i]);
            }

            for (int i = 0; i < inputArray.length; i++) { //입력한 값이 유효숫자 범위가 아니면 리턴
                if (Integer.parseInt(inputArray[i]) < 0 && Integer.parseInt(inputArray[i]) > 45) {
                    System.out.println("유효한 숫자가 아닙니다.\n 다시 확인해주세요!");
                    continue;
                } else {
                    for (String str : array) {
                        if (str.equals(inputArray[i])) {
                            matchCount++; //생성한 번호가 인풋번호와 매치되면 카운트
                        }
                    }
                }
            }
            //7개면 아래 실행


            for (int i = 0; i < inputArray.length; i++) { //배열 돌리면서 랜덤 로또번호안에 값이 있는지 비교
                for (String str : array) {
                    if (str.equals(inputArray[i])) {
                        matchCount++; //생성한 번호가 인풋번호와 매치되면 카운트
                    }
                }
            }

            if (matchCount < 3) {
                System.out.println("꽝!\n일치하는 번호 개수는 " + matchCount + "개 입니다.");
            } else if (matchCount == 3) {
                System.out.println("5,000원 당첨!");
            } else if (matchCount == 4) {
                System.out.println("50,000원 당첨!");
            } else if (matchCount == 5) {
                System.out.println("5,000,000원 당첨!");
            } else if (matchCount == 6) {
                System.out.println("50,000,000원 당첨!");
            } else if (matchCount == 7) {
                System.out.println("1,000,000,000원 당첨!");
            }
            break;
        }
    }

}
