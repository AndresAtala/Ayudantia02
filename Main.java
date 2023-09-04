import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // Crea una lista de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Crea instancias de EmpleadoAsalariado y EmpleadoPorHoras, y agregalas a la lista
        empleados.add(new EmpleadoAsalariado("Juan Pérez", 1000));
        empleados.add(new EmpleadoPorHoras("María García", 10, 40));

        // Calcula los salarios de los empleados
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario: " + empleado.calcularSalario());
        }
    }
}