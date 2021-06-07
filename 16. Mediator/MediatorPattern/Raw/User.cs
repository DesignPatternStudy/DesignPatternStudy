using System;
using System.Collections.Generic;

namespace MediatorPattern.Raw {
    public class User {
        private String name;
        List<User> participants = new List<User>();

        public void SendMsg(String msg) {
            foreach (var participant in participants) {
                participant.ShowMsg(msg, this);
            }
        }

        public void Setname(String name) {
            this.name = name;
        }

        public String GetName() {
            return name;
        }

        public void AddParticipant(User user) {
            participants.Add(user);
        }

        public void ShowMsg(String msg, User user) {
            Console.WriteLine(user.GetName() + "'gets message: " + msg);
            Console.WriteLine("\t\t\t\t" + "[" + DateTime.Now + "]");
        }
    }
}
