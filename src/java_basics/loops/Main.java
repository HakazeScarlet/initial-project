package java_basics.loops;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = new int[6];
        arr1[0] = 2;
        arr1[1] = 3;
        arr1[2] = 4;
        arr1[3] = 1;
        arr1[4] = 8;
        arr1[5] = 7;

        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }
        System.out.println(max);

        System.out.println("-------");

        for (int i = 0; i < arr1.length/2; i++) {
            System.out.println(arr1[i]*2);
        }

        System.out.println("--------");

        for (int index = 0; index < arr1.length; index++) {
            System.out.println(arr1[index]);
        }

        System.out.println("------------");

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]*2);
        }

        System.out.println("------------------");

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.println(arr1[i]);
        }

        System.out.println("-----------");
    }
}
