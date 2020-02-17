package com.introtoandroid.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.class_schedule);
        final String[] classes = {"Operating Systems", "Website Programming", "Systems Engineering", "Music Appreciation", "Cybersecurity"};

        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, classes);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "You clicked: " + classes[position], Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
}
