package e24e25;

public class Basket {
    private Integer elementNumber;

    public void addToBasket() throws BasketFullException {
        if (elementNumber < 10) {
            elementNumber++;
        } else {
            throw new BasketFullException("Your basket is full");
        }
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (elementNumber > 0) {
            elementNumber--;
        } else {
            throw new BasketEmptyException("Your basket is empty");
        }
    }

    public Basket(Integer elementNumber) {
        this.elementNumber = elementNumber;
    }

}
