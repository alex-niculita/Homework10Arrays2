import java.util.Random;

public class Main {
    public static final int DAYS_IN_MONTH = 30;

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        System.out.println("#1 Sum of all payments:");
        task1(arr);
        System.out.println();

        System.out.println("#2 Print min and max:");
        task2(arr);
        System.out.println();

        System.out.println("#3 Print median:");
        task3(arr);
        System.out.println();

        char[] arr1 = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println("#4 Reverse name letters:");
        task4(arr1);
        System.out.println();

    }

    public static int task1(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("\tСумма трат за месяц составила "+sum+" рублей");
        return sum;
    }

    public static void task2(int[] arr) {
        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("\tМинимальная сумма трат за день составила "+min+" рублей. " +
                "\n\tМаксимальная сумма трат за день составила "+max+" рублей");

    }

    public static void task3(int[] arr) {
        System.out.printf("\t%.2f%n",((double) task1(arr)/DAYS_IN_MONTH));
    }

    public static void task4(char[] arr) {
        System.out.print("\t");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
    public static int[] generateRandomArray(){
        Random random = new Random();
        int[] arrRnd = new int[DAYS_IN_MONTH];
        for (int i = 0; i < DAYS_IN_MONTH; i++) {
            arrRnd[i] = random.nextInt(100_000)+100_000;
            System.out.println(arrRnd[i]);
        }

        return arrRnd;
    }

}