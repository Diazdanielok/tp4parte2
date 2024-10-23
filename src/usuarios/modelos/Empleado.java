package usuarios.modelos;

import java.util.List;
import java.util.Objects;
import pedidos.modelos.Pedido;

public class Empleado extends Usuario {
    private int legajo; // Atributo legajo agregado

    // Constructor modificado para incluir legajo
    public Empleado(String correo, String apellido, String nombre, String clave, int legajo) {
        super(correo, apellido, nombre, clave);
        this.legajo = legajo;
    }

    // Getter para legajo
    public int getLegajo() {
        return legajo;
    }

    // Setter para legajo
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
@Override
public boolean equals(Object obj) {
    // Verifica si es la misma referencia
    if (this == obj) {
        return true;
    }
    // Verifica si el objeto es nulo o de una clase diferente
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }

    // Llama al equals de Usuario para comparar el correo
    if (!super.equals(obj)) {
        return false;
    }

    // Verifica si el legajo también es igual
    Empleado other = (Empleado) obj;
    return this.legajo == other.legajo;
}

@Override
public int hashCode() {
    // Utiliza el hashCode de la superclase (que usa el correo) y agrega el legajo
    return Objects.hash(super.hashCode(), legajo);//todos los objetos del tipo objectss
}

    @Override
    public void mostrar() {
        System.out.println("Empleado: " + this.verApellido() + ", " + this.verNombre() + " - Legajo: " + legajo);
        super.mostrar(); // Llama al método mostrar de la superclase
    }

    @Override
    public List<Pedido> verPedidos() {
        return super.listaPedidos; // Retorna la lista de pedidos
    }
}
