using System;
using System.Collections.Generic;
using System.Text;

namespace StrategyPattern.UsePattern.IStrategy.Concrete {
    class CreditCardStrategy : IPaymentStrategy {
        private string name;
        private string cardNumber;
        private string cvv;
        private string dateOfExpiry;

        public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
            this.name = name;
            this.cardNumber = cardNumber;
            this.cvv = cvv;
            this.dateOfExpiry = dateOfExpiry;
        }

        public void pay(int amount) {
            Console.WriteLine("신용카드로 " + amount + "원 결제했습니다.");
        }
    }
}
