package khanhdang.ueh.edu.vn.photoapp;

public class Photo {
    private int id;
    private String source_photo;
    private String title_photo;
    private String description_photo;

    public int getId() {
        return id;
    }
    public String getSource_photo() {
        return source_photo;
    }
    public String getTitle_photo() {
        return title_photo;
    }
    public String getDescription_photo() {
        return description_photo;
    }

    public Photo(int id, String source_photo, String title_photo, String description_photo) {
        this.id = id;
        this.source_photo = source_photo;
        this.title_photo = title_photo;
        this.description_photo = description_photo;
    }
}
