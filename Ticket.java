public class Ticket {
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private String type;
    private String name;
    private float price;

    public Ticket(String type, String name, float price){
        this.setType(type);
        this.setName(name);
        this.setPrice(price);
    }
}
