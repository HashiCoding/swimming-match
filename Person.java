public abstract class Person{
    private String name;
    private static int id;
    private String role;

    public Person(String the_name, String the_role){
        this.name = the_name;
        this.role = the_role;
        id += 1;
        System.out.println(this.name + " has arrived at the premises");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getRole(){
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void checkScoreboard(){
        System.out.println(this.role+ " " + this.name +" checked the scoreboard");
    }
}