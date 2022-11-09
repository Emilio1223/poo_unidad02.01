/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_01.modelo;

/**
 *
 * @author emili
 */
public class telefono {
    private String numero;
    private int extencion;
    private String tipoTelefono;
    private String operadora;

    public telefono(String numero, int extencion, String tipoTelefono, String operadora) {
        this.numero = numero;
        this.extencion = extencion;
        this.tipoTelefono = tipoTelefono;
        this.operadora = operadora;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getExtencion() {
        return extencion;
    }

    public void setExtencion(int extencion) {
        this.extencion = extencion;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @Override
    public String toString() {
        return "telefono{" + "numero=" + numero + ", extencion=" + extencion + 
            ", tipoTelefono=" + tipoTelefono + ", operadora=" + operadora + '}';
    }
    
}
