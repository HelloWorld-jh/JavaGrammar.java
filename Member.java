import java.util.Scanner;

public class Member {
    //스캐너를 메서드 밖에서 선언하면 각 메서드 별로 사용가능(스캐너 선언 중복제거)
    public static Scanner scanner = new Scanner(System.in); //멤버변수
    public static void main(String[] args) {
        echoString();
    }
    public static void echoString(){
        String input = scanner.nextLine();
        System.out.println(input);
    }

}

