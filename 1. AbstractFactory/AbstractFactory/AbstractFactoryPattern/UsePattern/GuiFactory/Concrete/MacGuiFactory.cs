using System;
using System.Collections.Generic;
using System.Text;

namespace AbstractFactory.AbstractFactoryPattern.UsePattern.GuiFactory.Concrete {
    public class MacGuiFactory : IGuiFactory {
        public IButton createButton() {
            return new MacButton();
        }

        public IText createText() {
            return new MacText();
        }
    }
}
