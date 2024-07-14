import java.util.Scanner;
import java.io.PrintStream;

public class tripSimulator {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        PrintStream show = new PrintStream(System.out);

    
        int type;
        int km;
        double Kmliters;
        double cost;

            show.println(">Trip Simulator Iniciated<");

                show.println(" ");

                        show.println("How far is the trip?");
                          int Km1 = scan.nextInt();                           
                            km = Km1;

                show.println(" ");

                        show.println("How many km does your car do per liter?");
                            double Kmlit = scan.nextDouble();
                                Kmliters = Kmlit;
                                
                show.println(" ");

                        show.println("What type of fuel does your car use?");
                            show.println("1-Ethanol");
                            show.println("2-Gasoline");

                show.println(" ");
                        
                                type = scan.nextInt();
                                
                show.println(" ");                    
                    
                    switch (type) {
                        case 1:
                        
                                show.println("Your car use Ethanol!");

                            show.println(" ");    

                                    show.println("What's the price of ethanol in your region?");
                                        double ethanol = scan.nextDouble();
                                        cost = (km / Kmliters) * ethanol;

                            show.println(" ");        
                                  
                                  show.println("You will spend approximately " + "R$" + cost);
                            
                            break;
                        case 2: 

                                show.println("Your car use Gasoline!");

                            show.println(" ");

                                    show.println("What's the price of gasoline in your region?");
                                        double gasoline = scan.nextDouble();
                                        cost = (km / Kmliters) * gasoline;

                            show.println(" ");

                                   show.println("you will spend approximately " + "R$" + cost);

                            break;
                        default:

                            show.println("Program Close");
                            scan.close();

                            break;
        }

    }
        
}