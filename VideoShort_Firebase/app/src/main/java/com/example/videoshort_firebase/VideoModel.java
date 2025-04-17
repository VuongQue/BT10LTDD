package com.example.videoshort_firebase;

import java.io.Serializable;
import java.util.List;

public class VideoModel implements Serializable {
    private int id;
    private String title;
    private String description;
    private String url;

    // Getters and Setters (nếu cần dùng Firebase hoặc Gson thì nên có)
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

