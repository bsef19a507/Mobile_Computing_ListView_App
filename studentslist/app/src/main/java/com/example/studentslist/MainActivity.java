package com.example.studentslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    ArrayList<String> students = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_main);
        students.add("Lal Chand");
        students.add("Shahzaib");
        students.add("Farhan");
        students.add("Syed Ali Ahmed");

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,students);
        ListView listView = (ListView) findViewById(R.id.student_list);

        listView.setAdapter(adapter);
        Button addBtn = findViewById(R.id.add_btn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText =  findViewById(R.id.input_item);
                String data = editText.getText().toString();
//                addBtn.setText(data);
                students.add(data);
                adapter.notifyDataSetChanged();

            }
        });




    }
}