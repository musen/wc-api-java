package com.g360.woocommerce.client.domain.product;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Product {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("downloadable")
    @Expose
    private Boolean downloadable;
    @SerializedName("virtual")
    @Expose
    private Boolean virtual;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("regular_price")
    @Expose
    private String regularPrice;
    @SerializedName("sale_price")
    @Expose
    private Object salePrice;
    @SerializedName("price_html")
    @Expose
    private String priceHtml;
    @SerializedName("taxable")
    @Expose
    private Boolean taxable;
    @SerializedName("tax_status")
    @Expose
    private String taxStatus;
    @SerializedName("tax_class")
    @Expose
    private String taxClass;
    @SerializedName("managing_stock")
    @Expose
    private Boolean managingStock;
    @SerializedName("stock_quantity")
    @Expose
    private Object stockQuantity;
    @SerializedName("in_stock")
    @Expose
    private Boolean inStock;
    @SerializedName("backorders_allowed")
    @Expose
    private Boolean backordersAllowed;
    @SerializedName("backordered")
    @Expose
    private Boolean backordered;
    @SerializedName("sold_individually")
    @Expose
    private Boolean soldIndividually;
    @SerializedName("purchaseable")
    @Expose
    private Boolean purchaseable;
    @SerializedName("featured")
    @Expose
    private Boolean featured;
    @SerializedName("visible")
    @Expose
    private Boolean visible;
    @SerializedName("catalog_visibility")
    @Expose
    private String catalogVisibility;
    @SerializedName("on_sale")
    @Expose
    private Boolean onSale;
    @SerializedName("product_url")
    @Expose
    private String productUrl;
    @SerializedName("button_text")
    @Expose
    private String buttonText;
    @SerializedName("weight")
    @Expose
    private Object weight;
    @SerializedName("dimensions")
    @Expose
    private Dimensions dimensions;
    @SerializedName("shipping_required")
    @Expose
    private Boolean shippingRequired;
    @SerializedName("shipping_taxable")
    @Expose
    private Boolean shippingTaxable;
    @SerializedName("shipping_class")
    @Expose
    private String shippingClass;
    @SerializedName("shipping_class_id")
    @Expose
    private Object shippingClassId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("reviews_allowed")
    @Expose
    private Boolean reviewsAllowed;
    @SerializedName("average_rating")
    @Expose
    private String averageRating;
    @SerializedName("rating_count")
    @Expose
    private Integer ratingCount;
    @SerializedName("related_ids")
    @Expose
    private List<Integer> relatedIds = new ArrayList<Integer>();
    @SerializedName("upsell_ids")
    @Expose
    private List<Object> upsellIds = new ArrayList<Object>();
    @SerializedName("cross_sell_ids")
    @Expose
    private List<Object> crossSellIds = new ArrayList<Object>();
    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("categories")
    @Expose
    private List<String> categories = new ArrayList<String>();
    @SerializedName("tags")
    @Expose
    private List<Object> tags = new ArrayList<Object>();
    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @SerializedName("featured_src")
    @Expose
    private String featuredSrc;
    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes = new ArrayList<Attribute>();
    @SerializedName("downloads")
    @Expose
    private List<Download> downloads = new ArrayList<Download>();
    @SerializedName("download_limit")
    @Expose
    private Integer downloadLimit;
    @SerializedName("download_expiry")
    @Expose
    private Integer downloadExpiry;
    @SerializedName("download_type")
    @Expose
    private String downloadType;
    @SerializedName("purchase_note")
    @Expose
    private String purchaseNote;
    @SerializedName("total_sales")
    @Expose
    private Integer totalSales;
    @SerializedName("variations")
    @Expose
    private List<Object> variations = new ArrayList<Object>();
    @SerializedName("parent")
    @Expose
    private List<Object> parent = new ArrayList<Object>();
    @SerializedName("grouped_products")
    @Expose
    private List<Object> groupedProducts = new ArrayList<Object>();
    @SerializedName("menu_order")
    @Expose
    private Integer menuOrder;

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     * The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The downloadable
     */
    public Boolean getDownloadable() {
        return downloadable;
    }

    /**
     *
     * @param downloadable
     * The downloadable
     */
    public void setDownloadable(Boolean downloadable) {
        this.downloadable = downloadable;
    }

    /**
     *
     * @return
     * The virtual
     */
    public Boolean getVirtual() {
        return virtual;
    }

    /**
     *
     * @param virtual
     * The virtual
     */
    public void setVirtual(Boolean virtual) {
        this.virtual = virtual;
    }

    /**
     *
     * @return
     * The permalink
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     *
     * @param permalink
     * The permalink
     */
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    /**
     *
     * @return
     * The sku
     */
    public String getSku() {
        return sku;
    }

    /**
     *
     * @param sku
     * The sku
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     *
     * @return
     * The price
     */
    public String getPrice() {
        return price;
    }

    /**
     *
     * @param price
     * The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     *
     * @return
     * The regularPrice
     */
    public String getRegularPrice() {
        return regularPrice;
    }

    /**
     *
     * @param regularPrice
     * The regular_price
     */
    public void setRegularPrice(String regularPrice) {
        this.regularPrice = regularPrice;
    }

    /**
     *
     * @return
     * The salePrice
     */
    public Object getSalePrice() {
        return salePrice;
    }

    /**
     *
     * @param salePrice
     * The sale_price
     */
    public void setSalePrice(Object salePrice) {
        this.salePrice = salePrice;
    }

    /**
     *
     * @return
     * The priceHtml
     */
    public String getPriceHtml() {
        return priceHtml;
    }

    /**
     *
     * @param priceHtml
     * The price_html
     */
    public void setPriceHtml(String priceHtml) {
        this.priceHtml = priceHtml;
    }

    /**
     *
     * @return
     * The taxable
     */
    public Boolean getTaxable() {
        return taxable;
    }

    /**
     *
     * @param taxable
     * The taxable
     */
    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    /**
     *
     * @return
     * The taxStatus
     */
    public String getTaxStatus() {
        return taxStatus;
    }

    /**
     *
     * @param taxStatus
     * The tax_status
     */
    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    /**
     *
     * @return
     * The taxClass
     */
    public String getTaxClass() {
        return taxClass;
    }

    /**
     *
     * @param taxClass
     * The tax_class
     */
    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    /**
     *
     * @return
     * The managingStock
     */
    public Boolean getManagingStock() {
        return managingStock;
    }

    /**
     *
     * @param managingStock
     * The managing_stock
     */
    public void setManagingStock(Boolean managingStock) {
        this.managingStock = managingStock;
    }

    /**
     *
     * @return
     * The stockQuantity
     */
    public Object getStockQuantity() {
        return stockQuantity;
    }

    /**
     *
     * @param stockQuantity
     * The stock_quantity
     */
    public void setStockQuantity(Object stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    /**
     *
     * @return
     * The inStock
     */
    public Boolean getInStock() {
        return inStock;
    }

    /**
     *
     * @param inStock
     * The in_stock
     */
    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    /**
     *
     * @return
     * The backordersAllowed
     */
    public Boolean getBackordersAllowed() {
        return backordersAllowed;
    }

    /**
     *
     * @param backordersAllowed
     * The backorders_allowed
     */
    public void setBackordersAllowed(Boolean backordersAllowed) {
        this.backordersAllowed = backordersAllowed;
    }

    /**
     *
     * @return
     * The backordered
     */
    public Boolean getBackordered() {
        return backordered;
    }

    /**
     *
     * @param backordered
     * The backordered
     */
    public void setBackordered(Boolean backordered) {
        this.backordered = backordered;
    }

    /**
     *
     * @return
     * The soldIndividually
     */
    public Boolean getSoldIndividually() {
        return soldIndividually;
    }

    /**
     *
     * @param soldIndividually
     * The sold_individually
     */
    public void setSoldIndividually(Boolean soldIndividually) {
        this.soldIndividually = soldIndividually;
    }

    /**
     *
     * @return
     * The purchaseable
     */
    public Boolean getPurchaseable() {
        return purchaseable;
    }

    /**
     *
     * @param purchaseable
     * The purchaseable
     */
    public void setPurchaseable(Boolean purchaseable) {
        this.purchaseable = purchaseable;
    }

    /**
     *
     * @return
     * The featured
     */
    public Boolean getFeatured() {
        return featured;
    }

    /**
     *
     * @param featured
     * The featured
     */
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    /**
     *
     * @return
     * The visible
     */
    public Boolean getVisible() {
        return visible;
    }

    /**
     *
     * @param visible
     * The visible
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     *
     * @return
     * The catalogVisibility
     */
    public String getCatalogVisibility() {
        return catalogVisibility;
    }

    /**
     *
     * @param catalogVisibility
     * The catalog_visibility
     */
    public void setCatalogVisibility(String catalogVisibility) {
        this.catalogVisibility = catalogVisibility;
    }

    /**
     *
     * @return
     * The onSale
     */
    public Boolean getOnSale() {
        return onSale;
    }

    /**
     *
     * @param onSale
     * The on_sale
     */
    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

    /**
     *
     * @return
     * The productUrl
     */
    public String getProductUrl() {
        return productUrl;
    }

    /**
     *
     * @param productUrl
     * The product_url
     */
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    /**
     *
     * @return
     * The buttonText
     */
    public String getButtonText() {
        return buttonText;
    }

    /**
     *
     * @param buttonText
     * The button_text
     */
    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    /**
     *
     * @return
     * The weight
     */
    public Object getWeight() {
        return weight;
    }

    /**
     *
     * @param weight
     * The weight
     */
    public void setWeight(Object weight) {
        this.weight = weight;
    }

    /**
     *
     * @return
     * The dimensions
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     *
     * @param dimensions
     * The dimensions
     */
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     *
     * @return
     * The shippingRequired
     */
    public Boolean getShippingRequired() {
        return shippingRequired;
    }

    /**
     *
     * @param shippingRequired
     * The shipping_required
     */
    public void setShippingRequired(Boolean shippingRequired) {
        this.shippingRequired = shippingRequired;
    }

    /**
     *
     * @return
     * The shippingTaxable
     */
    public Boolean getShippingTaxable() {
        return shippingTaxable;
    }

    /**
     *
     * @param shippingTaxable
     * The shipping_taxable
     */
    public void setShippingTaxable(Boolean shippingTaxable) {
        this.shippingTaxable = shippingTaxable;
    }

    /**
     *
     * @return
     * The shippingClass
     */
    public String getShippingClass() {
        return shippingClass;
    }

    /**
     *
     * @param shippingClass
     * The shipping_class
     */
    public void setShippingClass(String shippingClass) {
        this.shippingClass = shippingClass;
    }

    /**
     *
     * @return
     * The shippingClassId
     */
    public Object getShippingClassId() {
        return shippingClassId;
    }

    /**
     *
     * @param shippingClassId
     * The shipping_class_id
     */
    public void setShippingClassId(Object shippingClassId) {
        this.shippingClassId = shippingClassId;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The shortDescription
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     *
     * @param shortDescription
     * The short_description
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     *
     * @return
     * The reviewsAllowed
     */
    public Boolean getReviewsAllowed() {
        return reviewsAllowed;
    }

    /**
     *
     * @param reviewsAllowed
     * The reviews_allowed
     */
    public void setReviewsAllowed(Boolean reviewsAllowed) {
        this.reviewsAllowed = reviewsAllowed;
    }

    /**
     *
     * @return
     * The averageRating
     */
    public String getAverageRating() {
        return averageRating;
    }

    /**
     *
     * @param averageRating
     * The average_rating
     */
    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    /**
     *
     * @return
     * The ratingCount
     */
    public Integer getRatingCount() {
        return ratingCount;
    }

    /**
     *
     * @param ratingCount
     * The rating_count
     */
    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    /**
     *
     * @return
     * The relatedIds
     */
    public List<Integer> getRelatedIds() {
        return relatedIds;
    }

    /**
     *
     * @param relatedIds
     * The related_ids
     */
    public void setRelatedIds(List<Integer> relatedIds) {
        this.relatedIds = relatedIds;
    }

    /**
     *
     * @return
     * The upsellIds
     */
    public List<Object> getUpsellIds() {
        return upsellIds;
    }

    /**
     *
     * @param upsellIds
     * The upsell_ids
     */
    public void setUpsellIds(List<Object> upsellIds) {
        this.upsellIds = upsellIds;
    }

    /**
     *
     * @return
     * The crossSellIds
     */
    public List<Object> getCrossSellIds() {
        return crossSellIds;
    }

    /**
     *
     * @param crossSellIds
     * The cross_sell_ids
     */
    public void setCrossSellIds(List<Object> crossSellIds) {
        this.crossSellIds = crossSellIds;
    }

    /**
     *
     * @return
     * The parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     *
     * @param parentId
     * The parent_id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     *
     * @return
     * The categories
     */
    public List<String> getCategories() {
        return categories;
    }

    /**
     *
     * @param categories
     * The categories
     */
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    /**
     *
     * @return
     * The tags
     */
    public List<Object> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     * The tags
     */
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    /**
     *
     * @return
     * The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     *
     * @param images
     * The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     *
     * @return
     * The featuredSrc
     */
    public String getFeaturedSrc() {
        return featuredSrc;
    }

    /**
     *
     * @param featuredSrc
     * The featured_src
     */
    public void setFeaturedSrc(String featuredSrc) {
        this.featuredSrc = featuredSrc;
    }

    /**
     *
     * @return
     * The attributes
     */
    public List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     *
     * @param attributes
     * The attributes
     */
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    /**
     *
     * @return
     * The downloads
     */
    public List<Download> getDownloads() {
        return downloads;
    }

    /**
     *
     * @param downloads
     * The downloads
     */
    public void setDownloads(List<Download> downloads) {
        this.downloads = downloads;
    }

    /**
     *
     * @return
     * The downloadLimit
     */
    public Integer getDownloadLimit() {
        return downloadLimit;
    }

    /**
     *
     * @param downloadLimit
     * The download_limit
     */
    public void setDownloadLimit(Integer downloadLimit) {
        this.downloadLimit = downloadLimit;
    }

    /**
     *
     * @return
     * The downloadExpiry
     */
    public Integer getDownloadExpiry() {
        return downloadExpiry;
    }

    /**
     *
     * @param downloadExpiry
     * The download_expiry
     */
    public void setDownloadExpiry(Integer downloadExpiry) {
        this.downloadExpiry = downloadExpiry;
    }

    /**
     *
     * @return
     * The downloadType
     */
    public String getDownloadType() {
        return downloadType;
    }

    /**
     *
     * @param downloadType
     * The download_type
     */
    public void setDownloadType(String downloadType) {
        this.downloadType = downloadType;
    }

    /**
     *
     * @return
     * The purchaseNote
     */
    public String getPurchaseNote() {
        return purchaseNote;
    }

    /**
     *
     * @param purchaseNote
     * The purchase_note
     */
    public void setPurchaseNote(String purchaseNote) {
        this.purchaseNote = purchaseNote;
    }

    /**
     *
     * @return
     * The totalSales
     */
    public Integer getTotalSales() {
        return totalSales;
    }

    /**
     *
     * @param totalSales
     * The total_sales
     */
    public void setTotalSales(Integer totalSales) {
        this.totalSales = totalSales;
    }

    /**
     *
     * @return
     * The variations
     */
    public List<Object> getVariations() {
        return variations;
    }

    /**
     *
     * @param variations
     * The variations
     */
    public void setVariations(List<Object> variations) {
        this.variations = variations;
    }

    /**
     *
     * @return
     * The parent
     */
    public List<Object> getParent() {
        return parent;
    }

    /**
     *
     * @param parent
     * The parent
     */
    public void setParent(List<Object> parent) {
        this.parent = parent;
    }

    /**
     *
     * @return
     * The groupedProducts
     */
    public List<Object> getGroupedProducts() {
        return groupedProducts;
    }

    /**
     *
     * @param groupedProducts
     * The grouped_products
     */
    public void setGroupedProducts(List<Object> groupedProducts) {
        this.groupedProducts = groupedProducts;
    }

    /**
     *
     * @return
     * The menuOrder
     */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /**
     *
     * @param menuOrder
     * The menu_order
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

}