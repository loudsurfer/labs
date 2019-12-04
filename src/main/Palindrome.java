package main;

public class Palindrome {
    public static void main(String[] args) {
        for (String arg : args) {
            String s = arg;

            if (isPalindrome(s)) {
                s += " палиндром";
            } else {
                s += " не палиндром";
            }

            System.out.print(s);
        }

    }

    private static boolean isPalindrome(String word){
        return word.equals(reverseString(word));
    }

    private static String reverseString(String word) {

        int i = 0;
        // -1 делаем для того чтобы не получить StringIndexOutOfBoundsException и не выйти за границу
        int wordLeangth = word.length() - 1;
        String reversedString = "";
        //выполняется пока количество итераций меньше длины строки
        while (i < word.length()){
            //конкатенируем строки, на каждой итерации добавляем символы исходной строки в обратном порядке
            // в строку которая находится в переменной reversedString
            reversedString += word.charAt(wordLeangth);
            i++;
            //с каждой итерацией смотрим на следующий символ в строке справа на лево
            wordLeangth--;
        }
        return reversedString;
    }
}
