package com.example.Assignment4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new MyAdapter(dataListQueu()));
    }

    public ArrayList<Model> dataListQueu() {
        ArrayList<Model> holder = new ArrayList<>();

        Model ob1 = new Model();
        ob1.setName("Huzaifa");
        ob1.setEmail("huzaifa123@hotmail.com");
        ob1.setContact("123456789");

        holder.add(ob1);

        Model ob2 = new Model();
        ob2.setName("Hamza");
        ob2.setEmail("Haseeb123@hotmail.com");
        ob2.setContact("123456789");
        holder.add(ob2);

        Model ob3 = new Model();
        ob3.setName("Umair");
        ob3.setEmail("Umair@gmail.com");
        ob3.setContact("123456789");
        holder.add(ob3);

        Model ob4 = new Model();
        ob4.setName("Irtiza");
        ob4.setEmail("ietiza123@gmail.com");
        ob4.setContact("123456789");
        holder.add(ob4);


        return holder;
    }
}