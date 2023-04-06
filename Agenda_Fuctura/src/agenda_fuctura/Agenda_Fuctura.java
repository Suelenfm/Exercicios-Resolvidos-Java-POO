
package agenda_fuctura;

import java.util.Scanner;

public class Agenda_Fuctura {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
         Agenda a [] = new Agenda[6];
         a [0] = new Agenda ("Fuctura", "Av.agamenon magalhães" , "Fuctura@gmail.com", 81999575651l);
         a[0].mostra();
         
    
 }
}
