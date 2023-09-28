package ejer1.modelos;

public class Marca {
    private String nombre;
    private float tasa;

    public Marca(String nombre, float tasa) {
        this.nombre = nombre;
        this.tasa = tasa;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para tasa
    public float getTasa() {
        return tasa;
    }

    // Setter para tasa
    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
}
