package com.example.newstrial;

public class ModelNews {

    private String author, title, description,publishedAt, urlToImage, url;

    public ModelNews(String author, String title, String description, String publishedAt, String urlToImage, String url) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.publishedAt = publishedAt;
        this.urlToImage = urlToImage;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getAuthor() {
        return author;
    }

    public ModelNews() {
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public ModelNews(String author, String title, String description, String publishedAt) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.publishedAt = publishedAt;
    }
}
