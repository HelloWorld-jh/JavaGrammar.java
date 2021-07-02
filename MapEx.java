import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx {
    public static void main(String[] args) {
        //Map<key, value> in util package, 리스트와 조금 다른 제네릭 형식
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("chicken","닭");
        dictionary.put("hippo","하마");

        dictionary.remove("chicken");
        if(dictionary.isEmpty()){
            System.out.println("단어 목록이 비어있습니다");
            System.exit(0);//비어있을시 종료
        }else{
            System.out.println(dictionary.size()+" 개의 단어가 있습니다");
        }


        Scanner scanner = new Scanner(System.in);
        String english = scanner.nextLine(); //영단어/문장 입력
        String korean = dictionary.get(english); // 사용자 입력 문자열을 키로 사용해 가져옴

        if (korean == null){
            System.out.println("사전에 존재하지 않는 단어입니다");
        }else{
            System.out.println(english+"는 "+korean+" 입니다.");
        }

    }
}
