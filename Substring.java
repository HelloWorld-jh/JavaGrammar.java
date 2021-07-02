public class Substring {
    public static void main(String[] args) {
        String birthday = "1970/01/01";
        String year = birthday.substring(0,4); //substring(시작위치, 끝위치);
        String day = birthday.substring(8); //substring(시작위치); 끝까지 호출
        System.out.println(year);
        System.out.println(day);
    }
}
