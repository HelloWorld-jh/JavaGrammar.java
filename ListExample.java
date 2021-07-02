import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("a","b","C","d"); // arrays의 aslist(): 배열을 리스트로 변환
        System.out.println(names);
        /*
        util패키지의 Set(제네릭 타입)
        List는 순서가 있고 중복값을 허용하지만
        Set은 순서가 없고 중복값을 허용하지 않는다
         */

        Set<String>foods = new HashSet<>();
        foods.add("a");
        foods.add("b");
        foods.add("c");
        foods.add("c");
        foods.add("c");
        foods.remove("a");
        foods.contains("c"); // 중복허용 x
        System.out.println(foods);

    }
}
