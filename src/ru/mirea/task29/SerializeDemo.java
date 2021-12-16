package ru.mirea.task29;

import java.io.*;
public class SerializeDemo {

    public static void main(String [] args) {
        Employee e = new Employee();
        e.name = "AMAGAMA";
        e.address = "Москва, Россия";
        e.SSN = 11122333;
        e.number = 101;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Сериализованные данные сохраняются в employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
