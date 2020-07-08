/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estr;

import java.util.Scanner;

/**
 *
 * @author David Andrés
 */
public class Registro {
    public void Registro() {
       Scanner sc = new Scanner(System.in);
       Estr ma = new Estr();
       ListaL base = ma.base;
        System.out.println("Registro de ubicaciones");
        System.out.println("Ingrese su nombre:  ");
        
        
        String n = sc.nextLine();
        ListaS lista1 = new ListaS(n);
        
        for(int r = 0; r<5; r++){
            System.out.print("Ubicación a las "+r+" horas:  ");
            String f = sc.nextLine();
           // lista1.add(f, r);
            
            
        }
        base.add(lista1);
        //base.guardar(cov.ver(2));
        System.out.println(base.buscar(n).nombre);
        System.out.println("Coincidencia:  "+base.buscar(n).compare(base.buscar("covid"))); 
        
    }
}
