package com.g360.woocommerce.client.domain.order;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class PaymentDetails {

    @SerializedName("method_id")
    @Expose
    private String methodId;
    @SerializedName("method_title")
    @Expose
    private String methodTitle;
    @SerializedName("paid")
    @Expose
    private Boolean paid;

    /**
     *
     * @return
     * The methodId
     */
    public String getMethodId() {
        return methodId;
    }

    /**
     *
     * @param methodId
     * The method_id
     */
    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    /**
     *
     * @return
     * The methodTitle
     */
    public String getMethodTitle() {
        return methodTitle;
    }

    /**
     *
     * @param methodTitle
     * The method_title
     */
    public void setMethodTitle(String methodTitle) {
        this.methodTitle = methodTitle;
    }

    /**
     *
     * @return
     * The paid
     */
    public Boolean getPaid() {
        return paid;
    }

    /**
     *
     * @param paid
     * The paid
     */
    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

}