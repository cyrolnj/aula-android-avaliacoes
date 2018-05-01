package com.solutions.oryc.consuma.control;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by 2001608 on 16/04/2018.
 */

public class ProductMenu implements Parcelable {

    public String name;
    public ArrayList<Product> productList = new ArrayList<Product>();

    public ProductMenu() {

    }

    public ProductMenu(String name) {
        this.name = name;
    }

    public void addProduct (Product product) {
        productList.add(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getProductList() {
        return productList;
    }

    public void setProductList(ArrayList productList) {
        this.productList = productList;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getName());
    }

    public static final Creator<ProductMenu> CREATOR = new Creator<ProductMenu>() {
        @Override
        public ProductMenu createFromParcel(Parcel in) {
            ProductMenu retorno = new ProductMenu();
            retorno.setName(in.readString());
            return retorno;
        }

        @Override
        public ProductMenu[] newArray(int size) {
            return new ProductMenu[size];
        }
    };
}
