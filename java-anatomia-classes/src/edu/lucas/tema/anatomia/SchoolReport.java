package edu.lucas.tema.anatomia;

public class SchoolReport {
    public static void main(String[] args) {
        int finalMedia = 6;
        if(finalMedia < 6) 
            System.out.print("DISAPPROVED");
        else if(finalMedia == 6)
            System.out.print("MINERVA'S TEST");
        else 
            System.out.print("APPROVED");
    }
}