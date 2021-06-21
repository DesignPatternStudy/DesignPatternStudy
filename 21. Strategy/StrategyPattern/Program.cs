using System;

namespace StrategyPattern {
    class Program {
        static void Main(string[] args) {
            Console.WriteLine($"===========UsePattern===========");
            new UsePattern.Main();
            Console.WriteLine();
            Console.WriteLine($"===========Raw===========");
            new Raw.Main();
        }
    }
}
