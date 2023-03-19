package org.example.Library.Impl;

public class BookGenre implements Genre{
    private String genreName;

    public BookGenre(String genreName) {
        this.genreName = genreName;
    }

    public BookGenre() {
        genreName = "Fantasy";
    }

    @Override
    public String getGenre() {
        return genreName;
    }

    @Override
    public String toString() {
        return "BookGenre{" +
                "genreName='" + genreName + '\'' +
                '}';
    }
}
