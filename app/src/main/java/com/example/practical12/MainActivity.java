package com.example.practical12;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemClickListener {
    ListView l1;
    String[]
            c={"MAD","PWP","WBP","ETI","MGT","EDP","CPP"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(ListView)findViewById(R.id.list);
        ArrayAdapter<String> c1=new
                ArrayAdapter<>(this,android.R.layout.simple_list_item_1,c);
        l1.setAdapter(c1);
        l1.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long
            id) {
        String s1;
        s1=String.valueOf(parent.getItemAtPosition(position));
        Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_LONG).show();
    }
}