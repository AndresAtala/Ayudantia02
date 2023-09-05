public class EmpleadoPorHoras extends Empleado {

	protected float salarioPorHora;
	private int horasTrabajadas;

	public EmpleadoPorHoras(String nombre, float salarioPorHora, int horasTrabajadas) {
		super(nombre, 0);
		this.salarioPorHora = salarioPorHora;
		this.horasTrabajadas = horasTrabajadas;
	}


	@Override
	public float calcularSalario() {
		return salarioPorHora * horasTrabajadas;
	}
}
