import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoAsalariado("Juan Garcua", 120000));
        empleados.add(new EmpleadoPorHoras("María Del Carmen", 3200, 48));

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario: " + empleado.calcularSalario());
        }
    }
}