class ColdBrewCoffee implements Coffee {

    private double cost = 3.50;

    @Override
    public double makeCoffee() {
        // TODO Auto-generated method stub

        System.out.println("Cold Brew Coffee: $3.50");
        return cost;
    }

}
