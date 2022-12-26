public class FactoryCoffee {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Coffee order = new Sugar( new Cream( CoffeeFactory.getCoffee("lr")));

        double cost = order.makeCoffee();

        System.out.println("Total cost: $" + cost);

        Coffee order2 = new Sugar(order);

        double cost2 = order2.makeCoffee();

        System.out.println("Total cost: $" + cost2);

    }

}


