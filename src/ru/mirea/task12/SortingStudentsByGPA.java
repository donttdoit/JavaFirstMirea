package ru.mirea.task12;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.get_score() - o2.get_score();
    }

    public void quickSort(Student []students, int left, int right){
        int left_marker = left;
        int right_marker = right;
        Student pivot = students[(left + right) / 2];
        Student tmp;

        do{
            while (compare(students[left_marker], pivot) > 0)
                left_marker++;

            while (compare(students[right_marker], pivot) < 0)
                right_marker--;

            if (left_marker <= right_marker)
            {
                if (left_marker < right_marker)
                {
                    tmp = students[left_marker];
                    students[left_marker] = students[right_marker];
                    students[right_marker] = tmp;
                }

                left_marker++;
                right_marker--;
            }
        } while (left_marker <= right_marker);

        if (left_marker < right)
            quickSort(students, left_marker, right);
        if (left < right_marker)
            quickSort(students, left, right_marker);
    }
}
