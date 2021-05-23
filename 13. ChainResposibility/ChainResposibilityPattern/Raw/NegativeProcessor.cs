using System;

namespace Raw {
    public class NegativeProcessor {
        public bool HandleRequest(Number request) {
            if (request.GetNumber() < 0) {
                Console.WriteLine("NegativeProcessor : " + request.GetNumber());
                return true;
            }

            return false;
        }
    }
}