/**
 * This program simulates a swimming competition with judges, swimmers, supporting staff, and spectators.
 * It creates instances of the Person class and its concrete subclasses Judge, Swimmer, Supporting_staff, and Spectator.
 * The number of swimmers, spectators, judges, and supporting staff members can be specified through command-line arguments.
 * 
 * To run "javac Main.java" and "java Main <swimmersCount> <spectatorCount> <judgeCount> <spectatorCount>"
 * 
 * 
 * @author  D.G. Hansana Prabashwara (210483T).
 * @version 1.0
 * @since  2023-03-28
*/

import java.util.ArrayList;


/**
 * This abstract class represents a person in the swimming competition.
 * It takes name and role as arguments and create a uniqe id.
 * Setters and getters are declared to those attributes.
 * A massage will be printed when an instance from child class is created.
 * Since checking scoreboard is common for all, the method to check scoreboard is implemented here.
*/
abstract class Person{

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
    
    public static int getId() {
        return id;
    }
    
    public String getRole(){
        return role;
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


/**
 * This class is created using Person abstract class.
 * It keeps the amount of judge instances in a static variable.
 * Also this class has an additional method to blow the whistle to start the game.
 */
class Judge extends Person{
    private static int judge_amount;

    public Judge(String name) {
        super(name, "Judge");
        judge_amount +=1;
    }

    public void blow_whistle(){
        System.out.println("Judge "+ getName() + " blows the whistle. And the game has begun!");
    }

    public static int amount(){
        return judge_amount;
    }
}


/**
 * This class is created using Person abstract class.
 * It keeps the amount of sepectator instances in a static variable.
 */
class Spectator extends Person{
    private static int spectator_amount;

    public Spectator(String name){
        super(name,"Spectator");
        spectator_amount += 1;
    }
    
    public static int amount(){
        return spectator_amount;
    }
}


/**
 * This class is created using Person abstract class.
 * It keeps the amount of supporting staff member instances in a static variable.
 */
class Supporting_staff extends Person{
    private static int supporting_amount;

    public Supporting_staff(String name) {
        super(name, "Supporting staff member");
        supporting_amount +=1;
    }

    public static int amount(){
        return supporting_amount;
    }
}


/**
 * This class is created using Person abstract class.
 * It keeps the amount of judge instances in a static variable.
 * This class has an additional method to start swimming
 */
class Swimmer extends Person{
    private static int swimmer_amount;
    
    public Swimmer(String name) {
        super(name,"Swimmer");
        swimmer_amount +=1;
    }

    public void swim(){
        System.out.println("Swimmer "+ super.getName() + "" + " started swimming");
    }

    public static int amount(){
        return swimmer_amount;
    } 
    
}


public class Main {
    /**
     * This main method takes command line arrguments and create instances.
     * And all the instances are stored in relavent arraylists.
     */
    public static void main(String[] args){
        // Arraylists to store created objects.
        ArrayList<Judge> judgesList = new ArrayList<Judge>();
        ArrayList<Swimmer> swimmersList = new ArrayList<Swimmer>();
        ArrayList<Supporting_staff> supportStaffList = new ArrayList<Supporting_staff>();
        ArrayList<Spectator> spectatorsList = new ArrayList<Spectator>();

        // variables to store commandline arguments
        int swimmerCount = Integer.parseInt(args[0]);
        int spectatorsCount = Integer.parseInt(args[1]);
        int judgeCount = Integer.parseInt(args[2]);
        int supportCount = Integer.parseInt(args[3]);

        
        // Create instances according to the given arguments.
        for(int i =0; i < judgeCount ; i++){
            Judge instanceJudge = new Judge("Judge_"+ Integer.toString(i+1));
            judgesList.add(instanceJudge);
        }

        for(int i =0; i < swimmerCount; i++){
            Swimmer instanceJudge = new Swimmer("Swimmer_"+Integer.toString(i+1));
            swimmersList.add(instanceJudge);
        }

        for(int i =0; i < supportCount; i++){
            Supporting_staff instanceSupport = new Supporting_staff("Support_staff_member_"+Integer.toString(i+1));
            supportStaffList.add(instanceSupport);
        }

        for(int i =0; i < spectatorsCount; i++){
            Spectator instanceSpectator = new Spectator("Spectators_"+Integer.toString(i+1));
            spectatorsList.add(instanceSpectator);
        }


        // Game begins
        // A judge blow the whistle.
        judgesList.get(1).blow_whistle(); 
        // Swimmers start swimming.
        for(Swimmer i: swimmersList){           
            i.swim();
        }
        // Spectators check the Scoreboard.
        for(Spectator j: spectatorsList){       
            j.checkScoreboard();
        }

    }  
}
