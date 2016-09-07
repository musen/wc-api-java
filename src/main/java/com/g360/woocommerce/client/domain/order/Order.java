package com.g360.woocommerce.client.domain.order;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Order {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("order_number")
    @Expose
    private Integer orderNumber;
    @SerializedName("order_key")
    @Expose
    private String orderKey;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("completed_at")
    @Expose
    private String completedAt;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("subtotal")
    @Expose
    private String subtotal;
    @SerializedName("total_line_items_quantity")
    @Expose
    private Integer totalLineItemsQuantity;
    @SerializedName("total_tax")
    @Expose
    private String totalTax;
    @SerializedName("total_shipping")
    @Expose
    private String totalShipping;
    @SerializedName("cart_tax")
    @Expose
    private String cartTax;
    @SerializedName("shipping_tax")
    @Expose
    private String shippingTax;
    @SerializedName("total_discount")
    @Expose
    private String totalDiscount;
    @SerializedName("shipping_methods")
    @Expose
    private String shippingMethods;
    @SerializedName("payment_details")
    @Expose
    private PaymentDetails paymentDetails;
    @SerializedName("billing_address")
    @Expose
    private BillingAddress billingAddress;
    @SerializedName("shipping_address")
    @Expose
    private ShippingAddress shippingAddress;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("customer_ip")
    @Expose
    private String customerIp;
    @SerializedName("customer_user_agent")
    @Expose
    private String customerUserAgent;
    @SerializedName("customer_id")
    @Expose
    private Integer customerId;
    @SerializedName("view_order_url")
    @Expose
    private String viewOrderUrl;
    @SerializedName("line_items")
    @Expose
    private List<Object> lineItems = new ArrayList<Object>();
    @SerializedName("shipping_lines")
    @Expose
    private List<Object> shippingLines = new ArrayList<Object>();
    @SerializedName("tax_lines")
    @Expose
    private List<Object> taxLines = new ArrayList<Object>();
    @SerializedName("fee_lines")
    @Expose
    private List<Object> feeLines = new ArrayList<Object>();
    @SerializedName("coupon_lines")
    @Expose
    private List<Object> couponLines = new ArrayList<Object>();
    @SerializedName("is_vat_exempt")
    @Expose
    private Boolean isVatExempt;
    @SerializedName("customer")
    @Expose
    private Customer customer;

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
     * The orderNumber
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     *
     * @param orderNumber
     * The order_number
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     *
     * @return
     * The orderKey
     */
    public String getOrderKey() {
        return orderKey;
    }

    /**
     *
     * @param orderKey
     * The order_key
     */
    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
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
     * The completedAt
     */
    public String getCompletedAt() {
        return completedAt;
    }

    /**
     *
     * @param completedAt
     * The completed_at
     */
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
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
     * The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The total
     */
    public String getTotal() {
        return total;
    }

    /**
     *
     * @param total
     * The total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     *
     * @return
     * The subtotal
     */
    public String getSubtotal() {
        return subtotal;
    }

    /**
     *
     * @param subtotal
     * The subtotal
     */
    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    /**
     *
     * @return
     * The totalLineItemsQuantity
     */
    public Integer getTotalLineItemsQuantity() {
        return totalLineItemsQuantity;
    }

    /**
     *
     * @param totalLineItemsQuantity
     * The total_line_items_quantity
     */
    public void setTotalLineItemsQuantity(Integer totalLineItemsQuantity) {
        this.totalLineItemsQuantity = totalLineItemsQuantity;
    }

    /**
     *
     * @return
     * The totalTax
     */
    public String getTotalTax() {
        return totalTax;
    }

    /**
     *
     * @param totalTax
     * The total_tax
     */
    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    /**
     *
     * @return
     * The totalShipping
     */
    public String getTotalShipping() {
        return totalShipping;
    }

    /**
     *
     * @param totalShipping
     * The total_shipping
     */
    public void setTotalShipping(String totalShipping) {
        this.totalShipping = totalShipping;
    }

    /**
     *
     * @return
     * The cartTax
     */
    public String getCartTax() {
        return cartTax;
    }

    /**
     *
     * @param cartTax
     * The cart_tax
     */
    public void setCartTax(String cartTax) {
        this.cartTax = cartTax;
    }

    /**
     *
     * @return
     * The shippingTax
     */
    public String getShippingTax() {
        return shippingTax;
    }

    /**
     *
     * @param shippingTax
     * The shipping_tax
     */
    public void setShippingTax(String shippingTax) {
        this.shippingTax = shippingTax;
    }

    /**
     *
     * @return
     * The totalDiscount
     */
    public String getTotalDiscount() {
        return totalDiscount;
    }

    /**
     *
     * @param totalDiscount
     * The total_discount
     */
    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    /**
     *
     * @return
     * The shippingMethods
     */
    public String getShippingMethods() {
        return shippingMethods;
    }

    /**
     *
     * @param shippingMethods
     * The shipping_methods
     */
    public void setShippingMethods(String shippingMethods) {
        this.shippingMethods = shippingMethods;
    }

    /**
     *
     * @return
     * The paymentDetails
     */
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     *
     * @param paymentDetails
     * The payment_details
     */
    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    /**
     *
     * @return
     * The billingAddress
     */
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     *
     * @param billingAddress
     * The billing_address
     */
    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     *
     * @return
     * The shippingAddress
     */
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     *
     * @param shippingAddress
     * The shipping_address
     */
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     *
     * @return
     * The note
     */
    public String getNote() {
        return note;
    }

    /**
     *
     * @param note
     * The note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     *
     * @return
     * The customerIp
     */
    public String getCustomerIp() {
        return customerIp;
    }

    /**
     *
     * @param customerIp
     * The customer_ip
     */
    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    /**
     *
     * @return
     * The customerUserAgent
     */
    public String getCustomerUserAgent() {
        return customerUserAgent;
    }

    /**
     *
     * @param customerUserAgent
     * The customer_user_agent
     */
    public void setCustomerUserAgent(String customerUserAgent) {
        this.customerUserAgent = customerUserAgent;
    }

    /**
     *
     * @return
     * The customerId
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     *
     * @param customerId
     * The customer_id
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     *
     * @return
     * The viewOrderUrl
     */
    public String getViewOrderUrl() {
        return viewOrderUrl;
    }

    /**
     *
     * @param viewOrderUrl
     * The view_order_url
     */
    public void setViewOrderUrl(String viewOrderUrl) {
        this.viewOrderUrl = viewOrderUrl;
    }

    /**
     *
     * @return
     * The lineItems
     */
    public List<Object> getLineItems() {
        return lineItems;
    }

    /**
     *
     * @param lineItems
     * The line_items
     */
    public void setLineItems(List<Object> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     *
     * @return
     * The shippingLines
     */
    public List<Object> getShippingLines() {
        return shippingLines;
    }

    /**
     *
     * @param shippingLines
     * The shipping_lines
     */
    public void setShippingLines(List<Object> shippingLines) {
        this.shippingLines = shippingLines;
    }

    /**
     *
     * @return
     * The taxLines
     */
    public List<Object> getTaxLines() {
        return taxLines;
    }

    /**
     *
     * @param taxLines
     * The tax_lines
     */
    public void setTaxLines(List<Object> taxLines) {
        this.taxLines = taxLines;
    }

    /**
     *
     * @return
     * The feeLines
     */
    public List<Object> getFeeLines() {
        return feeLines;
    }

    /**
     *
     * @param feeLines
     * The fee_lines
     */
    public void setFeeLines(List<Object> feeLines) {
        this.feeLines = feeLines;
    }

    /**
     *
     * @return
     * The couponLines
     */
    public List<Object> getCouponLines() {
        return couponLines;
    }

    /**
     *
     * @param couponLines
     * The coupon_lines
     */
    public void setCouponLines(List<Object> couponLines) {
        this.couponLines = couponLines;
    }

    /**
     *
     * @return
     * The isVatExempt
     */
    public Boolean getIsVatExempt() {
        return isVatExempt;
    }

    /**
     *
     * @param isVatExempt
     * The is_vat_exempt
     */
    public void setIsVatExempt(Boolean isVatExempt) {
        this.isVatExempt = isVatExempt;
    }

    /**
     *
     * @return
     * The customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     *
     * @param customer
     * The customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}