package builder;

public class Main {

    public static void main(String[] args){
        Pizza pizza = Pizza.createPizza().setBacon(true).setCheese(true).setSize("Small").build();
        System.out.println(pizza.toString());

        Director director = new Director();
        Pizza.Builder pizzaBuilder = Pizza.createPizza();
        director.setAlTonno(pizzaBuilder);
        Pizza pizza1 = pizzaBuilder.build();
        System.out.println(pizza1);
    }

}
