/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author jedhi
 */
public class VehiculoAereo extends Vehiculo {
    private int tipoVoladorxd;
    
    public VehiculoAereo(String marca,String modelo, int tipoVoladorxd){
    super(marca,modelo);
    this.tipoVoladorxd=tipoVoladorxd;
}   


public void mostrarinfo(){
    super.mostrarinfo();
    System.out.println("Tipo de pripulsion"+tipoVoladorxd);
}
    
}
