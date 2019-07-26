package HomeWork7;


import java.util.Arrays;
import java.util.Random;

/*
Создать 2мерный массив (матрица) M*N и заполнить его случайными числами.
 Отсортировать числа по возрастанию,  чтобы с левом верхнем углу было
 самое маленькое число, справа от него следующее по значению,
итд, в правом нижнем углу самое большое.
 */
public class SortArray {
    private final int N = 5;
    private final int M = 5;
    private final int MIX_VALUE = 0;
    private final int MAX_VALUE = 20;
    private int[][] arr1 = new int[N][M];

    public static void main(String[] args) {
        SortArray test = new SortArray();
        test.convertAndSortArray();
    }

    private void convertAndSortArray() {
        int[] arr2 = new int[M * N];
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr1[i][j] = random.nextInt(MAX_VALUE) + MIX_VALUE;
                arr2[count++] = arr1[i][j];
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        Arrays.sort(arr2);
        count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr1[i][j] = arr2[count++];
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}






