import ny.*;

public class Base4 {
    public static void main(String[] args) {
        //Объявление переменных для классов
        Candy candy1 = new Candy("Smarties", 1.2, 7.5, "toffee");
        Jellybean jellybean1 = new Jellybean("Nerds", 0.5, 3.4, "Grape");
        Jellybean jellybean2 = new Jellybean("Jelly Slugs", 0.06, 6.65, "Strawberry");
        Chocolate chocolate1 = new Chocolate("Milka", 0.2, 2.85, "dark");
        Chocolate chocolate2 = new Chocolate("Hershey's", 0.04, 3.82, "milk");
        Cookie cookie1 = new Cookie("Oreo", 0.15, 4.15, "IceCream");
        Cookie cookie2 = new Cookie("Pop-Tarts", 0.1, 3.32, "Blueberry");

        //Объявление переменных для вычисления общего веса и стоимости
        String sumW;
        String sumP;
        //Вычисление общего веса
        sumW=Double.toString(jellybean1.getWeight()+candy1.getWeight()+jellybean2.getWeight()+chocolate1.getWeight()+chocolate2.getWeight()+cookie1.getWeight()+cookie2.getWeight());
        //Вычисление общей стоимости
        sumP=Double.toString(candy1.getPrice()+jellybean1.getPrice()+jellybean2.getPrice()+chocolate1.getPrice()+chocolate2.getPrice()+cookie1.getPrice()+cookie2.getPrice());

        //Вывод списка сладостей
        Sweets[] box={candy1, jellybean1, jellybean2, chocolate1, chocolate2, cookie1, cookie2};
        System.out.println("Order items:");
        for(Sweets someSweets: box){
            System.out.println(someSweets.toString());
        }
        System.out.println("\n");
        //Вывод общего веса и общей стоимости
        System.out.println("TOTAL WEIGHT: " + sumW + " TOTAL COST: " + sumP);
    }
}
