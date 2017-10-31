package _14_Chain_of_Responsibility;
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }
    protected boolean resolve(Trouble trouble) {     
        return false; 
    }
}
