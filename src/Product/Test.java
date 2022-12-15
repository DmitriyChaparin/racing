package Product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Product> bag = new HashSet<>();

        Product banana = new Product("Бананы", 79, 2);
        Product apple = new Product("Яблоки", 55, 2);
        Product tomato = new Product("Томаты", 123.5, 2);
        Product potato = new Product("Картошка", 19.8, 2);
        tomato.add(bag);
        potato.add(bag);
        apple.add(bag);
        banana.add(bag);
        System.out.println(bag);
        banana.remove(bag);
        System.out.println(bag);

        Set<Recipe> recipes = new HashSet<>();

        Recipe salad = new Recipe("Салат");
        Recipe cake = new Recipe("Пирог");
        salad.add(banana, apple, tomato);
        cake.add(banana, apple);
        System.out.println(salad);
        salad.addRecipes(recipes);
        cake.addRecipes(recipes);
        System.out.println(recipes);
        cake.remove(recipes);
        System.out.println(recipes);


        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);


        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}

