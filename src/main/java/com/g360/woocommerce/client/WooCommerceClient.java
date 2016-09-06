package com.g360.woocommerce.client;

import com.g360.woocommerce.client.domain.order.Order;
import com.g360.woocommerce.client.domain.order.OrdersContainer;
import com.g360.woocommerce.client.domain.product.Product;
import com.g360.woocommerce.client.domain.product.ProductsContainer;
import com.g360.woocommerce.client.httpclient.Options;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WooCommerceClient {

    private static final String PRODUCTS_END_POINT = "products";
    private static final String ORDERS_END_POINT = "orders";
    private Client client;
    private Gson gson;

    public static void main(String[] args) {
        WooCommerceClient wooCommerceClient = new WooCommerceClient();
        System.out.println(wooCommerceClient.getProducts());
    }

    public WooCommerceClient() {
        HashMap<String, String> arguments = new HashMap<String, String>();
        Options options = new Options(arguments);
        gson = new Gson();

        client = new Client(
                "http://localhost/lomistore",
                "ck_a8f3dd9e2a73caaaf7b6dd3131d46fae70e6b462",
                "cs_84924f2f2f58bb0df2d4ad0ed58967865eeb30ca",
                options
        );
    }

    public List<Order> getOrders() {

        List<Order> orders = new ArrayList<Order>();

        String jsonString = "";

        try {

            jsonString = this.client.get(ORDERS_END_POINT);

            OrdersContainer ordersContainer = gson.fromJson(jsonString, OrdersContainer.class);

            orders = ordersContainer.getOrders();

        } catch(Exception e) {

            System.out.println("Error getting orders");

            System.out.println(e.getMessage());
        }

        return orders;
    }

    public List<Product> getProducts() {

        List<Product> products = new ArrayList<Product>();

        String jsonString = "";

        try {

            jsonString = this.client.get(PRODUCTS_END_POINT);

            ProductsContainer productsContainer = gson.fromJson(jsonString, ProductsContainer.class);

            products = productsContainer.getProducts();

        } catch(Exception e) {

            System.out.println("Error getting products");

            System.out.println(e.getMessage());
        }

        return products;
    }
}
