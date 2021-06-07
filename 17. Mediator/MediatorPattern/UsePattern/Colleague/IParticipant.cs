using System;

namespace MediatorPattern.UsePattern.Colleague {
    public interface IParticipant {
        public void sendMsg(String msg);
        public void setname(String name);
        public String getName();
    }
}
