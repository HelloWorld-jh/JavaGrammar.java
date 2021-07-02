import javax.swing.*;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("숫자입력");
        Scanner scanner = new Scanner((System.in));
        String intInput = scanner.nextLine();
        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println(intValue +1);
        }catch (Exception e){ // Exception e == 표준타입 exception
            System.out.println("숫자를 입력해야 합니다"); //예를들어 "오백" 입력 경우

        }

    }
}
