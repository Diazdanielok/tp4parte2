/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.modelos;

/**
 *
 * @author 54381
 */
public enum Perfil {
     CLIENTE("Cliente"),EMPLEADO("Empleado"),ENCARGADO("Encargado");
    
    private String valor;
    
    private Perfil(String valor){
        this.valor = valor;
    }
    
    public String toString(){
        return this.valor;
    }
    
}
