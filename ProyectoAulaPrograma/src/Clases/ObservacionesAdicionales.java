
package Clases;


public class ObservacionesAdicionales {
    private String FechaLimiteEntrega;
    private String Observaciones;

    public ObservacionesAdicionales() {
    }

    public ObservacionesAdicionales(String FechaLimiteEntrega, String Observaciones) {
        this.FechaLimiteEntrega = FechaLimiteEntrega;
        this.Observaciones = Observaciones;
    }

    public String getFechaLimiteEntrega() { return FechaLimiteEntrega;  }
    public void setFechaLimiteEntrega(String FechaLimiteEntrega) { this.FechaLimiteEntrega = FechaLimiteEntrega;    }
    public String getObservaciones() {    return Observaciones;    }
    public void setObservaciones(String Observaciones) {     this.Observaciones = Observaciones; }
    
    
    
    
    
    
}
