/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.util.ArrayList;
import pedidos.modelos.Pedido;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import usuarios.modelos.Usuario;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {

    

    
    public static void main(String[] args) {        
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Encargado> encargados = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        //<editor-fold desc="PRIMERA PARTE" defaultstate="collapsed">
        /*
        PRIMERA PARTE
        */
//        Cliente unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
//        Cliente unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
//        Cliente unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");
//
//        clientes.add(unCliente1);
//        clientes.add(unCliente2);
//        clientes.add(unCliente3);
//        
//
//        System.out.println("Clientes");
//        System.out.println("========");
//        for(Cliente c : clientes) {
//            c.mostrar();
//            System.out.println();
//        }
//        System.out.println();        
//
//        Empleado unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");        
//        Empleado unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");        
//        Empleado unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");
//
//        empleados.add(unEmpleado1);
//        empleados.add(unEmpleado2);
//        empleados.add(unEmpleado3);
//
//        System.out.println("Empleados");
//        System.out.println("=========");
//        for(Empleado e : empleados) {
//            e.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//        
//        Encargado unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
//        Encargado unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
//        Encargado unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");
//
//        encargados.add(unEncargado1);
//        encargados.add(unEncargado2);
//        encargados.add(unEncargado3);
//
//        System.out.println("Encargados");
//        System.out.println("==========");
//        for(Encargado e : encargados) {
//            e.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//
//        Producto unProducto1 = new Producto(1, "Producto1", 1.0f, Estado.DISPONIBLE, Categoria.ENTRADA);        
//// solo de verifiacador         Producto unProducto4= new Producto(1, "Producto1", 1.0f, Estado.DISPONIBLE, Categoria.ENTRADA); 
//        Producto unProducto2 = new Producto(2, "Producto2", 2.0f, Estado.DISPONIBLE, Categoria.PLATOPRINCIPAL);
//        Producto unProducto3 = new Producto(3, "Producto3", 3.0f, Estado.DISPONIBLE, Categoria.POSTRE);
//
// // en este segmento se muestra como Evitar productos duplicados
//        if (!productos.contains(unProducto1)) {
//    productos.add(unProducto1);
//    System.out.println("Producto " + unProducto1.toString()+"agregado correctamente.");
//} else {
//    System.out.println("Producto " + unProducto1.toString() + " ya existe en la lista y no se agregó.");
//}
//
//if (!productos.contains(unProducto2)) {
//    productos.add(unProducto2);
//    System.out.println("Producto " + unProducto2.toString() + " agregado correctamente.");
//} else {
//    System.out.println("Producto " + unProducto2.toString() + " ya existe en la lista y no se agregó.");
//}
//
//if (!productos.contains(unProducto3)) {
//    productos.add(unProducto3);
//    System.out.println("Producto " + unProducto3.toString() + " agregado correctamente.");
//} else {
//    System.out.println("Producto " + unProducto3.toString() + " ya existe en la lista y no se agregó.");
//}
////este segmento del codigo sirve para verificar esto
////if (!productos.contains(unProducto4)) {
////    productos.add(unProducto4);
////    System.out.println("Producto " + unProducto4.toString()+"agregado correctamente.");
////} else {
////    System.out.println("Producto " + unProducto4.toString() + " ya existe en la lista y no se agregó.");
////}
//
//        
//        for (Producto p: productos)
//            p.mostrar();
//        
//        productos.add(unProducto1);
//        productos.add(unProducto2);
//        productos.add(unProducto3);
//
//        System.out.println("Productos");
//        System.out.println("=========");
//        for(Producto p : productos) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//
//
//        unCliente1.asignarCorreo("cliente10@bar.com");
//        System.out.println("Clientes");
//        System.out.println("========");
//        for(Cliente c : clientes) {
//            c.mostrar();
//            System.out.println();
//        }
//        System.out.println();
// 
////        System.out.println(unProducto1);
////        //</editor-fold>
//        
//        //<editor-fold desc="SEGUNDA PARTE" defaultstate="collapsed">
//        /*
//        SEGUNDA PARTE
//        */
//        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), unCliente1);        
//        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(),  unCliente2);        
//        Pedido unPedido3 = new Pedido(3, LocalDateTime.now(),  unCliente3);        
//        
//        pedidos.add(unPedido1);
//        pedidos.add(unPedido2);
//        pedidos.add(unPedido3);
//        // en este segmento se muestra como Evitar productos duplicados
//        if (!pedidos.contains(unPedido1)) pedidos.add(unPedido1);
//        if (!pedidos.contains(unPedido2)) pedidos.add(unPedido2);
//        if (!pedidos.contains(unPedido3)) pedidos.add(unPedido3);
//        
//        unPedido1.agregarProducto(unProducto1, 2);
//        unPedido2.agregarProducto(unProducto2, 5);
//        unPedido3.agregarProducto(unProducto3, 1);
//        
//        System.out.println("Pedidos");
//        System.out.println("=======");
//        for(Pedido p : pedidos) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//       //</editor-fold>
//        
//        
//        
//    }
 /*


//    INICIO SegUsuariosnda parte - herencia
//    */
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        Usuario unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
        Usuario unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
        Usuario unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");
//        Usuario unCliente4 = new Cliente("cliente3@bar.com", "claveCliente4", "ApellidoCliente4", "NombreCliente4"); 
        //unCliente4 repetido con unCliente3
        
        if (!usuarios.contains(unCliente1))
            usuarios.add(unCliente1);
        if (!usuarios.contains(unCliente2))
            usuarios.add(unCliente2);
        if (!usuarios.contains(unCliente3))
            usuarios.add(unCliente3);
//        if (!usuarios.contains(unCliente4))
//            usuarios.add(unCliente4);
        
        System.out.println("Clientes");
        System.out.println("========");
        for(Usuario c : usuarios) {
            if (c instanceof Cliente) {
                c.mostrar();
                System.out.println();
            }
        }
        System.out.println();        
                
        Usuario unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");        
        Usuario unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");        
        Usuario unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");
//        Usuario unEmpleado4 = new Empleado("empleado3@bar.com", "claveEmpleado4", "ApellidoEmpleado4", "NombreEmpleado4");
        //empleado repetido
        
        if (!usuarios.contains(unEmpleado1))
            usuarios.add(unEmpleado1);
        if (!usuarios.contains(unEmpleado2))
            usuarios.add(unEmpleado2);
        if (!usuarios.contains(unEmpleado3))
            usuarios.add(unEmpleado3);
//        if (!usuarios.contains(unEmpleado4))
//            usuarios.add(unEmpleado4);
//        
        System.out.println("Empleados");
        System.out.println("=========");
        for(Usuario e : usuarios) {
            if (e instanceof Empleado) {
                e.mostrar();
                System.out.println();
            }
        }
        System.out.println();

        Usuario unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
        Usuario unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
        Usuario unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");
//        Usuario unEncargado4 = new Encargado("encargado3@bar.com", "claveEncargado4", "ApellidoEncargado4", "NombreEncargado4");
        //encargado repetido

        if(!usuarios.contains(unEncargado1))
            usuarios.add(unEncargado1);
        if(!usuarios.contains(unEncargado2))
            usuarios.add(unEncargado2);
        if(!usuarios.contains(unEncargado3))
            usuarios.add(unEncargado3);
//        if(!usuarios.contains(unEncargado4))
//            usuarios.add(unEncargado4);
//        
        System.out.println("Encargados");
        System.out.println("==========");
        for(Usuario e : usuarios) {
            if (e instanceof Encargado) {
                e.mostrar();
                System.out.println();
            }
        }
        System.out.println();   
        
//        Usuario unEncargado5 = new Encargado("cliente1@bar.com", "claveEncargado4", "ApellidoEncargado4", "NombreEncargado4");
//        if(!usuarios.contains(unEncargado5))
//            usuarios.add(unEncargado5);
        //mismo correo que un cliente, no debe agregarse
        
//        Usuario unCliente5 = new Encargado("empleado3@bar.com", "claveEncargado4", "ApellidoEncargado4", "NombreEncargado4");
//        if(!usuarios.contains(unCliente5))
//            usuarios.add(unCliente5);
        //mismo correo que un empleado, no debe agregarse
        
        System.out.println("Todos");
        System.out.println("=====");
        for(Usuario u : usuarios) {
            u.mostrar();
            System.out.println();
        }
        System.out.println();
    
    
    /*
    FIN SegUsuariosnda parte - herencia
    */

    }
}