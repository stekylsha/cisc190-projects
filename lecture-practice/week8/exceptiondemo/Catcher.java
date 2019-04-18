public class Catcher {
    public static void main(String[] args) throws ThrownException {
       Catcher c = new Catcher();
       Thrower t = new Thrower();        
       c.testMethod(t);   
    }

    public void testMethod(Thrower t) throws ThrownException { 
        try {            
            t.throwException();        
        } catch (ThrownException te) {
            System.out.println("I caught an exception:" + te.getMessage());
            return;
        } finally {            
            System.out.println("I will always be here for you.");        
        }
    }
}
