using MediatorPattern.UsePattern.Mediator;
using System;
using System.Collections.Generic;
using System.Text;

namespace MediatorPattern.UsePattern.Colleague.Concrete {
    public class User : IParticipant {
        private String name;
        private IChatRoom chat;

        public User(IChatRoom chat) {
            this.chat = chat;
        }

        public void sendMsg(String msg) {
            chat.showMsg(msg, this);
        }

        public void setname(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
