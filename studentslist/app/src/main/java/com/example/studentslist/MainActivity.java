package com.example.studentslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<String> students = new ArrayList<String>();
        setContentView(R.layout.activity_main);
        students.add("Lal Chand");
        students.add("Shahzaib");
        students.add("Farhan");
        students.add("Syed Ali Ahmed");

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,students);
        ListView listView = (ListView) findViewById(R.id.student_list);

        listView.setAdapter(adapter);




    }
}