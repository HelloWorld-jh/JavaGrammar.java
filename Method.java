public class Method {
    public static void main(String[] args) {
        sayHello();
        sayHelloTo("Chicken"); // 메서드 내 인자 = argument
        // 메소드 호출하면서 입력한 값들은 메소드 내 인자로 전달
        // 메소드 내 괄호 안에서 변수로 사용하게 됨
        printSum(3, 5);
        int returnSumValue = returnSum(2, 4); // 반환값 저장 변수
        System.out.println(returnSumValue);

        int[] sumProduct = addAndMuliply(2, 3);
        System.out.println("sum: " + sumProduct[0]);
        System.out.println("product: " + sumProduct[1]);

        sayHola("바보");
        sayHola("주형");
        boolean booleanTypeMethod = sayHolla("바보");

    }


    //타입 리턴타입 메스드명(아규먼트 타입 아규먼트)
    public static void sayHelloTo(String name) {
        System.out.println("Hello, " + name);
    }

    public static void sayHello() { //메소드명(메소드 호출)
        System.out.println("hello!");
    }

    public static void printSum(int a, int b) {
        System.out.println(a + "+" + b + "=" + returnSum(a, b));
    }

    public static int returnSum(int a, int b) { // 메서드 반환 함수
        return a + b;
    }

    public static int[] addAndMuliply(int a, int b) { // 더한값과 곱한 값 반환 배열 메서드
        int sum = a + b;
        int product = a * b;

        int[] result = {sum, product};
        return result;
    }
    public static void sayHola(String name){
        if(name.equals("바보")){
            System.out.println("바르고 고운 말을 사용하세요");
            return;
        }else {
            System.out.println(name + "님, 안녕하세요?");
        }
    }
    /*
    인사를 했다면 true 그렇지 않다면 false 반환
     */
    public static boolean sayHolla(String name){
        if(name.equals("바보")){
            System.out.println("바르고 고운 말을 사용하세요");
            return false;
        }
        System.out.println(name + "님 안녕하세요?");
        return true;
    }




}
