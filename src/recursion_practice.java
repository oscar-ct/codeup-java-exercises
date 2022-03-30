public class recursion_practice {

    // TODO: use recursion to print out a given number up through 100

//    public static int countTo100(int num) {
//        System.out.println(num);
//        if (num == 100){
//            return num;
//        }
//        return countTo100(num + 1);
//    }
//
//    public static void main(String[] args) {
//        countTo100(0);
//    }
//}


    // TODO: use recursion to add all numbers up from 1 to a given number

    public static int countTo100(int num) {
        if (num == 1){
            return num;
        }
        return num + countTo100(num  - 1);
    }

    public static void main(String[] args) {
        System.out.println(countTo100(10));
    }
}
