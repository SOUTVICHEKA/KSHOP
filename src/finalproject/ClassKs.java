package finalproject;

import java.util.ArrayList;

public class ClassKs {
    private String Name;
    private int Qty;
    private double Price;

    public ClassKs() {
    }

    public ClassKs(String Name, int Qty, double Price) {
        this.Name = Name;
        this.Qty = Qty;
        this.Price = Price;
    }

    public String getName() {
        return Name;
    }

    public int getQty() {
        return Qty;
    }

    public double getPrice() {
        return Price;
    }
    
    double Total(){
        return Price*Qty;
    }
    
   static ArrayList<ClassKs> listks= new ArrayList();
    
}
