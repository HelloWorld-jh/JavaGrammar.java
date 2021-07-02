import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileinput {
    public static void main(String[] args) {
        FileInputStream inputStream = null; //try밖에서 선언
        //파일 읽기
        try {
            inputStream = new FileInputStream("src/chicken.txt");
        } catch (FileNotFoundException e) { // 파일 못찾음 오류
            e.printStackTrace(); //printStackTrace == 에러를 출력
        }
        //파일 쓰기(읽은 파일 안 문자열 입력&출력)
        Scanner scanner = new Scanner(inputStream);
        /*
        String text = scanner.nextLine();
        System.out.println(text);
        String text2 = scanner.nextLine();
        System.out.println(text2);
        String text3 = scanner.nextLine();
        System.out.println(text3); //없는 값 오류*/

        while (scanner.hasNextLine()) { //hasNextLine()==다음 줄이 있을 경우 출력
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}


