package Jobsheet2;

public class dragonMain {
    public static void main(String[] args) {
        // Contoh penggunaan
        dragon dragon = new dragon(5, 5, 10, 10);

        dragon.moveRight();
        dragon.printPosition();

        dragon.moveDown();
        dragon.printPosition();

        dragon.moveLeft();
        dragon.printPosition();

        dragon.moveUp();
        dragon.printPosition();
    }
}
