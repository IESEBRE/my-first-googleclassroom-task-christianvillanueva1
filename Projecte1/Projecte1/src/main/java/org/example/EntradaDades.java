package org.example;

import java.util.Scanner;

public class EntradaDades {
    public static void main(String[] args) {

        int valor;
        Scanner ent = new Scanner(System.in);

        System.out.println("Introdueix un valor enter:");
        valor = ent.nextInt();
        System.out.println("El valor que has introduit es " + valor);
    }
}