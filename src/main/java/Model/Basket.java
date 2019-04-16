package Model;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Basket{
    private int ID;
    private Iterator<Product> iterator;
    private List<Product> products;

    Basket(int ID){
        this.ID = ID;
        products = new ArrayList<Product>();
//        iterator = new Iterator<Product>();
    }

    public Iterator<Product> getIterator(){
        return iterator;
    }

    public int getID(){
        return ID;
    }

    public List<Product> getProducts(){
        return products;
    }

    public void addProduct(Product product, int ammount){

    }

    public String toString(){
        return "";
    }

}