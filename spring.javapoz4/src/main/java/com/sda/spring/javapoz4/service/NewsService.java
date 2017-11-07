package com.sda.spring.javapoz4.service;

import com.sda.spring.javapoz4.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//N2.
@Component
public class NewsService {
    //lista z newsami -> zwraca pojedynczy news

    private List<News> newsList;

    @Autowired
    private UserService userService;

    public NewsService() {
        this.newsList = new ArrayList<>();
    }

    public List<News> getAllNews(){
        return newsList;
    }

    public News getNews(int id){
        return newsList.get(id);
    }

    @PostConstruct
    public  void init () {
        this.newsList = new ArrayList<>();
        this.newsList.add(getExampleNews());
        this.newsList.add(getExampleNews());
        this.newsList.add(getExampleNews());
        this.newsList.add(getExampleNews());
        this.newsList.add(getExampleNews());
        this.newsList.add(getExampleNews());
    }

    private News getExampleNews(){
        News news = new News();
        news.setId(1);
        news.setTitle("Lorem");
        news.setDescription("Lorem t magni minima, odioquis sit unde voluptates! Accusamus ape" +
                "eius magni nulla numquam perspiciatis placeat");
        news.setAuthor(userService.getExampleUser());
        news.setDate(LocalDate.now());
        return news;
    }



}
