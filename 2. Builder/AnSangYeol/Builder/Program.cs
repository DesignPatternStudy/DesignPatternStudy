using Builder.BuilderPattern.UsePattern;
using System.Diagnostics;

namespace Builder {
    class Program {
        static void Main(string[] args) {
            var temp = new BuilderExample();

            if (Debugger.IsAttached) {
                Debugger.Break();
            }
        }
    }
}
