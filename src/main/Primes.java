package main;

public class Primes {

    public static void main(String[] args) {
        for (int i = 1 ; i < 101 ; i++){
            if(isPrime(i) == true){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n >= 1) {

            for (int i = 1; i < n; i++) {
                if (i % n == 0) {
                    return false;
                }
            }
            return true;
        }else{
            //ненатуральные числа (отрицательные и 0)
            return false;
        }
    }
}
