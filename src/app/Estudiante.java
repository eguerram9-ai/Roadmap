package app;

public class Estudiante extends Persona {

    private String carnet;
    private double nota;

    public Estudiante(String nombre, String carnet, double nota) {
        super(nombre);
        this.carnet = carnet;
        this.nota = nota;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        if (carnet != null && !carnet.trim().isEmpty()) {
            this.carnet = carnet;
        }
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 100) {
            this.nota = nota;
        }
    }

    public String obtenerEstado() {
        if (nota >= 61) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Carnet: " + carnet);
        System.out.println("Nota: " + nota);
        System.out.println("Estado: " + obtenerEstado());
    }

    @Override
    public String toString() {
        return "Carnet: " + carnet
                + " | Nombre: " + getNombre()
                + " | Nota: " + nota
                + " | Estado: " + obtenerEstado();
    }
}