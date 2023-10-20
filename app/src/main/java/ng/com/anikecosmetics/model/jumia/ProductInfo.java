package ng.com.anikecosmetics.model.jumia;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductInfo implements Parcelable {
    @JsonProperty("SellerSku")//.
    private String id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Variation")
    private String variation;

    @JsonProperty("Quantity")//.
    private String quantity;
    @JsonProperty("Price")//4
    private String price;
    @JsonProperty("SalePrice")//.3
    private String salePrice;
    @JsonProperty("SaleStartDate")//.
    private String saleStartDate;
    @JsonProperty("SaleEndDate")//.
    private String saleEndDate;
    @JsonProperty("Available")//.
    private String availableToSell;
    @JsonProperty("Status")//.
    private String status;
    @JsonProperty("Url")//.
    private String url;
    @JsonProperty("MainImage")
    private String mainImageUrl;
    @JsonProperty("Description")//.
    private String description;
    @JsonProperty("Brand")//.
    private String brand;
    @JsonProperty("PrimaryCategory")
    private String primaryCategory;

    @JsonProperty("Images")
    private Images images;

    public ProductInfo() {
    }

    protected ProductInfo(Parcel in) {
        id = in.readString();
        name = in.readString();
        variation = in.readString();
        quantity = in.readString();
        price = in.readString();
        salePrice = in.readString();
        saleStartDate = in.readString();
        saleEndDate = in.readString();
        availableToSell = in.readString();
        status = in.readString();
        url = in.readString();
        mainImageUrl = in.readString();
        description = in.readString();
        brand = in.readString();
        primaryCategory = in.readString();
    }

    public static final Creator<ProductInfo> CREATOR = new Creator<ProductInfo>() {
        @Override
        public ProductInfo createFromParcel(Parcel in) {
            return new ProductInfo(in);
        }

        @Override
        public ProductInfo[] newArray(int size) {
            return new ProductInfo[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariation() {
        return variation;
    }

    public void setVariation(String variation) {
        this.variation = variation;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getSaleStartDate() {
        return saleStartDate;
    }

    public void setSaleStartDate(String saleStartDate) {
        this.saleStartDate = saleStartDate;
    }

    public String getSaleEndDate() {
        return saleEndDate;
    }

    public void setSaleEndDate(String saleEndDate) {
        this.saleEndDate = saleEndDate;
    }

    public String getAvailableToSell() {
        return availableToSell;
    }

    public void setAvailableToSell(String availableToSell) {
        this.availableToSell = availableToSell;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrimaryCategory() {
        return primaryCategory;
    }

    public void setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", variation='" + variation + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +
                ", salePrice='" + salePrice + '\'' +
                ", saleStartDate='" + saleStartDate + '\'' +
                ", saleEndDate='" + saleEndDate + '\'' +
                ", availableToSell='" + availableToSell + '\'' +
                ", status='" + status + '\'' +
                ", url='" + url + '\'' +
                ", mainImageUrl='" + mainImageUrl + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", primaryCategory='" + primaryCategory + '\'' +
                ", images=" + images +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(name);
        dest.writeString(variation);
        dest.writeString(quantity);
        dest.writeString(price);
        dest.writeString(salePrice);
        dest.writeString(saleStartDate);
        dest.writeString(saleEndDate);
        dest.writeString(availableToSell);
        dest.writeString(status);
        dest.writeString(url);
        dest.writeString(mainImageUrl);
        dest.writeString(description);
        dest.writeString(brand);
        dest.writeString(primaryCategory);
    }
}
