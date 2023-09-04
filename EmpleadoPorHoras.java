public class EmpleadoPorHoras extends Empleado {

	private int horasTrabajadas;

	public EmpleadoPorHoras(String nombre, float salarioPorHora, int horasTrabajadas) {
		super(nombre, salarioPorHora);
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public float calcularSalario() {
		return salarioPorHora * horasTrabajadas;
	}
}