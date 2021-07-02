import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
ArrayList - 순서있는목록, 중복값허용, get으로 특정위치 요소 접근가능
HashSet - 순서없는 유일값 집합, 중복허용x, 특정위치 값 접근 불가
 */
public class CollectionLoop {
    public static void main(String[] args) {
        List<String> foods = new ArrayList<>(); // list생성
        foods.add("chicken");
        foods.add("pizza");
        foods.add("rice");
        for(String food : foods){ //  foods:array food:element in for each
            System.out.println(food + " is delicious");
        }

        if(foods.size()==0){ // size리스트 요소 개수 카운팅
            System.out.println("리스트가 비어있음");
        }else if(foods.isEmpty()){ // isEmpty():
            System.out.println("리스트가 비어있음");
        }else {
            System.out.println("리스트 요소 개수 " + foods.size());
        }
/*
Set도 동일
 */
        Set<String> meals = new HashSet<>();
        meals.add("breakfast");
        meals.add("launch");
        meals.add("dinner");
        for (String meal: meals){
            System.out.println("Did you had "+meal+"?");
        }
        if(meals.size()==0){ // size리스트 요소 개수 카운팅
            System.out.println("리스트가 비어있음");
        }else if(foods.isEmpty()){ // isEmpty():
            System.out.println("리스트가 비어있음");
        }else {
            System.out.println("리스트 요소 개수 " + meals.size());
        }


    }
}
