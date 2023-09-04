public abstract class Empleado {

	private String nombre;
	private float salarioBase;

	public Empleado(String nombre, float salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public abstract float calcularSalario();
}