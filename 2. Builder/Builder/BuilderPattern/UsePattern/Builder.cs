namespace Builder.BuilderPattern {
    partial class NutritionFacts {
        public NutritionFacts(Builder builder) {
            this.servingSize = builder.servingSize;
            this.servings = builder.servings;
            this.calories = builder.calories;
            this.fat = builder.fat;
            this.sodium = builder.sodium;
            this.carbohydrate = builder.carbohydrate;
        }

        public class Builder {
            // Required parameters(필수 인자)
            public readonly int servingSize;
            public readonly int servings;

            // Optional parameters - initialized to default values(선택적 인자는 기본값으로 초기화)
            public int calories {
                get; private set;
            }
            public int fat {
                get; private set;
            }
            public int carbohydrate {
                get; private set;
            }
            public int sodium {
                get; private set;
            }

            public Builder(int servingSize, int servings) {
                this.servingSize = servingSize;
                this.servings = servings;
            }

            public Builder Calories(int val) {
                calories = val;
                return this;    // 이렇게 하면 . 으로 체인을 이어갈 수 있다.
            }
            public Builder Fat(int val) {
                fat = val;
                return this;
            }
            public Builder Carbohydrate(int val) {
                carbohydrate = val;
                return this;
            }
            public Builder Sodium(int val) {
                sodium = val;
                return this;
            }
            public NutritionFacts Build() {
                return new NutritionFacts(this);
            }
        }
    }
}
