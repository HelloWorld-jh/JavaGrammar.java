/*
Collection 프레임워크 == 배열처럼 데이터의 목록을 표현하고 다루는 인터페이스의 모음
1. List = 배열과 같은 순서를 가진 목록형 자료, 선언법이 조금 다름
* */

import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(); // 3가지 생성법 모두 동일
        List<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<>(); // 주로 사용

    }
}
