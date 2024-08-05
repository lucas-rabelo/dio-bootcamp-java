package edu.lucas.tema.operadores;

public class Operators {
    public static void main(String[] args) {
        String nomeUm = "Lucas";
        String nomeDois = new String("Lucas");

        System.err.println(nomeUm.equals(nomeDois)); // return true;
        System.err.println(nomeUm == nomeDois); // return false;
    }
}
