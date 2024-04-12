/**
 * Clase que representa a un empleado.
 * 
 * @author Francisco Javier Arenas Diaz
 * @version 1.0
 * @since 1.0
 */
public class Main {
	 /**
     * Método principal que prueba la clase Empleado.
     * 
     * @param args donde se añaden los empleados y se verifica el código creado.
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Empleado emp1 = new Empleado(1, "Juan", "Perez", "Ciudad A", "Vendedor", 2000.0, Departamento.Ventas);

        Empleado emp2 = new Empleado(2, "María", 2500.0, Departamento.Marketing);

        System.out.println("Empleado 1:");
        System.out.println("Nombre: " + emp1.getNombre());
        System.out.println("Apellido: " + emp1.getApellido());
        System.out.println("Población: " + emp1.getPobla());
        System.out.println("Oficio: " + emp1.getOficio());
        System.out.println("Salario: " + emp1.getSalario());
        System.out.println("Departamento: " + emp1.getDept());

        System.out.println("Empleado 2:");
        System.out.println("Nombre: " + emp2.getNombre());
        System.out.println("Salario: " + emp2.getSalario());
        System.out.println("Departamento: " + emp2.getDept());
        System.out.println();

        emp1.subidasalario(500.0);
        System.out.println("Nuevo salario de " + emp1.getNombre() + ": " + emp1.getSalario());
        System.out.println();

        if (!emp2.comprobar()) {
            System.out.println("Error: El nombre del empleado 2 no puede estar vacío.");
        }
    }
}
