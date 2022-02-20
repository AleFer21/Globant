package practicoprogramacionoo;

public class Cedula {

    private int numero;
    private int digitoVerificador;

    public Cedula() {
    }

    public Cedula(int numero, int digitoVerificador) {
        this.numero = numero;
        this.digitoVerificador = digitoVerificador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(int digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    @Override
    public String toString() {
        return "Cedula: " + "numero: " + numero + ", digitoVerificador: " + digitoVerificador;
    }
    
    
}
