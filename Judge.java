public class Judge extends Person{
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
