package ejecutarhora;

import hora.horaM;

public class EjecutarHora {
    public static void main(String[] args) {
        
    
        horaM h = new horaM();
        
        h.setHoras(8);
        
        System.out.println("--------------------------------------------------");
        System.out.println(" Equivalencia de horas en minutos, segundos, días.");
        System.out.println("--------------------------------------------------");
        System.out.println("\nLas "+h.getHoras()+" horas equivalen "+h.getHoras()*60+" minutos ,"+h.getHoras()*3600+" segundos ");
        System.out.println("Las "+h.getHoras()+" horas en dias es: "+h.getHoras()*0.0416667);
        
        
    }
    
}
