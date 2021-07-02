public class WrapperTypes {
    public static void main(String[] args) {
        Integer integerNumber = 3;
        Long longNumber = 3L;
        Float floatNumber = 3.0f;
        Double doubleNumber = 3.0d;
        Boolean booleanValue = true;

        float convert1 = integerNumber.floatValue(); //3.0f
        double convert2 = integerNumber.doubleValue(); //3.0d
        String convert3 = integerNumber.toString(); //"3"
    }
}
