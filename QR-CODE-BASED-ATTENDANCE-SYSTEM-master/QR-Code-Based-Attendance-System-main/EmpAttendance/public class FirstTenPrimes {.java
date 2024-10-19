
public class firstprimenumber {


    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 10) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
