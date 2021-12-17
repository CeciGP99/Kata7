package kata6;

import Business.ToyBusiness;
import Factories.RegionalFactories.AmericanCarToyFactory;
import Factories.RegionalFactories.AmericanHelicopterToyFactory;
import Factories.RegionalFactories.AsianCarToyFactory;
import Factories.RegionalFactories.AsianHelicopterToyFactory;
import Factories.ToyFactory;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ToyFactory carToyFactory = new AmericanCarToyFactory();
        ToyFactory helicopterToyFactory = new AmericanHelicopterToyFactory();
        ToyBusiness toyBusiness = new ToyBusiness();
        
        toyBusiness.add("Car", carToyFactory);
        toyBusiness.add("Helicopter", helicopterToyFactory);
        
        while(true){
            System.out.println("Introduce comando: ");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                break;
            }else if(command.equals("Car")){
                toyBusiness.produceToy(command);
            }else if(command.equals("Helicopter")){
                toyBusiness.produceToy(command);
            } else {
                System.out.println("Comando desconocido");
            }
        }
        
        System.out.println("Aplicación del cliente finalizado");
        
    }
    
}
