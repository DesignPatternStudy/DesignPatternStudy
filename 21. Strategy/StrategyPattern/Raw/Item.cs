using System;
using System.Collections.Generic;
using System.Text;

namespace StrategyPattern.Raw {
    class Item {
        private string name;
        private int price;

        public Item(string name, int price) {
            this.name = name;
            this.price = price;
        }

        public string getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
}
