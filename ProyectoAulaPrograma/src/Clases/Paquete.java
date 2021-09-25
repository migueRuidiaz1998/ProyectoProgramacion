
package Clases;


public class Paquete {
    private  String Tipo;
    private int valorDeclarado;
    private int peso;

    public Paquete() {
    }

    public Paquete(String Tipo, int valorDeclarado, int peso) {
        this.Tipo = Tipo;
        this.valorDeclarado = valorDeclarado;
        this.peso = peso;
    }

    public String getTipo() { return Tipo; }
    public void setTipo(String Tipo) {  this.Tipo = Tipo; }
    public int getValorDeclarado() {   return valorDeclarado; }
    public void setValorDeclarado(int valorDeclarado) { this.valorDeclarado = valorDeclarado;    }
    public int getPeso() {      return peso;    }
    public void setPeso(int peso) {        this.peso = peso;    }
    
    
    
    
    
}
