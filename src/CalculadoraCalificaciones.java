public class CalculadoraCalificaciones {

    // Atributos
    private String nombre;
    private int[] calificaciones;

    // Constructor
    public CalculadoraCalificaciones(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    // Método para obtener la calificación final
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método para imprimir resultados
    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);

        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        String nombreEstudiante = "Daniel Posadas";
        int[] calificacionesEstudiante = {75, 85, 90, 65, 80};

        CalculadoraCalificaciones calculadora = new CalculadoraCalificaciones(nombreEstudiante, calificacionesEstudiante);
        calculadora.imprimirResultados();
    }
}