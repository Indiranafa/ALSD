public class NodeFilm {
    int id;
    String title;
    double rating;
    NodeFilm next;
    NodeFilm prev;

    NodeFilm(int id, String title, double rating) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
