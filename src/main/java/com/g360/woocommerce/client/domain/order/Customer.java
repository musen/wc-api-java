package com.g360.woocommerce.client.domain.order;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Customer {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("billing_address")
    @Expose
    private BillingAddress_ billingAddress;
    @SerializedName("shipping_address")
    @Expose
    private ShippingAddress_ shippingAddress;

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
     * The email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     * The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     * The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     * The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     * The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     * The billingAddress
     */
    public BillingAddress_ getBillingAddress() {
        return billingAddress;
    }

    /**
     *
     * @param billingAddress
     * The billing_address
     */
    public void setBillingAddress(BillingAddress_ billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     *
     * @return
     * The shippingAddress
     */
    public ShippingAddress_ getShippingAddress() {
        return shippingAddress;
    }

    /**
     *
     * @param shippingAddress
     * The shipping_address
     */
    public void setShippingAddress(ShippingAddress_ shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

}