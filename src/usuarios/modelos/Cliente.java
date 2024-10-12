
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.List;
import pedidos.modelos.Pedido;

public class Cliente extends Usuario {

    public Cliente(String correo, String apellido, String nombre, String clave) {
        super(correo, apellido, nombre, clave); // Llama al constructor de Usuario
    }

    public Cliente(String correo, String apellido, String nombre) {
        this(correo, "123466", apellido, nombre); // Llama al constructor con clave por defecto
    }

    @Override
    public void mostrar() {
        System.out.println("Cliente: " + this.verApellido() + ", " + this.verNombre());
        super.mostrar(); // Llama al método mostrar de la superclase
    }

    @Override
public List<Pedido> verPedidos() {
    return listaPedidos; // Devuelve directamente la lista de pedidos
}

}




