package com.sda.spring.javapoz4.model;

import java.time.LocalDate;

public class News {

    private long id;
    private String title;
    private String description;
    private LocalDate date;
    private String smallImgPath;
    private String bingImgPath;
    private User author;

    public News() {
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSmallImgPath() {
        return smallImgPath;
    }

    public void setSmallImgPath(String smallImgPath) {
        this.smallImgPath = smallImgPath;
    }

    public String getBingImgPath() {
        return bingImgPath;
    }

    public void setBingImgPath(String bingImgPath) {
        this.bingImgPath = bingImgPath;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
// N1. nowa klasa News - id(long), title, description, date, smallImgPath, bingImgPath, author(user)
// N2. News Service - getAllNews(), getNews()
// N3. NewsController - getAllNews() oraz getNews()
// N4. allNews.html, news.html