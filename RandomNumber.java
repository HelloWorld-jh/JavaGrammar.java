import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randNumber = random.nextInt(256); // 0~256범위의 랜덤 정수 호출

        System.out.println(randNumber);

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<8; i+=1){
            System.out.println(8-i+ "번의 기회가 남았습니다");
            System.out.println("0~256사이의 숫자를 입력해보세요");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);

            if(randNumber==number){
                System.out.println("짝짝짝. 정답입니다");
                break;
            }else if(randNumber<number){
                System.out.println("Down");
            }else{
                System.out.println("Up");
            }
            if(i==7){
                System.out.println("기회를 모두 사용하셨습니다");
            }
        }
    }


}
