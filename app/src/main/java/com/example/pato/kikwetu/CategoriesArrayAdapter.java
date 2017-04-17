package com.example.pato.kikwetu;

import android.content.Context;
import android.widget.ArrayAdapter;

public class CategoriesArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mBreakfast;
    private String[] mCategory;

    public CategoriesArrayAdapter(Context mContext, int resource, String[] mRestaurants, String[] mCat) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mBreakfast = mBreakfast;
        this.mCategory = mCategory;
    }

    @Override
    public Object getItem(int position) {
        String breakfast = mBreakfast[position];
        String category = mCategory[position];
        return String.format("%s \nServes great: %s", breakfast, category);
    }

    @Override
    public int getCount() {
        return mBreakfast.length;
    }
}