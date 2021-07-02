import java.util.Random;
import java.util.Scanner;
/*
프로그램의 세세한 로직은 별개의 메서드로 빼버리고
메인 메서드에서는 전체적인 프로그램의 흐름만 관리하도록 만들면 흐름파악&관리에 용이하다
*/

public class MethodUpAndDown {
    public static int randomNumber;
    public static Scanner scanner = new Scanner(System.in);
    // 재사용 할 수 있는 멤버변수 랜덤, 스캐너 생성

    public static void main(String[] args) {
        Random random = new Random();
        randomNumber = random.nextInt(256); //랜덤변수 초기화

        int attempt = 0; // 시도횟수
        while(attempt<8){
            boolean isCorrect = play(); // 입력숫자와 랜덤숫자 일치여부 확인하는 boolean 메서드
            if(isCorrect){
                break; // true이면 종료
            }
            attempt += 1;
            System.out.println(attempt+"회 시도하셨습니다");

        }
    }
    public static boolean play(){
        System.out.println("숫자를 입력하세요");
        int input = scanner.nextInt();
        if(input == randomNumber){
            System.out.println("짝짝짝. 정답입니다");
            return true; // 일치할 경우 true
        }else if(input > randomNumber){
            System.out.println("Down");
        }else {
            System.out.println("Up");
        }
        return false; // 일치하지 않을 경우 모두 false
    }

}
