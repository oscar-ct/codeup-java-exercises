import java.util.Arrays;

public class Practice {

    public static int subtractTen(int num) {
        return num - 10;
    }

    public static int[] average (int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return new int[]{sum / numbers.length};
    }

    public static void main(String[] args) {

        int[] numbers = {50, 50, 100, 100, 500};
        System.out.println(Arrays.toString(average(numbers)));

        System.out.println(subtractTen(20));




    }
}
