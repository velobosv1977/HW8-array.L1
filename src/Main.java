public class Main {
    public static void main(String[] args) {
        System.out.printf("Home Work 8. Array");
        System.out.println("");
        //Task 1
        System.out.println("Задача 1. Три массива с разными типами данных");
        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
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
        for (int index1=0; index1<arrDouble.length; index1++) {
            if (index1==arrDouble.length - 1) {
                System.out.println(arrDouble[index1]);
                break;
            }
            System.out.print(arrDouble[index1] + ",");
        }
        for (int index2=0; index2<arrShort.length; index2++) {
            if (index2==arrShort.length - 1) {
                System.out.println(arrShort[index2]);
                break;
            }
            System.out.print(arrShort[index2] + ",");
        }
    }
}