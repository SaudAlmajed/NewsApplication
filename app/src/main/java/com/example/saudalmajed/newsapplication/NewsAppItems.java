package com.example.saudalmajed.newsapplication;


public class NewsAppItems {

    private String title;
    private String author;
    private String url;
    private String date;
    private String section;

    public NewsAppItems(String title, String author, String url, String date, String section) {
        this.title = title;
        this.author = author;
        this.url = url;
        this.date = date;
        this.section = section;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    public String getUrl() {
        return url;
    }

    public String getDate() {
        return date;
    }

    public String getSection() {
        return section;
    }
}
