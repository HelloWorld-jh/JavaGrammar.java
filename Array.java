import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //배열 선언방법 == 자료형[] 선언명
        String[] days = {"월","화","수","목","금","토","일"};
        int lenDays = days.length; //7
        System.out.println(lenDays);
        days[0] = "짜증나는 월"; // 배열 값 변경

        //활용
        for (int i=0; i<lenDays; i+=1){
            System.out.println(days[i] + "요일");
        }
        // days값을 가지면서 8번째 값도 가지는 배열을 복사
        String[] days2 = Arrays.copyOf(days,8);

//        for (int i=0; i<days2.length; i+=1){
//            System.out.println(days[i] + "요일"); //.ArrayIndexOutOfBoundsException
//        }

        System.out.println(days); //[Ljava.lang.String;@41629346
        System.out.println(Arrays.toString(days)); // 정상출력





    }
}
