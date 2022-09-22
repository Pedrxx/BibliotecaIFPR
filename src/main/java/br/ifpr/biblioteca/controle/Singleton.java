/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifpr.biblioteca.controle;

/**
 *
 * @author pedro
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();
    private static String passei;
    private static int conta;

    
    Singleton() {
    }

    public static Singleton getInstance() {
        passei = "Estava nulo, então preenchi";
        if (INSTANCE == null) {
            System.out.println(passei);
        }
        
        conta ++;
        System.out.println("Ja instanciado: " + conta + "x");
        
        return INSTANCE;
    }
}
