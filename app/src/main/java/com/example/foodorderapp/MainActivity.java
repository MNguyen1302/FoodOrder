package com.example.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Product> listProduct;
    ProductListViewAdapter productListViewAdapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadProduct();

        lv = findViewById(R.id.lv_product);
        productListViewAdapter = new ProductListViewAdapter(listProduct);
        lv.setAdapter(productListViewAdapter);
    }

    public void loadProduct() {
        listProduct = new ArrayList<>();
        listProduct.add(new Product("D001", "Creamy Caramel Cappuccino", 38000, 100, "CF001", 1, R.drawable.d1));
        listProduct.add(new Product("D002", "Mocha Latte", 35000, 100, "CF001", 1, R.drawable.d2));
        listProduct.add(new Product("D003", "Espresso", 30000, 100, "CF002", 1, R.drawable.d3));

    }
}