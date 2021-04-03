using System;
using System.Collections.Generic;
using System.Text;

namespace AbstractFactory.AbstractFactoryPattern.UsePattern.GuiFactory.Concrete {
    public class WindowGuiFactory : IGuiFactory {
        public IButton createButton() {
            return new WindowButton();
        }

        public IText createText() {
            return new WindowText();
        }
    }
}
