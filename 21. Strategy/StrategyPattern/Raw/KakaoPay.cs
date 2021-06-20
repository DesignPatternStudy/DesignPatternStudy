using System;
using System.Collections.Generic;
using System.Text;

namespace StrategyPattern.Raw {
    class KakaoPay {
        private string kakaoEmail;
        private string kakaoPassword;

        public KakaoPay(String kakaoEmail, String kakaoPassword) {
            this.kakaoEmail = kakaoEmail;
            this.kakaoPassword = kakaoPassword;
        }


        public void pay(int amount) {
            Console.WriteLine("카카오페이로 " + amount + "원 결제했습니다.");
        }
    }
}
