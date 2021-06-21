﻿using StrategyPattern.UsePattern.IStrategy.Concrete;

namespace StrategyPattern.Raw {
    class Main {
        public Main() {
            ShoppingCart cart = new ShoppingCart();

            Item item1 = new Item("쿼터파운드치즈버거", 5800);
            Item item2 = new Item("콜라 R", 1700);

            cart.addItem(item1);
            cart.addItem(item2);


            var amount = cart.calculateTotal();

            {
                //카카오페이로 결제
                var kakao = new KakaoPay("myemail@example.com", "mypwd");
                kakao.pay(amount);
            }

            {
                //신용카드로 결제
                var credit = new CreditCard("Tori An", "1234567890123456", "786", "12/15");
                credit.pay(amount);
            }
        }
    }
}
