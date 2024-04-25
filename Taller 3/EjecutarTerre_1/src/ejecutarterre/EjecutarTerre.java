package ejecutarterre;

import Terreno.terreno;

public class EjecutarTerre {

    public static void main(String[] args) {
        
    terreno t = new terreno();
    double area;
    
    
    t.setAncho(150.90);
    t.setLargo(180.8);
    t.setvalorMetroCuadrado(20);
    
    
    area=(t.getAncho()*t.getLargo());
    
        System.out.println("-----------------");
        System.out.println("COSTO DEL TERRENO");
        System.out.println("-----------------");
        System.out.println("\nEl costo de un terreno rectangular es de: "+area * t.getvalorMetroCuadrado()+" dolares");
        
    }
    
}
