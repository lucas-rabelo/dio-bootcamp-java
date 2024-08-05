package edu.lucas.tema.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        System.err.println("SmartTV pré definida:");
        System.err.println("Está ligada? " + smartTV.ligada);
        System.err.println("Qual o canal? " + smartTV.canal);
        System.err.println("Qual o volume? " + smartTV.volume);

        smartTV.ligar();
        System.err.println("Está ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        System.err.println("Qual o volume? " + smartTV.volume);

        smartTV.mudarCanal(21);
        System.err.println("Qual o canal? " + smartTV.canal);

    }
}
