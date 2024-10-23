/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.modelos;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author 54381
 */
public class ModeloComboClientes extends DefaultComboBoxModel {
    
    /**
     * Constructor
    */
    
    public ModeloComboClientes(ArrayList<Usuario> usuarios) { 
       
        for (Usuario usuario : usuarios) {
           if(usuario instanceof Cliente){
               this.addElement(usuario);
           }
    }
    
    /**
     * Devuelve el perfil seleccionado
     * @return Perfil  - perfil seleccionado
    */
    public Cliente obtenerCliente(){ 
        return (Cliente)this.getSelectedItem();
    }
    
    /**
     * Selecciona el perfil especificado
     * @param usuario perfil
    */
    public void seleccionarEstado(Usuario usuario) {
        this.setSelectedItem(usuario);
    }
//}