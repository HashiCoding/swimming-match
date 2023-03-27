public class Supporting_staff extends Person{
    private static int supporting_amount;

    public Supporting_staff(String name) {
        super(name, "Supporting staff member");
        supporting_amount +=1;
    }

    @Override
    public void setRole(String role) {
        super.setRole("Supporting Staff");
    }
}
