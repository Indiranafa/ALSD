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
        System.out.println("Dragon position Left: (" + x + ", " + y + ")");
    }

    public void moveRight() {
        x++;
        detectCollision();
        System.out.println("Dragon position Right: (" + x + ", " + y + ")");
    }

    public void moveUp() {
        y--;
        detectCollision();
        System.out.println("Dragon position Up: (" + x + ", " + y + ")");
    }

    public void moveDown() {
        y++;
        detectCollision();
        System.out.println("Dragon position Down: (" + x + ", " + y + ")");
    }

    // public void printPosition() {
    //     System.out.println("Dragon position: (" + x + ", " + y + ")");
    // }

    public void detectCollision() {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            System.out.println("Game Over");
        }
    }

    public static void main(String[] args) {

    }
}
