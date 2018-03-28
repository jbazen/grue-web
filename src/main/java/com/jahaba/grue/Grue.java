package com.jahaba.grue;

public class Grue {

    private final long id;
    private final String content;

    public Grue(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
