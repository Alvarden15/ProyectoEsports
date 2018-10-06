package beans;

public class BeanGanadores {
    public BeanGanadores() {
        super();
    }
    
    String nombreGanador,resultado,fechaTorneo,nombreTorneo,califica;

    
    public BeanGanadores(String ng,String res, String fTorneo,String nTorneo, String cali){
        nombreGanador=ng;
        resultado=res;
        fechaTorneo=fTorneo;
        nombreTorneo=nTorneo;
        califica=cali;
        
    }
    
    public void setNombreGanador(String nombreGanador) {
        this.nombreGanador = nombreGanador;
    }

    public String getNombreGanador() {
        return nombreGanador;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setFechaTorneo(String fechaTorneo) {
        this.fechaTorneo = fechaTorneo;
    }

    public String getFechaTorneo() {
        return fechaTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setCalifica(String califica) {
        this.califica = califica;
    }

    public String getCalifica() {
        return califica;
    }
}
