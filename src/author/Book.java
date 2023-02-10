package author;

public class Book{
//les attributs
    private String name;
    private Author author;
    private double price;
    private int qty;
    //Le constructeur

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    //Les getters et les setters
    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    /*Une methode qui renvoie les details de d'un Book*/

    public String toString() {
        return name + " par " + (author.toString()) + " dans " + author.getEmail() ;
    }
}
