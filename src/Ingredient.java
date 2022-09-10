public abstract class Ingredient implements Priceable{
    private static int count = 0;
    private int id;
    String nameIngredient;
    public Ingredient(){

    }
    public Ingredient(String NameIngredient){
        this.nameIngredient = NameIngredient;
        this.id= count++;
    }


    public void setNameIngredient(String nameIngredient) {
        this.nameIngredient = nameIngredient;
    }

    public String getNameIngredient() {
        return nameIngredient;
    }
}
