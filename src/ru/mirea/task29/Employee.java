package ru.mirea.task29;

public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Отправка чека на " + name + " " + address);
    }
}
