package com.example.notesappfirst;

public class FirebaseModel {

    private static String title;
    private static String content;


    public FirebaseModel()
    {

    }

    public FirebaseModel(String title, String content)
    {
        this.content = content;
        this.title = title;
    }


    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

