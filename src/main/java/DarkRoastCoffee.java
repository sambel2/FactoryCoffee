class DarkRoastCoffee implements Coffee {

    private double cost = 3.50;

    @Override
    public double makeCoffee() {
        // TODO Auto-generated method stub

        System.out.println("DarkRoast Coffee: $3.50");
        return cost;
    }

}
