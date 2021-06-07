using MediatorPattern.UsePattern.Colleague.Concrete;
using MediatorPattern.UsePattern.Mediator;
using MediatorPattern.UsePattern.Mediator.Concrete;

namespace MediatorPattern.UsePattern {
    class Main {
        public Main() {
            IChatRoom chat = new ChatRoom();

            User u1 = new User(chat);
            u1.setname("Ashwani Rajput");
            u1.sendMsg("Hi Ashwani! how are you?");

            User u2 = new User(chat);
            u2.setname("Soono Jaiswal");
            u2.sendMsg("I am Fine ! You tell?");
        }
    }
}
