import javax.swing.*;
import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        System.out.println("숫자입력");
        Scanner scanner = new Scanner((System.in));
        String intInput = scanner.nextLine();
        int intValue = Integer.parseInt(intInput);
        System.out.println(intValue +1);
    }
}
