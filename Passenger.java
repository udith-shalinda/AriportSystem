public class Passenger {
    String firstname;
    String surname;
    int secondsInQueue;
    
    void setname(String firstname, String surname){
        this.firstname = firstname;
        this.surname = surname; 
    }
    void setsecondsInQueue(int secondsInQueue){
        this.secondsInQueue = secondsInQueue;
    }
    public String getfirstname(){
        return firstname;
    }
    public String getsurname(){
        return surname;
    }
    public int getSecondsInQueue(){
        return secondsInQueue;
    }
    
    
}
