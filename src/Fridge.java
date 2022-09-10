import java.util.ArrayList;
import java.util.Collection;

public class Fridge {
    ArrayList<WeightedIngredient> ingredientsFridge = new ArrayList<WeightedIngredient>() ;

    public Fridge(){

    }
    public Fridge(ArrayList<WeightedIngredient> IngredientFridge){
        this.ingredientsFridge = IngredientFridge;
    }

    public Fridge addIngredient(WeightedIngredient ingredient){
        if(ingredientsFridge.contains(ingredient)){
            int n = ingredientsFridge.indexOf(ingredient);
            ingredientsFridge.add(n, new WeightedIngredient(ingredient.nameIngredient, ingredient.weight + ingredientsFridge.get(n).weight, ingredient.pricePerUnit));
        }
        else{
            ingredientsFridge.add(ingredient);
        }

        return new Fridge(ingredientsFridge);

    }

    public Fridge subIngredient(WeightedIngredient ingredient){
        if(ingredientsFridge.contains(ingredient)) {
            int n = ingredientsFridge.indexOf(ingredient);
            if (ingredientsFridge.get(n).weight - ingredient.weight >= 0) {
                ingredientsFridge.add(n, new WeightedIngredient(ingredient.nameIngredient, ingredientsFridge.get(n).weight - ingredient.weight, ingredient.pricePerUnit));
            }
            else{
                System.out.println("Nemate dovoljnu kolicinu ovog sastojka!");
            }
        }
        else{
            System.out.println("Trazeni sastojak ne postoji u frizideru!");
        }

        return new Fridge(ingredientsFridge);

    }

    public Boolean enoughIngredient(Recipe recipe){
        var x = recipe.recipeIngredients;
        var y = this.ingredientsFridge;
        Boolean uslov = true;
        int p = 0;
        for( var a : x) {
            for (var b : y) {
                if (a.nameIngredient == b.nameIngredient) {
                    if (b.weight >= a.weight && b.weight > 0) {
                        p++;
                    }

                }
            }
        }
        if (p < x.size()) {
            uslov = false;
        }
        return uslov;
    }

    public Fridge makeMeal(Recipe recipe){
        var x = recipe.recipeIngredients;
        var y = this.ingredientsFridge;
        for( var a : x) {
            for (var b : y) {
                if (a.nameIngredient == b.nameIngredient) {

                    b.weight -= a.weight;

                }
            }
        }

        return new Fridge(y);
    }





}





