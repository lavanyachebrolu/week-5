public class CakeIcing implements CakeState{
    public void action(BirthdayCake cake){
        System.out.println("Preparing Icing for "+ cake.toString()+"...");
        cake.newState(this);
    }
    public String toString(){
        return "Icing State";
    }
}
