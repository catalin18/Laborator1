public class Book {
    private String name;
    public int price;

    public Book(int price)
    {
        this.price = price;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void rentalCos(int numDays)
    {
        price = numDays * 10;
    }
}
