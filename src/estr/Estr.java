/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estr;

import java.util.Scanner;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author David Andrés
 */
public class Estr {
public ListaL base;
public ListaS cov;   
    public static void main(String[] args) {
        
        ListaL base = new ListaL();
        ListaS cov = new ListaS("covid");

        cov.add("soacha", 0);
        cov.add("bronx", 1);
        cov.add("usaquen", 2);
        cov.add("suba", 3);
        cov.add("cota", 4);
        base.add(cov);
/***
        System.out.println("Opciones");
        System.out.println("1: Registrar ubicaciones");
        System.out.println("2: Ver ubicaciones peligrosas");
        System.out.println("3. Ver base datos");
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        if (e == 1){
            Registro r = new Registro();
            r.Registro();
        }
        if (e == 2){
             Mapa mp = new Mapa();
            mp.mostrar();
            
        }
        if (e == 3){
            Base bb = new Base();
            bb.base();
        }
 
        **/
        
        try{
            String url = "jdbc:mysql://www.viviendolo.com:3306/u804872666_ed20";
            String usuario = "u804872666_ed20";
            String clave = "Ed.2020";
            Connection cn = DriverManager.getConnection(url, usuario, clave);
            PreparedStatement pat = cn.prepareStatement("select * from ubicaciones where ID = ?");
            pat.setString(1, "1");
            ResultSet rs = pat.executeQuery();
            if(rs.next()){
                String result = rs.getString("ubicacion");
                String result1 = rs.getString("hora");
            }else {
                JOptionPane.showMessageDialog(null, "fail");
            }
        } catch (Exception e){
            System.out.println("error"+e);
        }

    }
    
}
