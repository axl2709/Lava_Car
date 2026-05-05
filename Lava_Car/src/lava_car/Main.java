/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lava_car;

import Database.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author Axel Solís
 */
public class Main {
    
    public static void main(String[] args) {
        
       Conexion con = new Conexion();
       con.conectar();
    }
    
    
}
