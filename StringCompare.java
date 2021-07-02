import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        String a = "치킨";
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();

        System.out.println(a.equals(b)); // StringCompare equals o, == x
        //java는 문자열 비교시 값을 직접 비교하는게 아닌
        //메모리 상에서 값이 저장된 위치를 비교함
    }
}
