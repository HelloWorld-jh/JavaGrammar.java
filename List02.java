import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class List02 {
    public static void main(String[] args) { // 중복되지 않는 음식 입력받아 리스트 저장 프로그램
        System.out.println("저장할 음식 입력(종료:0)");
        List<String> foods = new ArrayList<>(); // 문자열 리스트 생성
        Scanner scanner = new Scanner(System.in); // 사용자 입력 스캐너

        while(true){
            String food = scanner.nextLine();
            if(food.equals("0")){
                System.out.println("프로그램 종료");
                break;
           }
            if (foods.contains(food)){ //리스트내 동일값 탐색
                System.out.println("중복된 입력입니다");
            }else {
                foods.add(food);
            }

        }
        Collections.sort(foods); // collections에서 제공하는 오름차순sort
        Collections.reverse(foods);//내림차순(뒤집기)
        Collections.shuffle(foods); //요소 섞기
        System.out.println(foods);
        System.out.println(foods.get(0)); // suffle+get으로 리스트 랜덤 요소 추출
    }
}
