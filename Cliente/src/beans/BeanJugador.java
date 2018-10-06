package beans;

public class BeanJugador {
    public BeanJugador() {
        super();
    }
    
    String nombre, id, apellido, sexo,email, fechaNac, fechaRec, pais;
    int codigoEquipo, cantidad;


    public BeanJugador(String nombre, String id, String ciudad, String sexo, String email, String fechaNac,
                       String fechaRec, String pais, int codigoEquipo) {
        this.nombre = nombre;
        this.id = id;
        this.apellido = ciudad;
        this.sexo = sexo;
        this.email = email;
        this.fechaNac = fechaNac;
        this.fechaRec = fechaRec;
        this.pais = pais;
        this.codigoEquipo = codigoEquipo;
       
    }
    public BeanJugador(int cant, String p){
        pais=p;
        cantidad=cant;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaRec(String fechaRec) {
        this.fechaRec = fechaRec;
    }

    public String getFechaRec() {
        return fechaRec;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setCodigoEquipo(int codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public int getCodigoEquipo() {
        return codigoEquipo;
    }

  

}
