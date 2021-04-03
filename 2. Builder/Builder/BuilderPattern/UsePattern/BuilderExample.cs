namespace Builder.BuilderPattern.UsePattern {
    class BuilderExample {
        public readonly NutritionFacts CocaCola;
        public BuilderExample() {
            CocaCola = new NutritionFacts
                .Builder(240, 8)    // 필수값 입력
                .Calories(100)
                .Fat(1)
                .Sodium(35)
                .Carbohydrate(27)
                .Build();           // build() 가 객체를 생성해 돌려준다.
        }
    }
}
