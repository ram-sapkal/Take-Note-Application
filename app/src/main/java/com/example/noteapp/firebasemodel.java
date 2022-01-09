package com.example.noteapp;

public class firebasemodel {

    private String title;
    private String content;
    private String date;
    private int isImportant;

    public int getIsImportant() {
        return isImportant;
    }

    public void setIsImportant(int isImportant) {
        this.isImportant = isImportant;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public firebasemodel(){

    }

    public firebasemodel(String title,String content,String date,int isImportant){
        this.title=title;
        this.content=content;
        this.date=date;
        this.isImportant=isImportant;
    }

}
