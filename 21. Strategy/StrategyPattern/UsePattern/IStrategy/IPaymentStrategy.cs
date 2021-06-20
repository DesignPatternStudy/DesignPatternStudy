using System;
using System.Collections.Generic;
using System.Text;

namespace StrategyPattern.UsePattern.IStrategy {
    interface IPaymentStrategy {
        void pay(int amount);
    }
}
