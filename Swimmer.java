public class Swimmer extends Person{
    private static int swimmer_amount;
    
    public Swimmer(String name) {
        super(name,"Swimmer");
        swimmer_amount +=1;
    }

    @Override
    public void setRole(String role) {
        super.setRole("Swimmers");
    }

    public void swim(){
        System.out.println("Swimmer "+ super.getName() + "" + " started swimming");
    }
}
