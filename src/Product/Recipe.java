package Product;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private String name;

    private Set<Product> recipeProduct;

    private double totalCost;

    public Recipe(String name) {
        this.name = name;
        this.recipeProduct = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getRecipeProduct() {
        return recipeProduct;
    }

    public void setRecipeProduct(Set<Product> recipeProduct) {
        this.recipeProduct = recipeProduct;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void add(Product... recipeProduct) {
        this.recipeProduct.addAll(Arrays.asList(recipeProduct));
        for (Product t : this.recipeProduct) {
            this.totalCost += t.getCost();
        }
    }

    public void addRecipes(Set<Recipe> recipes) {
        if (recipes.contains(this)) {
            throw new IllegalArgumentException("Такой рецепт " + getName() + " уже есть в списке");
        } recipes.add(this);
    }


    public void remove(Set<Recipe> recipes) {
        recipes.remove(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Рецепт: " + name +
                ". Состоит из: " + recipeProduct +
                ", общая сумма: " + totalCost +
                " руб.";
    }
}
