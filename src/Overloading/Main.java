package Overloading;

public class Main {
    public static void main(String[] args){

        int[] students = {2398, 2400, 2653};

        Student student = new Student(2398);

        System.out.println("\n\n");

        Student studentCollection = new Student(students);

    }
}
