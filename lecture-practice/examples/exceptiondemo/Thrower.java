public class Thrower {
    public void throwException() throws ThrownException {
        System.out.println("I'm about to throw an exception.");
        try { Thread.sleep(5000); } catch (InterruptedException ie) {}
        throw new ThrownException("AAAHH!!!");
    }
}