import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner;
        /* ***값을 정하기 애매한 타입의 값을 생성하기 위해 new사용
        new 뒤에 타입명(파라미터) */
        scanner = new Scanner(System.in); // System.in = 표준입력 인터페이스
        String input = scanner.nextLine(); //nextline = String타입
        System.out.println(input);

    }
}
