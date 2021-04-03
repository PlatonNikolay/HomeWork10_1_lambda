package home.work10.lambda;

import java.util.Scanner;

import static home.work10.lambda.CreatorArrays.getFilledArray;
import static home.work10.lambda.ProcessEnum.EVEN_OR_ODD;
import static home.work10.lambda.ProcessEnum.GEN1;
import static home.work10.lambda.ProcessEnum.GEN2;
import static home.work10.lambda.ProcessEnum.MULTI;
import static home.work10.lambda.ProcessEnum.SUM;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int mod = Integer.parseInt(sc.nextLine());
        final int size = 10;
        int[] arraySum = getFilledArray(size, mod, SUM.getProcess());
        int[] arrayMulti = getFilledArray(size, mod, MULTI.getProcess());
        int[] arrayEvenOrOdd = getFilledArray(size, mod, EVEN_OR_ODD.getProcess());
        //index * randomNumber - mod
        int[] arrayGen1 = getFilledArray(size, mod, GEN1.getProcess());
        //index * mod - index + mod
        int[] arrayGen2 = getFilledArray(size, mod, GEN2.getProcess());

        printArray(arraySum);
        printArray(arrayMulti);
        printArray(arrayEvenOrOdd);
        printArray(arrayGen1);
        printArray(arrayGen2);

        sc.close();
    }

    private static void printArray(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

