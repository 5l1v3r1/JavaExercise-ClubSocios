package ClubSocios;
public class Socio {
    
    String cliente, categoria;
    int vendido, edad, precio;
//                      Constructor

    public Socio(String cliente, String categoria, int vendido, int edad, int precio) {
        this.cliente = cliente;
        this.categoria = categoria;
        this.vendido = vendido;
        this.edad = edad;
        this.precio = precio;
    }

   
//                  Fin constructor
 
    public double cantidad_boletos(){
        if (categoria.equalsIgnoreCase("A")) {
            return 25;
        }
        if (categoria.equalsIgnoreCase("B")) {
           
            return 20;
        }
        if (categoria.equalsIgnoreCase("C")) {
   
            return 15;
        }
        return 0;
    }
    public double pago_mensual(){
        if (categoria.equalsIgnoreCase("A")) {
            return  200;
        }
        if (categoria.equalsIgnoreCase("B")) {
            return  150;
        }
        if (categoria.equalsIgnoreCase("C")) {
            return  100;
        }
        return 0;
    }
    public double total(){
        return cantidad_boletos()*precio;
    
    }
    public double total_descuento(){
            return (total()- (( total()*descuento()/100)   + descuento_vendido()+ descuento_edad()));
    }
    
    public double descuento(){
        if (categoria.equalsIgnoreCase("A")) {
            return  4;
        }
        if (categoria.equalsIgnoreCase("B")) {
            return  3;
        }
        if (categoria.equalsIgnoreCase("C")) {
            return  2;
        }
        return 0;
    }
    public double descuento_vendido(){
        if (vendido > cantidad_boletos()) {
            return vendido * 2; //menos esta cantidad
        }
       
        return 0;
    }
    public double descuento_edad(){
        if (edad < 55) {
            return descuento(); //menos esta cantidad
        }
       
        return 0;
    }
   
   

  
    
}
