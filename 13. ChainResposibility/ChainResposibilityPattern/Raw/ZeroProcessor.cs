using System;

namespace Raw {
    public class ZeroProcessor {
        public bool HandleRequest(Number request) {
            if (request.GetNumber() == 0) {
                Console.WriteLine("ZeroProcessor : " + request.GetNumber());
                return true;
            }

            return false;
        }
    }
}