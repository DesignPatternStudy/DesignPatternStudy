using AbstractFactory.AbstractFactoryPattern.UsePattern.GuiFactory;
using AbstractFactory.AbstractFactoryPattern.UsePattern.GuiFactory.Concrete;

namespace AbstractFactory.AbstractFactoryPattern.UsePattern {
    class AbstractFactoryExample {
        public AbstractFactoryExample() {
            print(EOsType.Window);
            print(EOsType.Mac);
        }

        private static void print(EOsType type) {
            IGuiFactory factory = null;
            switch (type) {
                case EOsType.Window:
                    factory = new WindowGuiFactory();
                    break;
                case EOsType.Mac:
                    factory = new MacGuiFactory();
                    break;
            }

            IButton button = factory.createButton();
            IText text = factory.createText();

            button.click_Button();
            text.text_Description();
        }
    }
}