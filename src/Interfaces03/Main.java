package Interfaces03;

import Interfaces02.Empleado;

public class Main {

    static EmpleadoCRUD empleado = new EmpleadoCRUDExcel();

    public static void main(String[] args) {
        empleado.findAll();
        empleado.save(new Empleado());
    }
}
