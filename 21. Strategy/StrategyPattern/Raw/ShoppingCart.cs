using StrategyPattern.UsePattern.IStrategy;
using System;
using System.Collections.Generic;
using System.Text;

namespace StrategyPattern.Raw {
    class ShoppingCart {
        //아이템의 리스트
        List<Item> items;

        public ShoppingCart() {
            this.items = new List<Item>();
        }

        public void addItem(Item item) {
            this.items.Add(item);
        }

        public void removeItem(Item item) {
            this.items.Remove(item);
        }

        public int calculateTotal() {
            int sum = 0;
            foreach (var item in items) {
                sum += item.getPrice();
            }
            return sum;
        }
    }
}
