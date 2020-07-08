/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.Scanner;

/**
 *
 * @author David Andrés
 */
public class Base {
    public void base(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Buscar por nombre");
        String g = sc.nextLine();
        Estr io = new Estr();
        ListaL base = io.base;
        ListaS temp =  base.buscar(g);
        temp.mostrar();

        
                
    }
}
