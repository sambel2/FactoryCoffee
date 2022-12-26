class ExtraShot extends CoffeeDecorator {

    private double cost = 1.50;

    public ExtraShot(Coffee specialCoffee) {
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee() + addShot();
    }

    private double addShot() {
        System.out.println(" + extra Shot: $1.50");
        return cost;
    }
}
