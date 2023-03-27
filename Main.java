import java.util.ArrayList;


public class Main {
    public static void main(String[] args){

        ArrayList<Judge> judgesList = new ArrayList<Judge>();
        ArrayList<Swimmer> swimmersList = new ArrayList<Swimmer>();
        ArrayList<Supporting_staff> supportStaffList = new ArrayList<Supporting_staff>();
        ArrayList<Spectator> spectatorsList = new ArrayList<Spectator>();


        int swimmerCount = Integer.parseInt(args[0]);
        int spectatorsCount = Integer.parseInt(args[1]);
        int judgeCount = Integer.parseInt(args[2]);
        int supportCount = Integer.parseInt(args[3]);


        for(int i =0; i < judgeCount ; i++){
            Judge instanceJudge = new Judge("Judge_"+Integer.toString(i+1));
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

        judgesList.get(1).blow_whistle(); // A judge blow the whistle.
        for(Swimmer i: swimmersList){           // Swimmers start swimming.
            i.swim();
        }
        for(Spectator j: spectatorsList){       // Spectators check the Scoreboard.
            j.checkScoreboard();
        }

    }
}
