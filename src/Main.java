import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Home Work 8. Array");
        System.out.println("");
        //Task 1
        System.out.println("Задача 1. Три массива с разными типами данных");
        int[] arrInt = new int[3];
        //arrInt[0] = 1;
        //arrInt[1] = 2;
        //arrInt[2] = 3;
        for (int index=0; index<arrInt.length; index++) {
            arrInt[index]=index+1;
        }
        double[] arrDouble = {1.57, 7.654, 9.986};
        short[] arrShort = {12, 42, 92};
        System.out.println("");
        //Task 2
        System.out.println("Задача 2. Вывод массивов в консоль");
        for (int index = 0; index < arrInt.length; index++) {
            if (index == arrInt.length - 1) {
                System.out.println(arrInt[index]);
                break;
            }
            System.out.print(arrInt[index] + ",");
        }
        for (int index = 0; index < arrDouble.length; index++) {
            if (index == arrDouble.length - 1) {
                System.out.println(arrDouble[index]);
                break;
            }
            System.out.print(arrDouble[index] + ",");
        }
        for (int index = 0; index < arrShort.length; index++) {
            if (index == arrShort.length - 1) {
                System.out.println(arrShort[index]);
                break;
            }
            System.out.print(arrShort[index] + ",");
        }
        System.out.println("");
        //Task 3
        System.out.println("Задача 3. Вывод массивов в консоль в обратном порядке");
        for (int index = arrInt.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arrInt[index]);
                break;
            }
            System.out.print(arrInt[index] + ",");
        }
        for (int index = arrDouble.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arrDouble[index]);
                break;
            }
            System.out.print(arrDouble[index] + ",");
        }
        for (int index = arrShort.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arrShort[index]);
                break;
            }
            System.out.print(arrShort[index] + ",");
        }
        System.out.println("");
        //Task 4
        System.out.println("Задача 4. Нечётные в чётные");
        System.out.println("Имеем изначальный массив:");
        System.out.println(Arrays.toString(arrInt));
        System.out.println("Массив после преобразования переменных:");
        if (arrInt[0]%2!=0) {
            arrInt[0]=arrInt[0]+1;
        } else {
            arrInt[0] = arrInt[0];
        }
        if (arrInt[1]%2!=0) {
            arrInt[1]=arrInt[1]+1;
        } else {
            arrInt[1]=arrInt[1];
            }
        if (arrInt[2]%2!=0) {
            arrInt[2] = arrInt[2] + 1;
            }
        
        System.out.println(Arrays.toString(arrInt));
    }
}