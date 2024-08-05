package edu.lucas.tema.tipo_variaveis;

public class TypesVariables {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2024;
        int cep = 14164164; // if startwith 0, must change the type to string;
        double salaria = 1420.50;
        
        /**
         * This types is necessary to put a letter after definitions:
         * 
         * long = L ?? l;
         * float = F ?? f 
         */
        long cpf = 86655190096L; // if startwith 0, must change the type to string;
        float pi = 3.14F;

        System.out.print("Show response:");
        System.out.print(" byte: "+idade);
        System.out.print(" short: "+ano);
        System.out.print(" int: "+cep);
        System.out.print(" double: "+salaria);
        System.out.print(" long: "+cpf);
        System.out.print(" float: "+pi);

        /**
         * Here I have a variable that has a type short and this variable is 
         * used to define the value of another variable that is of type int, 
         * this will work.
         * 
         * But in the case of int to short it won't work, so "casting" is used, 
         * which forces the definition value to be of the type that the variable 
         * expects.
        */
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
    }
}
