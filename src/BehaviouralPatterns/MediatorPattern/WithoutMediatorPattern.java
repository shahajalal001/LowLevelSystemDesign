package BehaviouralPatterns.MediatorPattern;

class User{
    private String name;

    public User(String name){
        this.name = name;
    }

    public void sendMessage(String msg, User recipient){
        System.out.println(this.name + " sending " + msg + " to " + recipient.getName());
    }

    public String getName(){
        return  name;
    }
}

public class WithoutMediatorPattern {
    public static void main(String[] args) {
        User rahul = new User("Rahul");
        User amit = new User("Amit");
        User kabir = new User("Kabir");

        rahul.sendMessage("Hi", amit);
        amit.sendMessage("Hey", kabir);
    }
}
