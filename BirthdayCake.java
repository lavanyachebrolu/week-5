public class BirthdayCake {
   private CakeState state;
   private Flavor flavor;
 
   public BirthdayCake(String flavor) {
      state = null;
      this.flavor = Flavor.valueOf(flavor.toUpperCase());
   }
 
   public void newState(CakeState state){
      this.state = state;		
   }

   public CakeState currState(){
      return state;
   }
   
   @Override
   public String toString(){
      return flavor.toString() + " Cake";
   }
}
