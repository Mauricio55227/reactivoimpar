package REACTIVO;

 // @author MB
 
public class REACTIVO {

    private String nombre;
    private int cantUsusarios;
    private Integer tiempo;
    private String nivel;
    private int estrella;

    public REACTIVO(String nombre, int cantUsuarios, int tiempo, String nivel, int estrella) {
        this.nombre = nombre;
        this.cantUsusarios = cantUsuarios;
        this.estrella = estrella;
        this.tiempo = tiempo;
        this.nivel = nivel;
    }

    public int calidad(){
        return cantUsusarios*tiempo*estrella;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantUsusarios() {
        return cantUsusarios;
    }

    public void setCantUsusarios(int cantidadUsusarios) {
        this.cantUsusarios = cantidadUsusarios;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
  public String getNivel() {
        return nivel;
    }
    public int getEstrella() {
        return estrella;
    }

    public void setEstrella(int estrella) {
        this.estrella = estrella;
    }

    @Override
    public String toString() {
        return "Reactivo Impar{" + "Nombre de la Plataforma=" + nombre + ", Cantidad de usuarios=" + cantUsusarios + ", tiempo=" + tiempo + ", nivel=" + nivel + ", estrella=" + estrella + '}';
    }
    
}
