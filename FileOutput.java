import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
             writer = new FileWriter("src/output.txt", true); // true ==append
        } catch (IOException e) {
            System.out.println("파일 생성에 실패");
            System.exit(1); //exit(0)정상종료 o, exit(1) 정상종료x
        }
        //사용자 입력 파일 만들기
        Scanner scanner = new Scanner(System.in);
        System.out.println("종료하려면 입력 없이 엔터");
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                System.out.println("파일 입력을 종료합니다");
                break;
            }

            try {
                writer.write(input + "\n");

            } catch (IOException e) {
                System.out.println("파일에 데이터를 쓰는 데에 실패했습니다");
                System.exit(2);
            }
        }
        try {
            writer.close(); // 파일 내용 저장후 닫기
        } catch (IOException e) {
            System.out.println("파일 닫기에 실패했습니다");
        }

    }
}
