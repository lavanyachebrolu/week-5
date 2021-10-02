public class PreapringBatter implements CakeState{
    public void action(BirthdayCake cake){
        System.out.println("Preparing batter "+ cake.toString()+"...");
        cake.newState(this);
    }
    public String toString(){
        return "Preparation State";
    }
}
