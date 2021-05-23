using System;

namespace Raw {
    public class PositiveProcessor {
        public bool HandleRequest(Number request) {
            if (request.GetNumber() > 0) {
                Console.WriteLine("PositiveProcessor : " + request.GetNumber());
                return true;
            }

            return false;
        }
    }
}