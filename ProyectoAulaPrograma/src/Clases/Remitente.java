
package Clases;


public class Remitente {
   
    private String NombreCompletos;
    private String Direccion;
    private int codigoPostal;
    private int Telefono;

    public Remitente() {
    }

    public Remitente(String NombreCompletos, String Direccion, int codigoPostal, int Telefono) {
        this.NombreCompletos = NombreCompletos;
        this.Direccion = Direccion;
        this.codigoPostal = codigoPostal;
        this.Telefono = Telefono;
    }

    
    
    
    
    public String getNombreCompletos() { return NombreCompletos;  }
    public void setNombreCompletos(String NombreCompletos) { this.NombreCompletos = NombreCompletos;  }
    public String getDireccion() {   return Direccion; }
    public void setDireccion(String Direccion) {   this.Direccion = Direccion;    }
    public int getCodigoPostal() {        return codigoPostal;    }
    public void setCodigoPostal(int codigoPostal) {        this.codigoPostal = codigoPostal;    }
    public int getTelefono() { return Telefono;    }
    public void setTelefono(int Telefono) {   this.Telefono = Telefono; }
    
    
    
    
}
