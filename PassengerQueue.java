public class PassengerQueue {
    int maxInt =3;
    int first =0;
    int last = -1;
    Passenger[] pa = new Passenger[maxInt];
    
    void add(Passenger passenger){
			if(last == maxInt-1){
				last=-1;
			}
			pa[++last] = passenger;
		
    }
    void remove(){
		if(isEmpty() == 0){
			if(first == maxInt-1){
				first =-1;
			}
			pa[first] = null;
			first++;
		}else 
			System.out.println("Queue is Empty,can't remove");
    }
	int isEmpty(){
		int count=0;
		for(int i =0; i < maxInt; i++){
			if(pa[i] == null){
				count++;
			}
		}
		if(count == maxInt){
			return 1;
		}else 
			return 0;
	}
	int isFull(){
		int count=0;
		for(int i =0; i < maxInt; i++){
			if(pa[i] == null){
				count++;
			}
		}
		if(count == 0){
			return 1;
		}else 
			return 0;	
	}
    void display(){
		if(first<= last){
			for(int i = first ; i <= last; i++){
				System.out.println("passenger is "+ pa[i].getfirstname()+ " "+ pa[i].getsurname());
			}
		}else{
			for(int i = first ; i < maxInt; i++){
				System.out.println("passenger is "+ pa[i].getfirstname()+ " "+ pa[i].getsurname());
			}
			for(int i = 0 ; i <= last; i++){
				System.out.println("passenger is "+ pa[i].getfirstname()+ " "+ pa[i].getsurname());
			}
		}
		System.out.println();
			
    }
}












