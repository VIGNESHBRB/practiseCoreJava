package com.brb.main;

public class Movie implements Comparable<Movie> {

    Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    private String name;
    private int year;

    /**
     *@return  a negative integer, zero, or a positive integer as this object
     *          is less than, equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }

    @Override
    public String toString(){
        return this.name + this.year;
    }
}
