package poo.coninterfaces;

import poo.sininterfaces.Empleado;
import java.util.List;

/*
* Las interfaces solo declaran metodos no los implementan
* Actua como un contrato, dice lo que hay que hacer pero no lo hace
* con esto logramos bajo acoplamiento
* */
public interface EmpleadoCRUD {
    void save(Empleado empleado);
    List<Empleado> findAll();
    void delete(Empleado empleado);
}
