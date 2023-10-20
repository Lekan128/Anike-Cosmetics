package ng.com.anikecosmetics.model.jumia;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Images {
    @JsonProperty("Image")
    List<String> image;

    public Images() {
    }

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Images{" +
                "image=" + image +
                '}';
    }
}
