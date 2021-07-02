import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
Map은 키와 값으로 이루어진 쌍의 목록 Series
 */
public class MapLoop {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("chicken", "닭");
        dictionary.put("hippo", "하마");

        if (dictionary.isEmpty()) {
            System.out.println("HashMap: 단어 목록이 비어있습니다");
            System.exit(0);//비어있을시 종료
        } else {
            System.out.println(dictionary.size() + " 개의 단어가 있습니다(HashMap)");
        }

        Collection<String> keys = dictionary.keySet(); // 문자열 콜렉션에서 키 요소만 목록으로 가져오는 형식
        for (String english : keys) {
            String korean = dictionary.get(english);
            System.out.println("Collection: " + english);
            System.out.println("Collection: " + korean);
        }
        Collection<String> values = dictionary.values(); // 문자열 콜렉션에서 키 요소만 목록으로 가져오는 형식
        for (String korean : values) {
            System.out.println("Collection: " + korean);
        }

        //set을 반환하는 파일: type entry(키:값 의 쌍) in util.Map
        Set<Map.Entry<String, String>> entries = dictionary.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String english = entry.getKey(); // key 출력
            String korean = entry.getValue(); //valeu 출력

            System.out.println("entrySet(): "+ english + ":" + korean);

        }
    }
}
