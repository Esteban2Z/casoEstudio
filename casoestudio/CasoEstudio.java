/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.casoestudio;

/**
 *
 * @author LABORATORIO 04
 */
import javax.swing.JOptionPane;

public class CasoEstudio {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        
        while (true) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea agregar una factura?", "Factura", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) break;
            
            String nombre = JOptionPane.showInputDialog("Ingrese su nombre ");
            String id = JOptionPane.showInputDialog("Ingrese su numero de cedula");
            String numeroFactura = JOptionPane.showInputDialog("Ingresa el id de la factura");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio de la factura"));
            String mes_de_Facturacion = JOptionPane.showInputDialog("Ingresa el mes de pago de la factura");
            String añoFacturacion = JOptionPane.showInputDialog("Ingrese el año de pago de la factura");
            
            factura factura = new factura(nombre, id, numeroFactura, precio, mes_de_Facturacion, añoFacturacion, "Pendiente");
            usuario.agregarFactura(factura);
            
            factura.pagar();
            
            usuario.mostrarFactura();
        }
    }
}
