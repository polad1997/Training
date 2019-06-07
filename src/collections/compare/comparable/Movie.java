package collections.compare.comparable;

public class Movie implements Comparable<Movie> {

    private double rating;
    private String name;
    private int year;

    @Override
    public int compareTo(Movie m) {
        return (int) (this.rating - m.rating);
    }

    public Movie(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
