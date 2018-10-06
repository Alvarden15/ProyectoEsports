package beans;

public class BeanJuego {
    public BeanJuego() {
        super();
    }
    int codJuego, codEmp;
    String nombre, genero,calificacion, modalidad ;
    double precio;


    public BeanJuego(int codJuego, int codEmp, String nombre, String genero, String calificacion, String modalidad,
                     double precio) {
        this.codJuego = codJuego;
        this.codEmp = codEmp;
        this.nombre = nombre;
        this.genero = genero;
        this.calificacion = calificacion;
        this.modalidad = modalidad;
        this.precio = precio;
    }

    public void setCodJuego(int codJuego) {
        this.codJuego = codJuego;
    }

    public int getCodJuego() {
        return codJuego;
    }

    public void setCodEmp(int codEmp) {
        this.codEmp = codEmp;
    }

    public int getCodEmp() {
        return codEmp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

}
