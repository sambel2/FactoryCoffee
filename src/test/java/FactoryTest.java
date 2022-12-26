import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryTest {

    Coffee order;
    double cost;
    @BeforeEach
    void init() {
        order = new DarkRoastCoffee();
    }

    @Test
    void initCoffee() {
        assertEquals("DarkRoastCoffee", order.getClass().getName(), "did not initialize DarkRoastCoffee object.");
    }

    @Test
    void basicCoffeeCost() {
        cost = order.makeCoffee();
        assertEquals(3.50, cost, "incorrect cost of Basic Coffee.");
    }

    @Test
    void addCreamCost() {
        order = new Cream(order);
        cost = order.makeCoffee();
        assertEquals(4.00, cost, "incorrect cost of Basic Coffee with Cream.");
    }

    /* Test Case 4: Basic Coffee Cost with Sugar Cost */
    @Test
    void addSugarCost() {
        order = new Sugar(order);
        cost = order.makeCoffee();
        assertEquals(4.00, cost, "incorrect cost of Basic Coffee with Sugar.");
    }

    @Test
    void addExtraShotCost() {
        order = new ExtraShot(order);
        cost = order.makeCoffee();
        assertEquals(5.00, cost, "incorrect cost of Basic Coffee with Extra Shot.");
    }

    @Test
    void addLightRoastCoffee() {
        order = new LightRoastCoffee();
        cost = order.makeCoffee();
        assertEquals(3.50, cost, "incorrect cost of Basic Coffee with Milk");
    }

}
