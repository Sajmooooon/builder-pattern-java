package builder;

public class Main {

    public static void main(String[] args){
        Pizza pizza = Pizza.createPizza().setBacon(true).setCheese(true).setSize("Small").build();
        System.out.println(pizza.toString());
    }

}
