//Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//** Задать одномерный массив и найти в нем минимальный и максимальный элементы;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("Task 1: ");
        taskOne();

        System.out.println("Task 2: ");
        taskTwo();

        System.out.println("Task 3: ");
        taskThree();

        System.out.println("Task 4: ");
        taskFour();

        System.out.println("Task 5: ");
        taskFive();


    }

    public static void taskOne() {
        int [] one = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < one.length; i++){
            if (one[i] == 0) {
                one[i] = 1;
            } else {
                one[i] = 0;
            }
        }
        System.out.println(Arrays.toString(one));
    }

    public static void taskTwo(){
        int [] two = new int [8];

        for (int i = 0, j = 0; i < two.length; i++, j += 3){
           two[i] = j;
        }
        System.out.println(Arrays.toString(two));
    }

    public static void taskThree(){
        int [] three = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for (int i = 0; i < three.length; i++ ){
            if (three[i] < 6){
                three[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(three));
    }

    public static void taskFour() {
        int[][] four = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                    if ((i == j) || (i == 5 - 1 - j)) {
                        four[i][j] = 1;
                    }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                    System.out.print(four[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void taskFive(){
        int [] five = {2, 10, 13, 25, 6, 1, 18};
        int minValue = five[0];
        int maxValue = five[0];

        for (int i = 0; i < five.length; i++){
            if (five[i] > maxValue){
                maxValue = five[i];
            } else if (five[i] < minValue){
                minValue = five[i];
            }
        }
        System.out.println("Минимальное значение: " + minValue + ", " + "максимальное значение: " + maxValue);
    }


}

