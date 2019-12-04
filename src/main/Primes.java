package main;

public class Primes {

    public static void main(String[] args) {
        //перебираем числа от 1 до 100
        for (int i = 1 ; i <= 100 ; i++){
            //если число простое выводим его на экран
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        //проверка на то что число положительное
        if (n >= 1) {
            //цикл перебирающий числа от одного до n с шагом 1
            for (int i = 1; i < n; i++) {
                //проверка на деление без остатка
                if (i % n == 0) {
                    return false;
                }
            }
            //вернем true в случаях когда не попадаем в if который находится в цикле
            //в случаях когда значение не делится на аргумент без остатка => простое число
            return true;
        }else{
            //ненатуральные числа (отрицательные и 0)
            return false;
        }
    }
}
