package com.g360.woocommerce.client.domain;

import com.google.gson.Gson;

import java.util.Date;

/**
 * Created by mfissehaye on 9/6/2016.
 */
public class TesetGson {

    public static void main(String[] args) {
        Gson gson = new Gson();
        System.out.println(
                gson.fromJson("{'title': 1, 'createdAt': '2016-12-12', 'updatedAt': '2016-10-10'}",
                TestClass.class));
    }

    private class TestClass {

        String title;
        Date createdAt;
//        String updatedAt;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Date getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
        }

        /*public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }*/

        @Override
        public String toString() {
            return "TestClass{" +
                    "title='" + title + '\'' +
                    ", createdAt='" + createdAt + '\'' +
//                    ", updatedAt='" + updatedAt + '\'' +
                    '}';
        }
    }
}
