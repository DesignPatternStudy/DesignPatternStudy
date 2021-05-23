using System;

namespace UsePattern.Handler.Concrete {
    public class PositiveProcessor : IHandler {
        private IHandler nextInChain;

        public void SetNext(IHandler nextInChain) {
            this.nextInChain = nextInChain;
        }

        public void HandleRequest(Number request) {
            if (request.GetNumber() > 0) {
                Console.WriteLine("PositiveProcessor : " + request.GetNumber());
            } else {
                nextInChain.HandleRequest(request);
            }
        }
    }
}