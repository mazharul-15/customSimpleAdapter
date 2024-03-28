package com.example.customsimpleadapter;

import android.content.Context;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleCustomAdapter extends SimpleAdapter {

    Context context;
    ArrayList<HashMap<String, String>> arrayList;
    public SimpleCustomAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);

        this.context = context;
        this.arrayList = (ArrayList<HashMap<String, String>>) data;
    }

    /// other methods
}
