import java.util.Scanner;

public class MonthToString {
    public static void main(String[] args) {
        System.out.println("월을 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int month;

        try{
            String input = scanner.nextLine();
            month = Integer.parseInt(input); // 사용자 입력 문자 형변환 시도
        }catch (Exception e){
            month = -1; // 실패시 -1 대입
        }
        if (month ==1) {
            System.out.println("January");
        }else if (month ==2){
            System.out.println("February");
        }else{
            System.out.println("1과 2만 입력할 수 있습니다");
        }
    }
}
