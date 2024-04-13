/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportes;

/**
 *
 * @author jedhi
 */
public class Transportes {

    public static void main(String[] args) {
        
        vehiculoTerrestre vt=new vehiculoTerrestre("Toyota","corrolla",4);
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha","Yamaha","Motor");
        VehiculoAereo vehiculoAereo=new VehiculoAereo("Avion","Emirates",4);
        VehiculoEspacial vehiculoEspacial=new VehiculoEspacial("cohete","Naza",8);
        
        System.out.println("informacion del vehiculo Terreestre");
        vt.mostrarinfo();
        
        System.out.println("informacion del vehiculo Acuatico");
        vehiculoAcuatico.mostrarinfo();
        
        System.out.println("informacion del vehiculo Aereo");
        vehiculoAereo.mostrarinfo();
        
        System.out.println("informacion del vehiculoEspacial");
        vehiculoEspacial.mostrarinfo();
    }
}
