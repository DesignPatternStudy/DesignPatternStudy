using System;
using System.Collections.Generic;
using System.Text;

namespace StrategyPattern.UsePattern.IStrategy.Concrete {
    class KakaoPayStrategy : IPaymentStrategy {
        private string kakaoEmail;
        private string kakaoPassword;

        public KakaoPayStrategy(String kakaoEmail, String kakaoPassword) {
            this.kakaoEmail = kakaoEmail;
            this.kakaoPassword = kakaoPassword;
        }


        public void pay(int amount) {
            Console.WriteLine("카카오페이로 " + amount + "원 결제했습니다.");
        }
    }
}
