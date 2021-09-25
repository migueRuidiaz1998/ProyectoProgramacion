
package Clases;


public class Delivery_Upar {
    public static void main(String[] args) {
        
       Administrador A = new Administrador(123456789, "Juan Sebastian Rodrigue", "juanseba", "123456");
       mostrar(A);
       Cliente C = new Cliente(567897554);
       mostrar(C);
       Destinatario D = new Destinatario("Luis Eduardo Perez", "Calle 23#12-24", 10, 320203456);
       mostrar(D);
       ObservacionesAdicionales O = new ObservacionesAdicionales("12/02/2021", "Ninguna");
       mostrar(O);
        Paquete P = new Paquete("Caja", 10, 10000);
        mostrar(P);
        Paqueteria PA = new Paqueteria(2, "01/02/2021");
        mostrar(PA);
        Remitente R = new Remitente("Juan Jose Payares", "Valledupar", 023, 320543345);
        Repartidor R1 = new Repartidor(12345678, "Santiago", "Pertuz", 230, "A", "PertuzSAn", "1235433");
        
        
        
        
    }
 
    public static void mostrar(Administrador s) {
        System.out.println("ADMINISTRADOR");
     System.out.println("Documento: " + s.getNoDocumento());
        System.out.println("Nombre: "+ s.getNombres());
        System.out.println("Usuario: " + s.getUsuario());
    System.out.println(" ");
    
    }
    
     public static void mostrar(Cliente s) {
         System.out.println("CLIENTE");
     System.out.println("Documento: " + s.getNoDocumento());
        System.out.println(" ");
    
    
    }
    public static void mostrar(Destinatario s) {
   System.out.println("DESTINATARIO");
        System.out.println("Nombre: "+ s.getNombreCompletos());
        System.out.println("Direccion: " + s.getDireccion());
        System.out.println("Codigo Postal: "+s.getCodigoPostal());
        System.out.println("Telefono: " +s.getTelefono());
        System.out.println(" ");
    }
    
     public static void mostrar(ObservacionesAdicionales s) {
   System.out.println("OBSERVACIONES ADICIONALES");
        System.out.println("Nombre: "+ s.getFechaLimiteEntrega());
        System.out.println("Direccion: " + s.getObservaciones());
       System.out.println(" ");
    }
    
      public static void mostrar(Paquete s) {
   System.out.println("PAQUETE");
        System.out.println("Tipo: "+ s.getTipo());
        System.out.println("Peso: " + s.getPeso());
        System.out.println("Valor: " + s.getValorDeclarado());
       System.out.println(" ");
    }
    
      public static void mostrar(Paqueteria s) {
   System.out.println("PAQUETERIA");
        System.out.println("Paquetes: "+ s.getFechaIngreso());
        System.out.println("Fecha: " + s.getFechaIngreso());
        System.out.println(" ");
    } 
      
      
      
}
