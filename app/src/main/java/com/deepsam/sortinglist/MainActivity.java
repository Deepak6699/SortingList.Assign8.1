package com.deepsam.sortinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> arrayList=new ArrayList<>();
    ArrayList<String> arrayList1=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View v = null;
        final ListView listView1= (ListView) findViewById(R.id.list_item);

        arrayList.add(new String("JAN"));
        arrayList.add(new String("FEB"));
        arrayList.add(new String("MARCH"));
        arrayList.add(new String("APRIL"));
        arrayList.add(new String("MAY"));
        arrayList.add(new String("JUNE"));
        arrayList.add(new String("JULY"));
        arrayList.add(new String("AUGUST"));
        arrayList.add(new String("SEPTEMBER"));
        arrayList.add(new String("OCTOBER"));
        arrayList.add(new String("NOVEMBER"));
        arrayList.add(new String("DECEMBER"));

        arrayList1.add(new String("JAN"));
        arrayList1.add(new String("FEB"));
        arrayList1.add(new String("MARCH"));
        arrayList1.add(new String("APRIL"));
        arrayList1.add(new String("MAY"));
        arrayList1.add(new String("JUNE"));
        arrayList1.add(new String("JULY"));
        arrayList1.add(new String("AUGUST"));
        arrayList1.add(new String("SEPTEMBER"));
        arrayList1.add(new String("OCTOBER"));
        arrayList1.add(new String("NOVEMBER"));
        arrayList1.add(new String("DECEMBER"));

    Button button= (Button) findViewById(R.id.button2);
        Button button1= (Button) findViewById(R.id.button3);
        final ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        final ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    doSomething();
                    listView1.setAdapter(arrayAdapter);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    doSomething1();
                    listView1.setAdapter(arrayAdapter1);

                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
    public void doSomething(){
        Collections.sort(arrayList);
    }
    public void doSomething1(){
        Collections.sort(arrayList1,Collections.reverseOrder());
    }
}
