package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int b;
        int count = 0;
        b = x + y;
        if (b == 0){
            count = 1;
        }
        while (b > 0){
            b /= 10;
            count +=1;
        }
        while (b < 0){
            b /= 10;
            count += 1;

        }


        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
