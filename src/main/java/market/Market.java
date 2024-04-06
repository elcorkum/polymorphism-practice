package market;

public class Market {
    public static void main(String[] args) {
        Mango mango = new Mango();
        mango.peel();
        mango.removeSeed();
        mango.makeJuice();
        System.out.println("===================");

        PassionFruit passion = new PassionFruit();
        passion.createHole();
        passion.makeJuice();
        System.out.println("===================");

        Fruit mango2 = new Mango();
        mango2.makeJuice();
        //mango2 is of type Fruit and therefore has no access to the Mango class specific methods
        ((Mango) mango2).peel(); //casting Mango(type Fruit) to type Mango to access Mango methods
        ((Mango) mango2).removeSeed(); //This does not change mango2
        System.out.println("===================");

        mango2 = new PassionFruit(); //changing mango2 to instance of PassionFruit
        ((PassionFruit) mango2).createHole();//casting mango2 to PassionFruit type
        System.out.println("===================");


        Fruit[] fruits = {mango, passion, mango2};//array of type Fruit
        mango.blend(fruits);

    }
}
