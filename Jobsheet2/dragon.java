package Jobsheet2;

public class dragon {
    int x;
    int y;
    int width;
    int height;

    public dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        x--;
        detectCollision();
    }

    public void moveRight() {
        x++;
        detectCollision();
    }

    public void moveUp() {
        y--;
        detectCollision();
    }

    public void moveDown() {
        y++;
        detectCollision();
    }

    public void printPosition() {
        System.out.println("Dragon position: (" + x + ", " + y + ")");
    }

    public void detectCollision() {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            System.out.println("Game Over");
        }
    }

    public static void main(String[] args) {

    }
}
