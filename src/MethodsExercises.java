public class MethodsExercises {


    public static int addition(int x, int y){
        return x + y;
    }
    public static int subtraction(int x, int y){
        return x - y;
    }
    public static int multiplication(int x, int y){
//        int total = 0;
//        while (x > 0) {
//            total += y;
//            x--;
//        }
        int total = 0;
        for (int i = 0; i < y; i++) {
           total += x;
        }
        return total;
    }
    public static int division(int x, int y){
        return x / y;
    }
    public static int modulus(int x, int y){
        return x % y;
    }


    public static void main(String[] args) {
        System.out.println(addition(10, 10));
        System.out.println(subtraction(10, 10));
        System.out.println(multiplication(50, 10));
        System.out.println(division(10,10));
        System.out.println(modulus(10, 2));
    }
}
