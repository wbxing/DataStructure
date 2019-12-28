package chapter_2.test;

import chapter_2.Movie;

public class MovieTestDrive {
    public static void main(String[] args) {

        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;

        Movie two = new Movie();
        two .title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;

        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;

        one.playIt();
        two.playIt();
        three.playIt();
    }
}
