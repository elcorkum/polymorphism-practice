package market;

public class Fruit {
    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Fruit(int calories) {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("Making juice");
    }

    public void blend(Fruit[] fruits) {
        System.out.println("Blending fruits into a juice mix.");
    }
}
