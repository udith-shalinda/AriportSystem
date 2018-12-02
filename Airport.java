import java.util.Scanner;

public class Airport {
    PassengerQueue paQueue = new PassengerQueue();
    
    public static void main(String[] args){
       Airport air = new Airport();
       air.menu();
    }
    void menu(){
        System.out.println("Enter 'A' to add passenger \nEnter 'V' to view passengers \nEnter 'D' to delete passenger \nEnter 'E' to exit");
        Scanner scan = new Scanner(System.in);
        switch(scan.next()){
            case "A":
				if(paQueue.isFull()== 0){
					System.out.println("Enter the first name and sur name");
					Passenger passenger = new Passenger();
					passenger.setname(scan.next(), scan.next());
					paQueue.add(passenger);
				}else{
					System.out.println("Sorry,Can't add now");
				}
				break;
            
            case "D":
                paQueue.remove();
                break;
                
            case "V":
                paQueue.display();
                break;
             
            case "E":
                System.exit(0);
        }
        menu();
    }
}
