package beans;

public class BeanHeroe {
    public BeanHeroe() {
        super();
    }
    private String nickname; 
        private String heroe;
        private  double k;
        private  double d;
        private  double a;
        private  double kda;
        private double win;
        private int partidas;
        private int Core;
        private int Supp;
        private int mid;
        private int safe;
        private int off;
        private int jungla;
        private int roaming;
        
        
        //Para el listado
        
        private String nombreJ, apellidoJ;
        private double cantidad;

        public BeanHeroe(String nick,String Njug,String ajug, double cant) {
            nickname= nick;
            nombreJ=Njug;
            cantidad=cant;
            apellidoJ=ajug;
        }

        public BeanHeroe(String nickname, String heroe, double k, double d, double a, double kda, double win, int partidas,
                     int Core, int Supp, int mid, int safe, int off, int jungla, int roaming) {
            this.setNickname(nickname);
            this.setHeroe(heroe);
            this.setK(k);
            this.setD(d);
            this.setA(a);
            this.setKda(kda);
            this.setWin(win);
            this.setPartidas(partidas);
            this.setCore(Core);
            this.setSupp(Supp);
            this.setMid(mid);
            this.setSafe(safe);
            this.setOff(off);
            this.setJungla(jungla);
            this.setRoaming(roaming);
        }


    public void setNombreJ(String nombreJ) {
        this.nombreJ = nombreJ;
    }

    public String getNombreJ() {
        return nombreJ;
    }

    public void setApellidoJ(String apellidoJ) {
        this.apellidoJ = apellidoJ;
    }

    public String getApellidoJ() {
        return apellidoJ;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }


    public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getHeroe() {
            return heroe;
        }

        public void setHeroe(String heroe) {
            this.heroe = heroe;
        }

        public double getK() {
            return k;
        }

        public void setK(double k) {
            this.k = k;
        }

        public double getD() {
            return d;
        }

        public void setD(double d) {
            this.d = d;
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getKda() {
            return kda;
        }

        public void setKda(double kda) {
            this.kda = kda;
        }

        public double getWin() {
            return win;
        }

        public void setWin(double win) {
            this.win = win;
        }

        public int getPartidas() {
            return partidas;
        }

        public void setPartidas(int partidas) {
            this.partidas = partidas;
        }

        public int getCore() {
            return Core;
        }

        public void setCore(int Core) {
            this.Core = Core;
        }

        public int getSupp() {
            return Supp;
        }

        public void setSupp(int Supp) {
            this.Supp = Supp;
        }

        public int getMid() {
            return mid;
        }

        public void setMid(int mid) {
            this.mid = mid;
        }

        public int getSafe() {
            return safe;
        }

        public void setSafe(int safe) {
            this.safe = safe;
        }

        public int getOff() {
            return off;
        }

        public void setOff(int off) {
            this.off = off;
        }

        public int getJungla() {
            return jungla;
        }

        public void setJungla(int jungla) {
            this.jungla = jungla;
        }

        public int getRoaming() {
            return roaming;
        }

        public void setRoaming(int roaming) {
            this.roaming = roaming;
        }
}
