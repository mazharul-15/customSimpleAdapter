package com.example.customsimpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    // data source
    int[] image = {R.drawable.sallu_1, R.drawable.sallu_2, R.drawable.sallu_3, R.drawable.sallu_4,
                   R.drawable.sallu_5, R.drawable.sallu_6, R.drawable.sallu_7, R.drawable.sallu_8,
                   R.drawable.sallu_9, R.drawable.sallu_10, R.drawable.sallu_1, R.drawable.sallu_2};

    String[] name = {"Salman Khan", "Salman Khan", "Salman Khan", "Salman Khan",
                     "Salman Khan", "Salman Khan", "Salman Khan", "Salman Khan",
                     "Salman Khan", "Salman Khan", "Salman Khan", "Salman Khan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);

        /// making data source for adapter
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

        for(int i = 0; i < image.length; i++)
        {
            HashMap<String, String> hm = new HashMap<>();
            hm.put("image", image[i]+"");
            hm.put("name", name[i]);

            arrayList.add(hm);
        }

        String[] from = {"image", "name"};
        int[] to = {R.id.img_view, R.id.txt_view};

        SimpleCustomAdapter customSimpleAdapter = new SimpleCustomAdapter(this, arrayList, R.layout.adapter_view, from, to);

        listView.setAdapter(customSimpleAdapter);

        /// onItemSelected
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int img_id = image[position];

                Intent intent = new Intent(getApplicationContext(), FullImageView.class);

                intent.putExtra("image_id", img_id);

                startActivity(intent);
            }
        });

    }
}