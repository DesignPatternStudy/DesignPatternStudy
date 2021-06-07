namespace MediatorPattern.Raw {
    class Main {
        public Main() {
            User u1 = new User();
            User u2 = new User();
            u1.AddParticipant(u2);
            u2.AddParticipant(u1);

            u1.Setname("Ashwani Rajput");
            u1.SendMsg("Hi Ashwani! how are you?");

            u2.Setname("Soono Jaiswal");
            u2.SendMsg("I am Fine ! You tell?");
        }
    }
}
