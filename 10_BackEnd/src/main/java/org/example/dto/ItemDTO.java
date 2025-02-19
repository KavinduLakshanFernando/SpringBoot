package org.example.dto;

public class ItemDTO {
    private String id;
    private String description;
    private String price;
    private int quantity;

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public ItemDTO(String id, String description, String price, int quantity) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
    public ItemDTO(){}
}
