public class multiple2 {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 0; i < 1000; i = i + 3) {
            sum = sum + i;
        }
        for (int i = 0; i < 1000; i = i + 5) {
            sum = sum + i;
        }
        for (int i = 0; i < 1000; i = i + 15) {
            sum = sum - i;
        }
        System.out.println("The sum of the multiples of 3 or 5 is = " + sum);
    }
}
