package cl.tuserver.clase_9;

public class CualquierCosa {
    private String nombreDeLaCosa;
    private double valorDeLaCosa;

    public CualquierCosa(String nombreDeLaCosa, double valorDeLaCosa){
        setNombreDeLaCosa(nombreDeLaCosa);
        setValorDeLaCosa(valorDeLaCosa);
    }

    public String getNombreDeLaCosa() {
        return nombreDeLaCosa;
    }

    public void setNombreDeLaCosa(String nombreDeLaCosa) {
        this.nombreDeLaCosa = nombreDeLaCosa;
    }

    public double getValorDeLaCosa() {
        return valorDeLaCosa;
    }

    public void setValorDeLaCosa(double valorDeLaCosa) {
        this.valorDeLaCosa = valorDeLaCosa;
    }
}
