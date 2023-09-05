public class EmpleadoAsalariado extends Empleado {

	public EmpleadoAsalariado(String nombre, float salarioBase) {
		super(nombre, salarioBase);
	}

	@Override
	public float calcularSalario() {
		return getSalarioBase();
	}
}