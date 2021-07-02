import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        String password = "qwerty";
        Scanner scanner = new Scanner(System.in);

        System.out.println("비밀번호를 입력해주세요");
        String input = scanner.nextLine();

        while (input.equals(password)!= true){
            System.out.println("비밀번호를 잊으셨나요?");
            input = scanner.nextLine(); // 비밀번호 true일 때까지 다시 입력
        }
        System.out.println("로그인");

   }
}
