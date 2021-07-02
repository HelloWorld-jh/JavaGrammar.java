public class Continue {
    public static void main(String[] args) {
        for (int i=0; i<10; i+=1){
            if (i%2==0){ // 짝수 제외
                continue;
            }
            System.out.println(i);
        }
    }
}
