package android.suryadevs.com.meetmyfamily;

/**
 * Created by Harshal Suryawanshi on 10-02-2016.
 */
public class RowContent {
    public int imageID;
    public String name;
    public String relation;

    public RowContent(int imageID, String name, String relation) {
        this.imageID = imageID;
        this.name = name;
        this.relation = relation;
    }

    public int getImageID() {
        return imageID;
    }

    public String getName() {
        return name;
    }

    public String getRelation() {
        return relation;
    }
}
