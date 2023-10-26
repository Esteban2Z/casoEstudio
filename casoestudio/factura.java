/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoestudio;

/**
 *
 * @author LABORATORIO 04
 */
import javax.swing.JOptionPane;

public class factura {
    String nombre;
    String id;
    String numeroFactura;
    double precio;
    String mes_de_Facturacion;
    String añoFacturacion;
    String estado;

    public factura(String nombre, String id, String numeroFactura, double precio, String mes_de_Facturacion, String añoFacturacion, String estado) {
        this.nombre = nombre;
        this.id = id;
        this.numeroFactura = numeroFactura;
        this.precio = precio;
        this.mes_de_Facturacion = mes_de_Facturacion;
        this.añoFacturacion = añoFacturacion;
        this.estado = estado;
    }
    
    public void pagar() {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres pagar a cuotas?", "Pago", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            double precioFinal = this.precio /6*0.05;
            System.out.println("El precio a pagar com cuotas es : " + precioFinal);
            this.precio += this.precio * 0.05/6;
            this.estado = "Pagado a cuotas";
        } else {
            this.estado = "Pagado";
        }
    }
}
