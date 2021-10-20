package ru.mirea.task12;

import java.util.Scanner;

public class TestStudent {
    public static void sort(int[] arr)
    {
        int tmp;
        for (int i = 1; i < arr.length; ++i)
            for (int j = i; j > 0 && arr[j] < arr[j-1]; --j)
            {
                tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
            }
    }

    public static int[] mergeSort(int[] array) {
        int[] tmp;
        int[] currentSrc = array;
        int[] currentDest = new int[array.length];

        int size = 1;
        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;

        }
        return currentSrc;
    }

    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest,
                              int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        if (src1Start + size > src1.length) {
            for (int i = src1Start; i < src1End; i++) {
                dest[i] = src1[i];
            }
            return;
        }

        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите количество студентов: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int rand, rand_score;
        Student[] students = new Student[size];
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        int[] iDNumber = new int[size];
        for (int i = 0; i < size; ++i)
        {
            rand = (int)(Math.random() * 51 + 10);
            rand_score = (int)(Math.random() * 5 + 1);
            students[i] = new Student(rand, rand_score);
            iDNumber[i] = students[i].getId();
        }

        System.out.println("Массив id студентов: ");
        for (int i = 0; i < size; ++i)
            System.out.print(iDNumber[i] + " ");

        sort(iDNumber);

        System.out.println("\nОтсортированный массив(вставками): ");
        for (int i = 0; i < size; ++i)
            System.out.print(iDNumber[i] + " ");


        System.out.println("\nМассив баллов студентов: ");
        for (int i = 0; i < size; ++i)
            System.out.print(students[i].get_score() + " ");


        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("\nОтсортированный массив(быстрая сортировка): ");
        for (int i = 0; i < size; ++i)
            System.out.print(students[i].get_score() + " ");

        int[] student_score = new int[size];
        for (int i = 0 ; i < size; ++i)
            student_score[i] = students[i].get_score();


        student_score = mergeSort(student_score);
        int[] result_arr = new int[size * 2];
        merge(iDNumber, 0, student_score, 0, result_arr, 0, size);
        System.out.println("\nСлияние двух массивов: ");
        for (int i = 0; i < size * 2; ++i)
            System.out.print(result_arr[i] + " ");
    }
}
