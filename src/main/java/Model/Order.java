package Model;

import java.util.Date;

public class Order{

    private int ID;
    private int basketID;
    private int userID;
    private Date creationDate;
    private Date paymentDate;
    private Status status;

    public Order(int ID, int basketID, int userID) {
        this.ID = ID;
        this.basketID = basketID;
        this.userID = userID;
    }
    public int getBasketID() {
        return basketID;
    }

    public int getUserID() {
        return userID;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public Status getStatus() {
        return status;
    }

    public int getID() {
        return ID;
    }

    public boolean isPayed(){
        if (status == Status.PAYED){
            return true;
        }
        return false;
    }


    public String toString(){
        String result = String.format("Order ID: %d, Creation date: %t",
                getID(), getCreationDate());
        return result;
    }



    private enum Status{
        ORDERED,
        PAYED,
        COMPLETED;


    }


}
