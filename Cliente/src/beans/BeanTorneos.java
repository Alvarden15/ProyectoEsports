package beans;

public class BeanTorneos {
    public BeanTorneos() {
        super();
    }
    String nombres, fecha, nombret;


    public BeanTorneos(String nombres, String fecha, String nombret) {
        this.nombres = nombres;
        this.fecha = fecha;
        this.nombret = nombret;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return nombres;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setNombret(String nombret) {
        this.nombret = nombret;
    }

    public String getNombret() {
        return nombret;
    }

}
