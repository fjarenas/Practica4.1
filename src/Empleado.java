/**
 * Clase que representa a un empleado.
 *
 * @author Francisco Javier Arenas Diaz
 * @version 1.0
 * @since 1.0
 * @deprecated La clase empleado se quedará obsoleta ya que hay dos tipos de clase de Empleado con el mismo nombre.
 */
public class Empleado {
	private int emp_no;
	private String nombre;
	private String apellido;
	private String pobla;
	private String oficio;
	private Double salario;
	private Departamento dept;
	/**
	 * Constructor de la clase Empleado.
	 *
	 * @param emp_no Número de empleado.
	 * @param nombre Nombre del empleado.
	 * @param apellido Apellido del empleado.
	 * @param pobla Población del empleado.
	 * @param oficio Oficio del empleado.
	 * @param salario Salario del empleado.
	 * @param dept Departamento del empleado.
	 */
	public Empleado(int emp_no, String nombre, String apellido, String pobla, String oficio,
					Double salario, Departamento dept) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pobla = pobla;
		this.oficio = oficio;
		this.salario = salario;
		this.dept = dept;
	}
	/**
	 * Constructor alternativo de la clase Empleado.
	 *
	 * @param emp_no Número de empleado.
	 * @param nombre Nombre del empleado.
	 * @param salario Salario del empleado.
	 * @param dept Departamento del empleado.
	 */
	public Empleado(int emp_no, String nombre, Double salario, Departamento dept) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.salario = salario;
		this.dept = dept;
	}

	/**
	 * Obtiene el número de empleado.
	 *
	 * @return El número de empleado.
	 */
	public int getEmp_no() {
		return emp_no;
	}

	/**
	 * Establece el número de empleado.
	 *
	 * @param emp_no El nuevo número de empleado.
	 */
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	/**
	 * Obtiene el nombre del empleado.
	 *
	 * @return El nombre del empleado.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del empleado.
	 *
	 * @param nombre El nuevo nombre del empleado.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el apellido del empleado.
	 *
	 * @return El apellido del empleado.
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Obtiene la población del empleado.
	 *
	 * @return La población del empleado.
	 */
	public String getPobla() {
		return pobla;
	}

	/**
	 * Establece la población del empleado.
	 *
	 * @param pobla La nueva población del empleado.
	 */
	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	/**
	 * Obtiene el oficio del empleado.
	 *
	 * @return El oficio del empleado.
	 */
	public String getOficio() {
		return oficio;
	}

	/**
	 * Establece el oficio del empleado.
	 *
	 * @param oficio El nuevo oficio del empleado.
	 */
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	/**
	 * Obtiene el salario del empleado.
	 *
	 * @return El salario del empleado.
	 */
	public Double getSalario() {
		return salario;
	}

	/**
	 * Establece el salario del empleado.
	 *
	 * @param salario El nuevo salario del empleado.
	 */
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	/**
	 * Obtiene el departamento del empleado.
	 *
	 * @return El departamento del empleado.
	 */
	public Departamento getDept() {
		return dept;
	}

	/**
	 * Establece el departamento del empleado.
	 *
	 * @param dept El nuevo departamento del empleado.
	 */
	public void setDept(Departamento dept) {
		this.dept = dept;
	}

	/**
	 * Aumenta el salario del empleado por una cantidad específica.
	 *
	 * @param subida La cantidad de aumento salarial.
	 */
	public void subidasalario(Double subida) {
		salario = salario + subida;
	}
	/**
	 * Comprueba si el nombre del empleado está vacío.
	 *
	 * @return FALSE si el nombre está vacío, si no está vacío, muestra TRUE.
	 * @since 1.0
	 * @see #getNombre()
	 */
	public boolean comprobar(){
		if (nombre.equals("")){
			return false;
		}
		return true;
	}

}
