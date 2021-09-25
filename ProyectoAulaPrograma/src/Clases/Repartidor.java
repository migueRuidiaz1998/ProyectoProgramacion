
package Clases;


public class Repartidor {
    private int NoDocumento;
    private String Nombres;
    private String Apellidos;
    private int ZonaEntrega;
    private String Categoria;
    private String Usuario;
    private String Contraseña;

    public Repartidor() {
    }
    
    
    

    public Repartidor(int NoDocumento, String Nombres, String Apellidos, int ZonaEntrega, String Categoria, String Usuario, String Contraseña) {
        this.NoDocumento = NoDocumento;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.ZonaEntrega = ZonaEntrega;
        this.Categoria = Categoria;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public int getNoDocumento() {return NoDocumento; }
    public String getNombres() { return Nombres;  }
    public String getApellidos() {return Apellidos;}
    public int getZonaEntrega() {return ZonaEntrega;}
    public String getCategoria() {return Categoria;}
    public String getUsuario() { return Usuario;  }
    public String getContraseña() { return Contraseña;}

    public void setNoDocumento(int NoDocumento) { this.NoDocumento = NoDocumento; }
    public void setNombres(String Nombres) {this.Nombres = Nombres;}
    public void setApellidos(String Apellidos) {this.Apellidos = Apellidos;}
    public void setZonaEntrega(int ZonaEntrega) {this.ZonaEntrega = ZonaEntrega; }
    public void setCategoria(String Categoria) { this.Categoria = Categoria; }
    public void setUsuario(String Usuario) { this.Usuario = Usuario;}
    public void setContraseña(String Contraseña) {this.Contraseña = Contraseña;}
    
    
    
    
    
     
}
