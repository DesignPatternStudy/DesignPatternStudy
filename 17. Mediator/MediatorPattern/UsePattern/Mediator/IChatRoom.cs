using MediatorPattern.UsePattern.Colleague;
using System;

namespace MediatorPattern.UsePattern.Mediator {
    public interface IChatRoom {
        public void showMsg(String msg, IParticipant p);
    }
}
