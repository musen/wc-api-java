package com.g360.woocommerce.client.domain.custom;

import com.g360.woocommerce.client.domain.product.Download;
import com.g360.woocommerce.client.domain.product.Product;
import com.google.gson.Gson;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Book extends Product {

    public String getBookTitle() {
        return this.getTitle();
    }

    public String getBookPreview() {
        return this.getDescription();
    }

    public String getBookDownloadLink() {
        // validate payment
        Download download = this.getDownloads().get(0);
        return download.getFile();
    }

    public List<Book> getBookSearchResults() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book());

        return books;
    }

    public static List<Book> getAllBooks() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book());

        return books;
    }

    public static List<Book> getBooksByCategory() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book());

        return books;
    }

    public static List<Book> getFeaturedBooks() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book());

        return books;
    }

    public static List<Book> getPopularBooks() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book());

        return books;
    }

    public static List<Book> getRecommendedBooks() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book());

        return books;
    }

    public static List<Book> getLomiMonthSelectBooks() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book());

        return books;
    }

    public static List<Book> getTopSellerBooks() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book());

        return books;
    }
}
