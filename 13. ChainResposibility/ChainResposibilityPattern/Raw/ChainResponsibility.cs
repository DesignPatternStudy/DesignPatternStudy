namespace Raw {
    public class ChainResponsibility {
        NegativeProcessor chain = new();
        ZeroProcessor chain2 = new();
        PositiveProcessor chain3 = new();
        public ChainResponsibility() {
            Process(new Number(90));
            Process(new Number(-50));
            Process(new Number(0));
            Process(new Number(91));
        }

        void Process(Number number) {
            if (chain.HandleRequest(number)) {
                return;
            }

            if (chain2.HandleRequest(number)) {
                return;
            }

            chain3.HandleRequest(number);
        }
    }

    public struct Number {
        readonly private int number;

        public Number(int number) {
            this.number = number;
        }

        public int GetNumber() {
            return number;
        }
    }
}