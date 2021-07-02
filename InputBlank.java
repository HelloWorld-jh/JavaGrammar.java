import java.util.Scanner;

public class InputBlank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next(); //next = 띄어쓰기 단위로 입력한 문자열들 분할해서 반환
        String input2 = scanner.next(); // "char char char char"입력시
        String input3 = scanner.next(); // 각 단어 분할 후 변수에 각각 입력됨
        String input4 = scanner.next();

        System.out.println(input);
        System.out.println(input2);
        System.out.println(input3);
        System.out.println(input4);
    }
}
