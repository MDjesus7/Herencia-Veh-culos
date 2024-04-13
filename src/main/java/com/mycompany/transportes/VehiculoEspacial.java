/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author jedhi
 */
public class VehiculoEspacial extends Vehiculo {
    private int tipopropulsion;
    
    public VehiculoEspacial(String marca,String modelo, int tipopropulsion){
    super(marca,modelo);
    this.tipopropulsion=tipopropulsion;
}   


public void mostrarinfo(){
    super.mostrarinfo();
    System.out.println("Tipo de propulsion"+tipopropulsion);
}
    
    
}
