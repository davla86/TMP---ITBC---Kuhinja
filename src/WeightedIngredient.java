public class WeightedIngredient extends Ingredient{
    double weight;
    double pricePerUnit;

    public WeightedIngredient(String name, double weight, double pricePerUnit){
        super(name);
        this.weight = weight;
        this.pricePerUnit = pricePerUnit;
    }
    public WeightedIngredient getScale(double n){


        return new WeightedIngredient(this.nameIngredient, n *this.weight, this.pricePerUnit);
    }
    @Override
    public double getPrice() {
        return this.weight * this.pricePerUnit;
    }
}
