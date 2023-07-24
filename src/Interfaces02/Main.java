package Interfaces02;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoCRUD01 empleadoCRUD = new EmpleadoCRUD01();

        Empleado camila = new Empleado("Camila", 26, 40000, true);
        Empleado roberto = new Empleado("Roberto", 22, 40000, false);
        Empleado sofia = new Empleado("Sofia", 55, 40000, true);

        empleadoCRUD.save(camila);
        empleadoCRUD.save(roberto);
        empleadoCRUD.save(sofia);

        List<Empleado> empleados = empleadoCRUD.findAll();

    }
}
