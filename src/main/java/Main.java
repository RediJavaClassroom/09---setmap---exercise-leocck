import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Ratings ratings = new Ratings();
        System.out.println();
        System.out.println(ratings);

        ratings.addRating(5);
        System.out.println();
        System.out.println(ratings);

        Random r = new Random();
        for(int i=0; i<100; i++) {
            int rating = r.nextInt(6);
            ratings.addRating(rating);
        }
        System.out.println();
        System.out.println(ratings);
    }
}
