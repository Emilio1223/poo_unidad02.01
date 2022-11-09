/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_01.modelo;

import p61.unidad02_01.modelo.telefono;

/**
 *
 * @author emili
 */
public class dueno {
    private String cedula;
    private String nombre;
    private int cantidadTelefonos;
    private telefono [] telefonoList;
    

    public dueno(String cedula, String nombre, int cantidadTelefonos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cantidadTelefonos = cantidadTelefonos;
        this.telefonoList=new telefono[this.cantidadTelefonos];
        
    }
    
    public void nuevoTelefono(String numero,int extencion,String tipoTelefono,String operadora, int posicion){
        var telefono = new telefono(numero,extencion, tipoTelefono,operadora );
        this.telefonoList[posicion]=telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public telefono[] getTelefonoList() {
        return telefonoList;
    }

    public void setTelefonoList(telefono[] telefonoList) {
        this.telefonoList = telefonoList;
    }

    public int getCantidadTelefonos() {
        return cantidadTelefonos;
    }

    public void setCantidadTelefonos(int cantidadTelefonos) {
        this.cantidadTelefonos = cantidadTelefonos;
    }

    @Override
    public String toString() {
        var retorno= "dueno{" + "cedula=" + cedula + ", nombre=" + nombre 
            +", cantidadTelefonos=" + cantidadTelefonos;
        /*
        for(var i=0;i<this.cantidadTelefonos;i++){
            retorno+=this.telefonoList[i].toString()+"\n";
        }
        */
        for(var telefono:this.telefonoList){
            retorno+=telefono.toString()+"\n";
        }
        return retorno;       
    }
}
