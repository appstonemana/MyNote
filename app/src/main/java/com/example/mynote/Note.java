package com.example.mynote;

public class Note {

    public static final String TABLE_NAME="NOTE";
    public static final String COLUMN_ID="id";
    public static final String TITLE="title";
    public static final String TEXT="text";

    public static final String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+"("
            +COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+TITLE+" TEXT,"+
            TEXT+" TEXT)";


    private int id;
    private String title,text;

    public Note() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
