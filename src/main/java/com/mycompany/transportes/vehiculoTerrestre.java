/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author jedhi
 */
public class vehiculoTerrestre extends Vehiculo {
    private int numRuedas;
    
    
public vehiculoTerrestre(String marca,String modelo, int numRuedas){
    super(marca,modelo);
    this.numRuedas=numRuedas;
}   


public void mostrarinfo(){
    super.mostrarinfo();
    System.out.println("Tipo de pripulsion"+numRuedas);
}

        
}
