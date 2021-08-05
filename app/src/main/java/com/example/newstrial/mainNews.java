package com.example.newstrial;

import java.util.ArrayList;

public class mainNews {

    private String status;
    private String totalResults;
    private ArrayList<ModelNews> articles;

    public mainNews() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<ModelNews> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelNews> articles) {
        this.articles = articles;
    }

    public mainNews(String status, String totalResults, ArrayList<ModelNews> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }
}
