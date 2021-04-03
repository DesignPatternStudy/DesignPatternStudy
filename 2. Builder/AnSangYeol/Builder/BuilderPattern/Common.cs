namespace Builder.BuilderPattern {
    partial class NutritionFacts {
        private readonly int servingSize;
        private readonly int servings;
        private readonly int calories;
        private readonly int fat;
        private readonly int sodium;
        private readonly int carbohydrate;

        public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
            this.servingSize = servingSize;
            this.servings = servings;
            this.calories = calories;
            this.fat = fat;
            this.sodium = sodium;
            this.carbohydrate = carbohydrate;
        }
    }
}
