import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ArrayList<Judge> judgesList = new ArrayList<Judge>();
        ArrayList<Swimmer> swimmersList = new ArrayList<Swimmer>();
        ArrayList<Supporting_staff> supportStaffList = new ArrayList<Supporting_staff>();
        ArrayList<Spectator> spectatorsList = new ArrayList<Spectator>();

        System.out.print("\nPlease Enter the amount of Judges : ");
        Scanner amount = new Scanner(System.in);
        int judgeCount = amount.nextInt();
        for(int i =0; i < judgeCount ; i++){
            Judge instanceJudge = new Judge("Judge_"+Integer.toString(i+1));
            judgesList.add(instanceJudge);
        }

        System.out.print("\nPlease Enter the amount of Swimmers : ");
        int swimmerCount = amount.nextInt();
        for(int i =0; i < swimmerCount; i++){
            Swimmer instanceJudge = new Swimmer("Swimmer_"+Integer.toString(i+1));
            swimmersList.add(instanceJudge);
        }

        System.out.print("\nPlease Enter the amount of Support Staff : ");
        int supportCount = amount.nextInt();
        for(int i =0; i < supportCount; i++){
            Supporting_staff instanceSupport = new Supporting_staff("Support_staff_member_"+Integer.toString(i+1));
            supportStaffList.add(instanceSupport);
        }

        System.out.print("\nPlease Enter the amount of Spectators : ");
        int spectatorsCount = amount.nextInt();
        for(int i =0; i < spectatorsCount; i++){
            Spectator instanceSpectator = new Spectator("Spectators_"+Integer.toString(i+1));
            spectatorsList.add(instanceSpectator);
        }

        amount.close();

        // Game begins

        judgesList.get(1).blow_whistle(); // A judge blow the whistle.
        for(Swimmer i: swimmersList){           // Swimmers start swimming.
            i.swim();
        }
        for(Spectator j: spectatorsList){       // Spectators check the Scoreboard.
            j.checkScoreboard();
        }

    }
}
