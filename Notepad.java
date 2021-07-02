import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("원하는 작업 번호를 입력해주세요");
            System.out.println("1. 메모 읽기");
            System.out.println("2. 새 메모");
            System.out.println("3. 종료");

            int taskNum; // 입력받은 작업 번호 저장 변수

            try{
                String input = scanner.nextLine();
                taskNum = Integer.parseInt(input); // 정수형 변환

            }catch (NumberFormatException e){
                System.out.println("잘못된 입력입니다"); // 예외 처리는 건너뜀
                continue;
            }
            //사용자가 정확한 작업번호 입력할 경우
            if (taskNum == 1){
                System.out.println("읽고 싶은 파일명을 입력하세요");
                String fileName = scanner.nextLine(); //입력받은 파일명 저장 변수
                FileInputStream inputStream = null;
                try { //파일 읽기
                    inputStream = new FileInputStream(fileName);
                } catch (FileNotFoundException e) {
                    System.out.println("파일이 존재하지 않습니다");
                    continue; // 오류 건너뜀
                }
                System.out.println(fileName + "의 내용을 출력합니다"); // 안내
                Scanner reader = new Scanner(inputStream);
                while (reader.hasNextLine()){ // 파일 한 줄씩 읽어서 출력
                    System.out.println(reader.nextLine());
                }
                System.out.println("\n"); //줄바꿈
                reader.close(); //FileInputStream 닫기
            }else  if(taskNum == 2){
                System.out.println("새 메모를 저장할 파일명을 입력하세요");
                String fileName = scanner.nextLine();
                FileWriter writer = null;
                try{
                    writer = new FileWriter(fileName);
                } catch (IOException e) {
                    System.out.println("파일 생성 실패");
                    continue;
                }
                System.out.println("메모할 문자열을 입력하세요");
                System.out.println("종료하려면 빈 줄에서 엔터를 입력하세요");

                while (true){
                    String input = scanner.nextLine();
                    if(input.equals("")){
                        break;
                    }
                    try {
                        writer.write(input);
                        writer.write("\n");
                    } catch (IOException e) {
                        System.out.println("파일에 문자열을 입력하지 못했습니다");
                    }
                }
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("파일 닫기에 실패했습니다");
                }
            }else if(taskNum == 3){
                System.out.println("프로그램을 종료합니다");
                break;
            }else{
                System.out.println("잘못된 입력입니다");
            }
        }
    }
}
