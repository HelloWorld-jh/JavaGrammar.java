public class ForEach {
    public static void main(String[] args) {
        /*for (type(자료형) element(현재 요소 지칭명) : array(배열){
            실행할 코드
        }*/
        String[] days = {"월","화","수","목","금","토","일"};
        for (String day : days){
            System.out.println(day + "요일");
        }
    }
}
