package Model;

import java.util.Date;

public class Category {
    private int id;
    private WineType type;
    private int price;
    private int amount;
    private boolean isAvailable;
    private float vol;
    private Date expDate;
    private String name;

    public Category(int id, WineType type, int price, int amount, boolean isAvailable, float vol, Date expDate, String name) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.amount = amount;
        this.isAvailable = isAvailable;
        this.vol = vol;
        this.expDate = expDate;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public WineType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public float getVol() {
        return vol;
    }

    public Date getExpDate() {
        return expDate;
    }

    public String getName() {
        return name;
    }
}
