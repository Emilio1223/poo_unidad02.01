/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_01.vista;

import java.time.LocalDate;
import p61.unidad02_01.modelo.Atencion;
import p61.unidad02_01.modelo.Mascota;
import p61.unidad02_01.modelo.dueno;

/**
 *
 * @author emili
 */
public class Principal {
    public static void main(String[] args){
        var mauricio = new dueno("0103667754","Mauricio Ortiz",4);
        mauricio.nuevoTelefono("0984357604", 0, "Móvil", "tuenti",0);
        mauricio.nuevoTelefono("074078385",2,"Casa","Etapa",1);
        mauricio.nuevoTelefono("074135250",1287,"Fijo IP","Etapa",2);
        mauricio.nuevoTelefono("09765843675",0,"novia","claro",3);
        
        var pilichi = new Mascota("bella","gato","akita",4.6,mauricio);
        
        var atencion =new Atencion(LocalDate.of(2022,10,9),"dr albuja" ,45.8,pilichi,2);
        
        atencion.nuevaReceta("paracetamol", 24 ,"1 cada 8 horas", 0);
        atencion.nuevaReceta("sueros", 1 ,"1 hasta finalizar",1);
        
        System.out.println(atencion.toString());
             
    }
}
