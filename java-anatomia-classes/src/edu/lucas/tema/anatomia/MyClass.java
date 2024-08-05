package edu.lucas.tema.anatomia;

public class MyClass {
    public static void main(String[] args) {
        final String birthDate = "21/08/1999"; 

        String firstName = "Lucas";
        String secondName = "Rabelo";

        String completName = completeName(firstName, secondName);

        System.out.print("Birth Date: "+birthDate+" Complete Name: "+completName);
    }

    public static String completeName(String firstName, String secondName) {
        return firstName.concat(" ").concat(secondName);
    }
}