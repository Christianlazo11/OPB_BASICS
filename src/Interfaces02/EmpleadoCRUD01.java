package Interfaces02;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD01 {

    private List<Empleado> empleados = new ArrayList<Empleado>();

    public void save(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado> findAll() {
        return empleados;
    }


}
