namespace AbstractFactory.AbstractFactoryPattern.Raw {
    class AbstractFactoryExample {
        public AbstractFactoryExample() {
            print(EOsType.Window);
            print(EOsType.Mac);
        }

        private static void print(EOsType type) {
            IButton button = null;
            IText text = null;
            switch (type) {
                case EOsType.Window:
                    button = new WindowButton();
                    text = new WindowText();
                    break;
                case EOsType.Mac:
                    button = new MacButton();
                    text = new MacText();
                    break;
            }

            button.click_Button();
            text.text_Description();
        }
    }
}