
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Recipe implements Priceable{

    String nameRecipe;

    Level level;

    ArrayList<WeightedIngredient> recipeIngredients = new ArrayList<WeightedIngredient>() ;

    public Recipe(){

    }

    public Recipe(String name, Level level, ArrayList <WeightedIngredient> recipeIngredients){
        this.nameRecipe = name;
        this.level = level;
        this.recipeIngredients = recipeIngredients;

    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setNameRecipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    public void setRecipeIngredients(ArrayList<WeightedIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public ArrayList<WeightedIngredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public Level getLevel() {
        return level;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    @Override
    public double getPrice() {
        var x = recipeIngredients;
        double s = 0;
        for(var a : x){
            s += a.getPrice();
        }
        return s;
    }

    public Recipe getScaledRecipe(double n){

        var x = this.recipeIngredients;
        for(var a : x){
            a.weight = a.weight * n/100;
        }

        return new Recipe(this.nameRecipe, this.level, x);


    }
}