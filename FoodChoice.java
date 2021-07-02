import java.util.Scanner;

public class FoodChoice {
    public static void main(String[] args) {
        System.out.println("메뉴 번호를 입력해주세요");
        System.out.println("1. 치킨");
        System.out.println("2. 순대국");
        System.out.println("3. 소고기");

        Scanner scanner = new Scanner(System.in);
        int menu;

        try {
            menu = scanner.nextInt();
        }catch (Exception e){
            menu = -1;
        }
        switch (menu){
            case 1:
                System.out.println("2만원입니다");
                break;
            case 2:
                System.out.println("8천원입니다");
                break;
            case 3:
                System.out.println("15000원입니다");
                break;
            default:
                System.out.println("올바른 메뉴 번호를 입력해주세요");
                break;
        }
    }
}
