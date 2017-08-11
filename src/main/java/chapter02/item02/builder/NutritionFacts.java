package chapter02.item02.builder;

/**
 * Created by Jang Jeong Hyeon on 2017-08-03.
 */

// Builder Pattern
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder{
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optimal Parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(final int servingSize, final int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(final int cal){
            this.calories = cal;
            return this;
        }

        public Builder fat(final int fat){
            this.fat = fat;
            return this;
        }

        public Builder carbohydrate(final int carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        }

        public Builder sodium(final int sodium){
            this.sodium = sodium;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder){
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }


    public static void main(String[] args) {
        NutritionFacts cocaCola = new Builder(240,8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
        System.out.println(cocaCola.calories);
    }
}
