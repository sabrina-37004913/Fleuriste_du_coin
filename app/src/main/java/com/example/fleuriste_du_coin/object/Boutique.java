package com.example.fleuriste_du_coin.object;

public class Boutique {

    private  long id;
    private String name;
    private String city;
    private String article;


    public Boutique(long id,String name,String city,String article ){
        this.id=id;
        this.name=name;
        this.city=city;
        this.article=article;

    }

    public Boutique(int anInt, String string, String cursorString, String s, String string1){}

    public long getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getarticle() {
        return article;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public  void setCity(String city) {
        this.city=city;
    }

    public void setId (long id){
        this.id=id;
    }
}
