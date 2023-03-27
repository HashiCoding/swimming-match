public class Spectator extends Person{
    private static int spectator_amount;
    public Spectator(String name){
        super(name,"Spectator");
        spectator_amount += 1;
    }
    @Override
    public void setRole(String role) {
        super.setRole("Spectators");
    }

}
