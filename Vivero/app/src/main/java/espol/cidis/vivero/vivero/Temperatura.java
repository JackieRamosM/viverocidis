package espol.cidis.vivero.vivero;

/**
 * Created by soporte on 2/6/15.
 */
public class Temperatura {

    private String fecha;
    private String hora;
    private String temp;

    public Temperatura(String fecha, String hora, String temp) {
        this.fecha = fecha;
        this.hora = hora;
        this.temp = temp;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
