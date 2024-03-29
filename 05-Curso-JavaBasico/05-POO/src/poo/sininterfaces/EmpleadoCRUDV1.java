package poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Retrieve/Read
 * Update
 * Delete
 */
public class EmpleadoCRUDV1 {
    //Una interfaz es como un contrato que define una serie de metodos de que es lo que hay que hacer
    //Estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

    //OPERACIONES CRUD

    //CREATE - guardar un empleado
    public void save(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }

}
