package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;

import org.w3c.dom.Text;

public class LibraryManagement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_management);


        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        ListView list = (ListView) findViewById(R.id.lUser);
        EditText name = (EditText) findViewById(R.id.txtName);
        EditText id = (EditText) findViewById(R.id.txtId);
        EditText number = (EditText) findViewById(R.id.txtNumber);
        EditText day = (EditText) findViewById(R.id.txtDayBorrow);
        RadioButton r1 = (RadioButton) findViewById(R.id.rdTeacher);
        RadioButton r2 = (RadioButton) findViewById(R.id.rdStudent);

        String[] items;

//        ArrayAdapter<String> i = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items[{0},{1}]);

    }
}