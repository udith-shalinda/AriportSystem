import java.util.*;
import java.io.*;

public class Airport {
    PassengerQueue paQueue = new PassengerQueue();
    Passenger []passengerArray = new Passenger[100];
	
    public static void main(String[] args){
       Airport air = new Airport();
       air.menu();
    }
	
    void menu(){
        System.out.println("Enter 'A' to add passenger \nEnter 'V' to view passengers");
		 System.out.println("Enter 'D' to delete passenger \nEnter 'E' to exit\nEnter 'S' to simulate");
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
				if(paQueue.isEmpty()==0){
					paQueue.display();
					
				}else{
					System.out.println("Queue is empty");
				}
                break;
				
			case "S" :
				simulation();
				break;
             
            case "E":
                System.exit(0);
        }
        menu();
    }
	
	int createRandomNumber(){
		Random random = new Random();
		int numberOfPassengers = random.nextInt(6) + 1;
		return numberOfPassengers;
	}
	static int passengerArraycount =0;
	void importFormFile(){
		try{
			File file = new File("test.txt");
			Scanner scan = new Scanner(file);
			int count = 0;
			while(scan.hasNextLine()){
				Passenger passenger = new Passenger();
				passenger.setname(scan.next(), scan.next());
				passengerArray[count] = passenger;
				count++;
			}
			passengerArraycount = count;
		}catch(Exception e){
			System.out.println("Exception");
		}	
	}
	
	static int simulateLoopstart = 0;     
	
	void simulation(){
		importFormFile();
		if(simulateLoopstart <= passengerArraycount ){	
			int randomNumber = createRandomNumber();
			for(int i = simulateLoopstart; i< simulateLoopstart+randomNumber; i++){
				if(passengerArray[i] !=null){
					paQueue.add(passengerArray[i]);
				}
			
			}
			simulateLoopstart  += randomNumber;
		
			int delayTime = createRandomNumber()*createRandomNumber()*createRandomNumber();
			for(int i =0; i < 20;i++){		
				//paQueue.pa[i].setsecondsInQueue(delayTime);    //create a NullPointerException;
				if(paQueue.pa[i] != null){
					paQueue.pa[i].setsecondsInQueue(delayTime); 
				}
			}
			
		
			paQueue.remove();
			simulation();
		}else{
			System.out.println("simulate complete");
		}
		
	}
}



