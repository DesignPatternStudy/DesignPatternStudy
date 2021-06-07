using MediatorPattern.UsePattern;
using MediatorPattern.Raw;
using System;

namespace MediatorPattern {
    class Program {
        static void Main(string[] args) {
            Console.WriteLine("================ Use Pattern ================");
            new MediatorPattern.UsePattern.Main();

            Console.WriteLine();
            Console.WriteLine("================ Raw ================");
            new MediatorPattern.Raw.Main();
        }
    }
}
