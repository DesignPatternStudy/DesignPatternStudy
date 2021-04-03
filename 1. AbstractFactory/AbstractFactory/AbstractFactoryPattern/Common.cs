using System;

namespace AbstractFactory.AbstractFactoryPattern {
    enum EOsType {
        Window,
        Mac,
    }

    public class WindowButton : IButton {
        public void click_Button() {
            Console.WriteLine("윈도우 버튼 클릭!!");
        }
    }

    public class WindowText : IText {
        public void text_Description() {
            Console.WriteLine("윈도우 텍스트!!");
        }
    }

    public class MacButton : IButton {
        public void click_Button() {
            Console.WriteLine("맥 버튼 클릭!!");
        }
    }

    public class MacText : IText {
        public void text_Description() {
            Console.WriteLine("맥 텍스트!!");
        }
    }

    public interface IButton {

        public void click_Button();

    }

    public interface IText {

        public void text_Description();

    }
}
