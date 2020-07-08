/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estr;

import java.util.Scanner;
import java.sql.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author David Andrés
 */
public class Estr {

    public ListaL base;
    public ListaS cov;
    public BinaryTree[] arboles;

    public static void main(String[] args) {

        ListaL base = new ListaL();
        // se instancian los 24 arboles correspondientes a las  24 horas del dia
        BinaryTree[] arboles = new BinaryTree[23];
        for (int i = 0; i < 23; i++) {

            arboles[i] = new BinaryTree();
        }

        Prio inf = new Prio();
        ListaS cov = new ListaS("covid");
        cov.add(4.763504, -74.068780, 0);
        cov.add(4.763524, -74.068180, 1);
        cov.add(4.763524, -74.068320, 2);
        cov.add(4.763569, -74.068781, 3);
        cov.add(4.763504, -74.068710, 4);
        cov.add(4.763904, -74.068123, 5);
        base.add(cov);

        ListaS cov1 = new ListaS("luis");
        cov1.add(4.763204, -74.068780, 0);
        cov1.add(4.763524, -74.068140, 1);
        cov1.add(4.763524, -74.068320, 2);
        cov1.add(4.761569, -74.068081, 3);
        cov1.add(4.763504, -74.068720, 4);
        cov1.add(4.763894, -74.068823, 5);
        base.add(cov1);

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("Opciones");
            System.out.println("1: Registrar ubicaciones");
            System.out.println("2: Ver ubicaciones peligrosas");
            System.out.println("3. Reportar caso positivo");
            System.out.println("4. Salir");
            ;
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    Registro r = new Registro();
                    r.Registro();
                    break;
                case 2:
                    System.out.println("Ubicaciones de contagiados:  ");
                    for (int i=0;i<arboles.length;i++){
                        arboles[i].printTree(arboles[i].getRoot());
                    }
                    System.out.println("-");
                    break;
                case 3:
                    String n;
                    System.out.print("Ingrese el nombre del usuario:  ");
                    Scanner ss = new Scanner(System.in);
                    n = ss.nextLine();
                    ListaS x = base.buscar(n);
                    Nodo a = x.head;
                    // se inserta cada posición en el arbol correspondiente
                    for (int i = 0; i < x.tam; i++) {
                        arboles[a.hora].insertar(a.lat, a.lon);
                        a = a.verNext();
                    }

                    System.out.println("Done");
                    System.out.println("-");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }

 

    }

}
