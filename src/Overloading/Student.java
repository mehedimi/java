package Overloading;

import java.util.HashMap;

public class Student {
    private HashMap <Integer, String> students = new HashMap<Integer, String>();

    Student(int roll){
        this.registerStudent();

        if(this.students.containsKey(roll)){
            this.foundOutput(roll);
        }else{
            this.failedOutput(roll);
        }
    }

    Student(int[] rolls) {
        this.registerStudent();

        for (int roll = 0; roll < rolls.length; roll++){
            if(this.students.containsKey(rolls[roll])){
                this.foundOutput(rolls[roll]);
            }else{
                this.failedOutput(rolls[roll]);
            }
        }
    }

    private void registerStudent() {
        HashMap <Integer, String> students = new HashMap<Integer, String>();

        students.put(2398, "Mehedi Hasan");

        students.put(2400, "Imran Sarkar");

        this.students.putAll(students);
    }

    private void failedOutput(int roll){

        System.out.println("Sorry that roll "+roll+" and associated name are not found!");
    }

    private void foundOutput(int roll){

        System.out.println("Name: " + this.students.get(roll));

        System.out.println("Roll Number: " + roll);
    }
}
