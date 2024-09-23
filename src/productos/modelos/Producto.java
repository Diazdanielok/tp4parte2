package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private float precio;
    private String estado;
    private String categoria;

    /**
     * Este método permite mostrar un Producto
     * @return devuelve nada
     */

    public void mostrar(){
    System.out.println("Codigo: "+ codigo + "\nDescripcion: "+ descripcion + "\nCategoria: "+ categoria + "\nEstado: "+ estado + "\nPrecio: "+ precio);
    }

    public Producto(int codigo, String nombre, String descripcion, float precio, String estado, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
        this.categoria = categoria;
    }

    public int verCodigo() {
        return codigo;
    }

    public void asignarCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float verPrecio() {
        return precio;
    }

    public void asignarPrecio(float precio) {
        this.precio = precio;
    }

    public String verEstado() {
        return estado;
    }

    public void asignarEstado(String estado) {
        this.estado = estado;
    }

    public String verCategoria() {
        return categoria;
    }

    public void asignarCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
     
}




