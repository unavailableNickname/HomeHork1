import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        //1
        int arrayOf0And1[] = {1, 1, 0, 1, 0, 0, 0, 1, 1, 0};
        for (int i = 0; i < arrayOf0And1.length; i++) {
            if (arrayOf0And1[i] == 1) arrayOf0And1[i] = 0;
            else arrayOf0And1[i] = 1;
        }
        //2
        int emptyArray[] = new int[8];
        emptyArray[0] = 0;
        for (int k = 1; k < emptyArray.length; k++) {
            emptyArray[k] = emptyArray[k - 1] + 3;
        }
        //3
        int randomNumbersArray[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j = 0; j < randomNumbersArray.length; j++) {
            if (randomNumbersArray[j] < 6) randomNumbersArray[j] *= 2;
        }
        //4
        int squareArray[][] = new int[3][3];
        int x1 = 0, y1 = 0, x2 = squareArray.length - 1, y2 = 0;
        while (x1 < squareArray.length) {
            squareArray[x1][y1] = 1;
            squareArray[x2][y2] = 1;
            x1++;
            y1++;
            x2--;
            y2++;
        }

        //5
        int simpleArray[] = new int[20], min = 1000, max = -1, minPos = 0, maxPos = 0;

        for (int i = 0; i < simpleArray.length; i++) {
            simpleArray[i] = (int) (Math.random() * 100);
            if (simpleArray[i] > max) {
                max = simpleArray[i];
                maxPos = i;
            } else if (simpleArray[i] < min) {
                min = simpleArray[i];
                minPos = i;
            }
        }
        //6
        int sumOfSidesArray[] = new int[(int) (Math.random() * 5) + 2];
        for (int i = 0; i < sumOfSidesArray.length; i++) sumOfSidesArray[i] = (int) (Math.random() * 10);
        for (int element : sumOfSidesArray) System.out.print(element + " ");
        System.out.println(sumOfSides(sumOfSidesArray));

        //7
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов в массиве");
        int n1 = scanner.nextInt();
        int moovingArray[] = new int[n1];
        for (int i = 0; i < moovingArray.length; i++) {
            moovingArray[i] = i;
        }

        System.out.println("Введите n");
        int n2 = scanner.nextInt();
        scanner.close();
        for (int element : moovingArray) System.out.print(element + " ");
        System.out.println();
        toMoveArray(moovingArray, n2);

    }

    //6
    public static boolean sumOfSides(int array[]) {
        int leftSum = 0, fullSum = 0;
        for (int element : array) fullSum += element;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            fullSum -= array[i];
            if (fullSum == leftSum) return true;
        }
        return false;
    }

    //7
    public static void toMoveArray(int[] array, int n) {
        int nextValue, pastValue = array[0], pos = 0, controlNumber;
        if (array.length % 2 != 0)
            for (int i = 0; i < array.length; i++) {

                int deltaPos = (array.length + pos + n) % (array.length);
                nextValue = array[deltaPos];
                array[deltaPos] = pastValue;
                pastValue = nextValue;
                pos = deltaPos;
                for (int element : array) System.out.print(element + " ");
                System.out.println();
            }
        else {
            //не получилось, возможно предыдущее тоже :(
        }
    }


}

