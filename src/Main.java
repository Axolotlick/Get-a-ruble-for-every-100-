public class Main {
    public static void main(String[] args) {
        int account = 0;
        int refill = 10;
        int miles;

        if (refill > 1000) {
            miles = refill / 100;
        } else {
            miles = 0;
        }

        int total = account + refill + miles;
        System.out.println(total);

    }
}
