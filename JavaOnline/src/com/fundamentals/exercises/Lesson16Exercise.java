package com.fundamentals.exercises;

public class Lesson16Exercise {
    public enum movieGenres { THRILLER, COMEDY, ACTION, FANTASY}

    public void enumMovie() {
        FamousMovies movie1 = FamousMovies.JAWS;
        System.out.println(movie1);
    }

    public void favoriteGenre(Lesson16Exercise.movieGenres genre) {
        String message = "My favorite movie genre is " +" and my favorite movie from that genre is " ;
        switch (genre) {
            case THRILLER:
                message += "THRILLER";
                break;
            case COMEDY:
                message += "COMEDY";
                break;
            case ACTION:
                message += "ACTION";
                break;
            default:
                message += "FANTASY";
                break;
        }
        System.out.println(message);
    }

}

