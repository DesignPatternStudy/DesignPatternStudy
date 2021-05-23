namespace UsePattern.Handler {
    public interface IHandler {
        void SetNext(IHandler nextInChain);
        void HandleRequest(Number request);
    }
}