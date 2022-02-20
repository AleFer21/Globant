package practicoprogramacionoo;

public class Uruguayo extends Persona {

    private int ci;
    private String departamento;
    private String barrio;

    public Uruguayo() {
    }

    public Uruguayo(String nombre, String apellido, int edad, String sexo, int ci, String departamento, String barrio) {
        super(nombre, apellido, edad, sexo);
        this.ci = ci;
        this.departamento = departamento;
        this.barrio = barrio;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void imprimirInfo() {
        System.out.println("Uruguayo: " + super.toString() + ", ci: " + ci + ", departamento: " + departamento + ", barrio: " + barrio);
    }

    public void mudarse(String departamento, String barrio){
        
        departamento = this.departamento;
        barrio = this.barrio;
        
    }
}
