using UsePattern.Handler;
using UsePattern.Handler.Concrete;

namespace UsePattern {
    public class ChainResponsibility {
        public ChainResponsibility() {
            IHandler chain = new NegativeProcessor();
            IHandler chain2 = new ZeroProcessor();
            IHandler chain3 = new PositiveProcessor();

            chain.SetNext(chain2);
            chain2.SetNext(chain3);

            chain.HandleRequest(new Number(90));
            chain.HandleRequest(new Number(-50));
            chain.HandleRequest(new Number(0));
            chain.HandleRequest(new Number(91));
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