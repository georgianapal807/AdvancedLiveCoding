package e24e25;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket(0);
        try {
            basket.removeFromBasket();
        } catch (BasketEmptyException e) {
            System.out.println(e.getMessage());
        }

        try {
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();

        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }
/* Varianta cand prindem ambele exceptii in acelasi block

        try {
            basket.removeToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();

        } catch (BasketFullException | BasketEmptyException e) {
            System.out.println(e.getMessage());
        } */
    }
}