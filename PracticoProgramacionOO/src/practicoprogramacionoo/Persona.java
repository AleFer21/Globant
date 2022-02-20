package practicoprogramacionoo;

public class Persona implements SerVivo {

    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", sexo: " + sexo;
    }

    public int cumpleanios(int suma) {

        suma = edad + 1;

        return suma;
    }

    @Override
    public int cumpleanios() {

        int suma = edad + 1;

        return suma;
    }

    @Override
    public void esAdulto() {

        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
    }
}
