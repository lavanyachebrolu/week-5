public class CakeBakery {
    public void placeOrder(String flavor){
        BirthdayCake cake = new BirthdayCake(flavor);
        
        processState(new PreapringBatter(), cake);
        processState(new CakeBaking(), cake);
        processState(new CakeIcing(), cake);

        System.out.println("Order completed");
    }
    public void processState(CakeState state, BirthdayCake cake){
        state.action(cake);
        System.out.println(cake.currState().toString());
    }
}
