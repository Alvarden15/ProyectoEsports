package beans;

public class BeanEmp {
    public BeanEmp() {
       
    }
    String nombre,fecha,direct, nomjuego , califica, como;
    int cod;
    
    public BeanEmp(int c,String nom, String fec,String dir) {
       cod=c;
       nombre=nom;
       fecha=fec;
       direct=dir;
    }

    public BeanEmp(String nombre, String nomjuego, String califica, String como) {
        this.nombre = nombre;
        this.nomjuego = nomjuego;
        this.califica = califica;
        this.como = como;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public String getDirect() {
        return direct;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }


    public void setNomjuego(String nomjuego) {
        this.nomjuego = nomjuego;
    }

    public String getNomjuego() {
        return nomjuego;
    }

    public void setCalifica(String califica) {
        this.califica = califica;
    }

    public String getCalifica() {
        return califica;
    }

    public void setComo(String como) {
        this.como = como;
    }

    public String getComo() {
        return como;
    }
}
