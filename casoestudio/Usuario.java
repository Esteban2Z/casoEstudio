/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casoestudio;

/**
 *
 * @author LABORATORIO 04
 */
public class Usuario {
    factura factura;

    public void agregarFactura(factura factura) {
        this.factura = factura;
    }

    public void mostrarFactura() {
        System.out.println("Nombre: " + factura.nombre);
        System.out.println("ID: " + factura.id);
        System.out.println("Número de factura: " + factura.numeroFactura);
        System.out.println("Precio: " + factura.precio);
        System.out.println("Mes de facturación: " + factura.mes_de_Facturacion);
        System.out.println("Año de facturación: " + factura.añoFacturacion);
        System.out.println("Estado: " + factura.estado);
    }
}
