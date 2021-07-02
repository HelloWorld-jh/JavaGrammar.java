public class ForLoop {
    public static void main(String[] args) {
        for (int i=2; i<10; i++){
            for(int j=1; j<10; j++){
                int value = i*j;
                System.out.println(i + "x" + j + "=" + i*j);
            }
        }
    }
}
