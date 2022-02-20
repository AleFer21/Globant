package practicoprogramacionoo;

public class Perro implements SerVivo {

    private String nombre;
    private String raza;
    private int edad;
    private String sexo;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String sexo) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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
    public int cumpleanios() {

        int suma = edad + 1;

        return suma;

    }

    @Override
    public void esAdulto() {

        if (edad >= 18) {
            System.out.println("El perro es adulto");
        } else {
            System.out.println("El perro no es adulto");
        }
    }

}
