// Clase Base - Empleado
class Empleado {
    String nombre;
    double salarioBase;

    // Constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método para calcular salario base
    public double calcularSalario() {
        return salarioBase;
    }
}

// Clase Derivada - Gerente
class Gerente extends Empleado {
    double bono;

    // Constructor
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    // Sobrescribe el método para calcular salario total del Gerente
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}

// Clase Derivada - Desarrollador
class Desarrollador extends Empleado {
    int horasExtras;

    // Constructor
    public Desarrollador(String nombre, double salarioBase, int horasExtras) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
    }

    // Sobrescribe el método para calcular salario total del Desarrollador
    @Override
    public double calcularSalario() {
        // Supongamos que el pago por hora extra es de $20
        double pagoHorasExtras = horasExtras * 20;
        return salarioBase + pagoHorasExtras;
    }
}

// Clase Principal - Main
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Empleado, Gerente y Desarrollador
        Empleado empleado = new Empleado("Juan", 50000);
        Gerente gerente = new Gerente("Maria", 70000, 10000);
        Desarrollador desarrollador = new Desarrollador("Carlos", 60000, 10);

        // Mostrar salarios
        System.out.println("Salario de " + empleado.nombre + ": $" + empleado.calcularSalario());
        System.out.println("Salario de " + gerente.nombre + ": $" + gerente.calcularSalario());
        System.out.println("Salario de " + desarrollador.nombre + ": $" + desarrollador.calcularSalario());
    }
}