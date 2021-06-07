using MediatorPattern.UsePattern.Colleague;
using System;

namespace MediatorPattern.UsePattern.Mediator.Concrete {
    public class ChatRoom : IChatRoom {
        public void showMsg(String msg, IParticipant p) {
            Console.WriteLine(p.getName() + "'gets message: " + msg);
            Console.WriteLine("\t\t\t\t" + "[" + DateTime.Now + "]");
        }
    }
}
