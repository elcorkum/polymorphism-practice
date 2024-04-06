package market;

public class PassionFruit extends Fruit{
    public PassionFruit() {
        super(90);
    }

    public void createHole() {
        System.out.println("Create a hole that will allow for the contents of the fruit to be squeezed out.");
    }

    @Override
    public void makeJuice() {
        System.out.println("Making passion fruit juice. It contains " + this.getCalories() + " calories");
    }
}
