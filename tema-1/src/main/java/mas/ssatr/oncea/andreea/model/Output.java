package mas.ssatr.oncea.andreea.model;

import com.google.gson.annotations.SerializedName;

public class Output {

    @SerializedName("id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
