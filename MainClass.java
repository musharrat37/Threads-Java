
package lab5inheritancedemo;


public class MainClass {
    
    public static void main(String[] args) {
     
        GrandParent gp =new GrandParent("Mr. GrandParent","1258744","Chess");
        gp.showInfo();
        
        Parent p = new Parent("Mr.Parent", "1234569","Golf");
        p.showInfo();
        
        Boy b = new Boy("Mr.Boy", "1258974","soccer");
        b.showInfo();
        b.cook();
        
        Girl g = new Girl("Ms.Girl", "569874", "Badminton");
        g.showInfo();
        g.cook();
    }
    
}
