package practicoprogramacionoo;

public class Chileno extends Persona {

    private int dni;
    private String region;
    private String comuna;

    public Chileno() {
    }

    public Chileno(String nombre, String apellido, int edad, String sexo, int dni, String region, String comuna) {
        super(nombre, apellido, edad, sexo);
        this.dni = dni;
        this.region = region;
        this.comuna = comuna;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

}
