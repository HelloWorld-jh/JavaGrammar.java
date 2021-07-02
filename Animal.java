public class Animal { // 클래스의 중요한 기능1. 객체(object)생성
    // Animal cat = new Animal(); // new사용 하여 Animal클래스의 cat: 객체가 생성
    /*
    객체와 인스턴스의 차이는?
    cat=객체 : Animal의 인스턴스
    인스턴스 = 특정 객체가 어떤 클래스의 객체인지를 관계위주로 사용됨
    cat은 Animal의 인스턴스o
    cat은 Animal의 객체 x
     */
    String name; // 멤버변수: 클래스에 선언된 변수

    public static void main(String[] args) {
        Animal dog = new Animal();
        System.out.println(dog.name);
    }
}
