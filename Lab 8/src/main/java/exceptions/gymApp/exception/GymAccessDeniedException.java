package exceptions.gymApp.exception;

public class GymAccessDeniedException extends Exception{

    public GymAccessDeniedException(){
        super("You are not a member of this club!");
    }
}
