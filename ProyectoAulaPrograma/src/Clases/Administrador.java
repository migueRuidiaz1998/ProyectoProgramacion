
package Clases;

public class Administrador {
    private int NoDocumento;
    private String Nombres;
    private String Usuario;
    private String Contraseña;

    public Administrador() {
    }
    

    public Administrador(int NoDocumento, String Nombres, String Usuario, String Contraseña) {
        this.NoDocumento = NoDocumento;
        this.Nombres = Nombres;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public int getNoDocumento() { return NoDocumento; }
    public String getNombres() { return Nombres;  }
    public String getUsuario() { return Usuario; }
    public String getContraseña() { return Contraseña;}    

    public void setNoDocumento(int NoDocumento) { this.NoDocumento = NoDocumento;  }
    public void setNombres(String Nombres) {this.Nombres = Nombres;}
    public void setUsuario(String Usuario) { this.Usuario = Usuario;}
    public void setContraseña(String Contraseña) {this.Contraseña = Contraseña;}
    
    
    
    
    public void Adicionar(){
    
    
    }
    public void Editar(){
    
    
    }
    
    public void EliminarRepartidor(){
    
    
    }
    
}
