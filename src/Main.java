import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int[] arrCel = new int[3];
        arrCel[0] = 1;
        arrCel[1] = 2;
        arrCel[2] = 3;
        System.out.println(arrCel[0]);
        System.out.println(arrCel[1]);
        System.out.println(arrCel[2]);
        float[] arrDrob = {1.57f, 7.654f, 9.986f};
        System.out.println(arrDrob[0]);
        System.out.println(arrDrob[1]);
        System.out.println(arrDrob[2]);
        double[] arrAll = {13, 1.96, 18, 34.5};
        System.out.println(arrAll[0]);
        System.out.println(arrAll[1]);
        System.out.println(arrAll[2]);
        System.out.println(arrAll[3]);

        //Задание 2
        for (int i = 0; i < arrCel.length; i++) {
            System.out.print(arrCel[i]);
            if (i >= 0 && i!=2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrDrob.length; i++) {
            System.out.print(arrDrob[i]);
            if (i >= 0 && i!=2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrAll.length; i++) {
            System.out.print(arrAll[i]);
            if (i >= 0 && i!=3) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 3
        for (int i = arrCel.length - 1; i >= 0; i--) {
            System.out.print(arrCel[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrDrob.length - 1; i >= 0; i--) {
            System.out.print(arrDrob[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrAll.length - 1; i >= 0; i--) {
            System.out.print(arrAll[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 4
        int[] arr = {1,2,3};
        if (arr[0] % 2  == 0 ) {
            System.out.println("чётное ==> " + arr[0]);
        } else {
            arr[0]++;
            System.out.println("теперь чётное ==> " + arr[0]);
        }
        if (arr[1] % 2  == 0 ) {
            System.out.println("чётное ==> " + arr[1]);
        } else {
            arr[1]++;
            System.out.println("теперь чётное ==> " + arr[1]);
        }
        if (arr[2] % 2  == 0 ) {
            System.out.println("чётное ==> " + arr[2]);
        } else {
            arr[2]++;
            System.out.println("теперь чётное ==> " + arr[2]);
        }
        System.out.print(" " + arr[0]);
        System.out.print(", " + arr[1]);
        System.out.print(", " + arr[2]);
    }
}