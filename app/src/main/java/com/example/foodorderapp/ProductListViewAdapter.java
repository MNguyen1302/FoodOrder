package com.example.foodorderapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductListViewAdapter extends BaseAdapter {
    final ArrayList<Product> listProduct;

    public ProductListViewAdapter(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    @Override
    public int getCount() {
        return listProduct.size();
    }

    @Override
    public Object getItem(int i) {
        return listProduct.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewProduct;

        if (view == null)
            viewProduct = View.inflate(viewGroup.getContext(), R.layout.item_product, null);
        else
            viewProduct = view;

        Product product = (Product) getItem(i);
        ((ImageView) viewProduct.findViewById(R.id.img_product)).setImageResource(product.getImageSrc());
        ((TextView) viewProduct.findViewById(R.id.tv_name_product)).setText(product.getName());
        ((TextView) viewProduct.findViewById(R.id.tv_price_product)).setText(String.valueOf(product.getPrice()));

        return viewProduct;
    }
}
