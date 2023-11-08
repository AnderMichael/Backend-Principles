package principles_and_acronyms.dry.task;

abstract class Utility {
    // An Abstract class to inherite sell method
    private int stock;

    public Utility(int stock) {
        this.stock = stock;
    }

    // A unique method to check the stock for all the utilities
    private boolean checkStock(int quantity) {
        return stock >= quantity;
    }

    // A unique method to confirm a sale for all the utilities
    public boolean sellItems(int quantity){
        if(checkStock(quantity)){
            stock -= quantity;
            return true;
        }
        return false;
    }

    // Abstract Method sell
    public abstract void sell(int quantity);

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
class Book extends Utility {
    public Book(int stock) {
        super(stock);
    }

    @Override
    public void sell(int quantity) {
        if (super.sellItems(quantity)) {
            System.out.println("Libro vendido. Stock actualizado: " + super.getStock());
        } else {
            System.out.println("Stock insuficiente para libros.");
        }
    }
}

class Game extends Utility {
    public Game(int stock) {
        super(stock);
    }

    @Override
    public void sell(int quantity) {
        if (super.sellItems(quantity)) {
            System.out.println("Juego vendido. Stock actualizado: " + super.getStock());
        } else {
            System.out.println("Stock insuficiente para juegos.");
        }
    }
}
public class Task3 {
    public static void main(String[] args) {
        Utility game =  new Game(3);
        Utility book = new Book(1);

        game.sell(2);
        book.sell(1);

        game.sell(5);
        book.sell(2);
    }
}
