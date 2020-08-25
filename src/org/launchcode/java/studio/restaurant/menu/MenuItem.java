package org.launchcode.java.studio.restaurant.menu;

public class MenuItem {

    private String name;
    private double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private boolean isNew;

    public MenuItem (String name, double itemPrice, String itemDescription, String itemCategory){
        this.name = name;
        this.itemPrice = itemPrice;
        this.itemDescription  = itemDescription;
        this.itemCategory = itemCategory;
        this.isNew = true;

    }

    public String getName() {
        return name;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public boolean isNew() {
        return isNew;
    }
}
