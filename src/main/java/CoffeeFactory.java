class CoffeeFactory {


    public static Coffee getCoffee(String type) {

        switch (type) {

            case "cb":
                return new ColdBrewCoffee();


            case "lr":
                return new LightRoastCoffee();


            case "dr":
                return new DarkRoastCoffee();


            default:
                System.out.println("unknown option: returning Light Roast");
                return new LightRoastCoffee();
        }
    }


}
