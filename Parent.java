
package lab5inheritancedemo;


public class Parent extends GrandParent{
   
    
    public Parent(){ }
    public Parent(String n, String nid, String s){
        super(n,nid,s);
    }
    public Parent(String n, String nid, String s, double svamt){
        super (n,nid,s,svamt);
    }
    
    public void cook(){
        System.out.println("Cooks Beef Curry");
    }
            
    
}
