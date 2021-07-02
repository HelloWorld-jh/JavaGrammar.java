import java.util.ArrayList;
import java.util.List;
/*
List가 배열보다 편한 이유는 요소를 추가 제거하는데 편하고 여러 메서드가 제공됨
* */

public class ListEx {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("chicken");
        list.add("피자");
        list.add("noodle");
        //list.remove("chicken");
        //list.remove(1); // 요소 제거방법 두가지

        list.set(1, "pizza"); //요소변경 set(위치, 값)
        boolean containsChicken = list.contains("chicken"); // contains(값)list내 특정값 찾는 메서드

        String food01 = list.get(0); // get(위치)인덱스추출
        System.out.println(food01);
        System.out.println(containsChicken);

    }
}
