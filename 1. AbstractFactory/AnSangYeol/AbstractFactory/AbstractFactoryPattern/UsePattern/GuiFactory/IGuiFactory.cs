using System;
using System.Collections.Generic;
using System.Text;

namespace AbstractFactory.AbstractFactoryPattern.UsePattern.GuiFactory {
    public interface IGuiFactory {

        public IButton createButton();

        public IText createText();

    }
}
