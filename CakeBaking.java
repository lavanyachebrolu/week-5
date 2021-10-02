public class CakeBaking implements CakeState{
    public void action(BirthdayCake cake){
        System.out.println("Baking "+ cake.toString()+"...");
        cake.newState(this);
    }
    public String toString(){
        return "Baking State";
    }
}
