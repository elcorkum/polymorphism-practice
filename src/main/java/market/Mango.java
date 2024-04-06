package market;

public class Mango extends Fruit{

    public void peel() {
        System.out.println("Peel the mango.");
    }
    public void removeSeed(){
        System.out.println("Remove the seed that is at the center.");
    }

    public Mango () {
        super(200);
    }

    @Override
    public void makeJuice() {
        System.out.println("Making mango juice. It contains " + this.getCalories() + " calories.");
    }
}
