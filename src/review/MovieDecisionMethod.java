package review;

public class MovieDecisionMethod {
    public static void main(String[] args) {
        movieDes(8,80,123);
    }
    public static void movieDes(int imdb, int total, int box){
        int a=imdb*total/box;
        if (a>10){
            System.out.println("watch movie");
        }
        else {
            System.out.println("dont watch the movie");
        }
    }
}
