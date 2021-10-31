public class Book {
    private String name;
    private Author author[];
    private double price;
    private int qty = 0;

    public Book(String n, Author[] a, double p)
    {
        this.name = n;
        this.author = a;
        this.price = p;
    }
    public Book(String n, Author[] a, double p,int qty)
    {
        this.name = n;
        this.author = a;
        this.price = p;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
   public Author[] getAuthor() {
       return author;
   }
    public double getPrice() {
        return price;
    }public int getQty() {
        return qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
   @Override
   public String toString() {
       String aString = new String();
       for(int row = 0; row < author.length; row++) {
           aString = aString + author[row]+ ",";
       }
       return (this.name+ " Written by "+ aString.toString());
   }
}

