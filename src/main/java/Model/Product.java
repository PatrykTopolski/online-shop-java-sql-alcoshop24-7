package Model;

import java.sql.Date;


public class Product {
    private int id;
    private String name;
    private int typeId;
    private float price;
    private float alcoholContent;
    private float volume;
    private int amount;
    private Date expirationDate;

    
    public Product(int id, String name, int typeId, float price, float alcoholContent,
        float volume, int amount, Date expirationDate){
        
        this.id = id;
        this.name = name;
        this.typeId = typeId;
        this.price = price;
        this. alcoholContent = alcoholContent;
        this.volume = volume;
        this.amount = amount;
        this.expirationDate = expirationDate;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name;}

    public int getTypeId(){
        return typeId;
    }

    public void setTypeId(int typeId){
        this.typeId= typeId;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getAlcoholContent(){
        return alcoholContent;
    }

    public void setAlcoholContent(float alcoholContent){
        this.alcoholContent = alcoholContent;
    }

    public float getVolume(){
        return volume;
    }

    public void setVolume(float volume){
        this.volume = volume;
    }

    public int getAmount(){
        return amount; 
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public Date getExpirationDate(){
        return expirationDate;
    }

    public void setExpirationDate(Date date){
        this.expirationDate = date;
    }

    public String toString(){
        String result = String.format("Product: %s, price: %f",
                getName(), getPrice());
        return result;
    }
}