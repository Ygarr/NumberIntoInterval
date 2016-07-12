package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
     /*
        4.  Создать программу, которая будет проверять попало ли случайно выбранное из отрезка
         [5;155] целое число
          в интервал (25;100) и сообщать результат на экран.
                Примеры работы программы:
        Число 113 не содержится в интервале (25,100)
        Число 72 содержится в интервале (25,100)
        Число 25 не содержится в интервале (25,100)
        Число 155 не содержится в интервале (25,100)
    */

        int min_occ_num = 5, max_occ_num = 155;
        int randresTime = 0, randresMath = 0;
        
        while(true) {

            randresTime = randomizeTime(min_occ_num, max_occ_num);
            randresMath = randomizeMath(min_occ_num, max_occ_num);

            System.out.println("Occasional num by time  = " + randresTime);//Число 113 не содержится в интервале (25,100)
            System.out.println("Occasional num by math = " + randresMath );
            System.out.println("Число " + randresTime + ((25 < randresTime && randresTime< 100) ? " содержится в интервале (25,100)" : " не содержится в интервале (25,100)" ) );
            System.out.println("Число " + randresMath + ((25 < randresMath && randresMath< 100) ? " содержится в интервале (25,100)" : " не содержится в интервале (25,100)" ) + "\n");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


    private static int randomizeMath(int min, int max) {
                        max -= min;
                return (int) (Math.random() * ++max) + min; //Вместо приведения можно Math.round,но медленнее

    }

    private static int randomizeTime(int min, int max) {
        return new Random(System.currentTimeMillis()).nextInt((++max) - min) + min;//число 155 включительно. Почему -5?
    }



    }


