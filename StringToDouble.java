import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("달러 환율을 입력하세요");
        try {
            String exchangeString = scanner.nextLine();
            System.out.println("순대국 값을 입력하세요");
            String priceString = scanner.nextLine();
            double exchangeDouble = Double.parseDouble(exchangeString);
            double priceDouble = Double.parseDouble(priceString);
            System.out.println("순대국 가격은" + priceDouble / exchangeDouble);
        } catch (Exception e) {
            System.out.println("숫자를 입력하세요");
        }
    }
}
