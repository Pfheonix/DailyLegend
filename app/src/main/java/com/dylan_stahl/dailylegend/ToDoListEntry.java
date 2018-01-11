package com.dylan_stahl.dailylegend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by dylan on 1/10/18.
 */

public class ToDoListEntry extends AppCompatActivity {

    ArrayList<ToDoListItem> toDoListItems;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolistentry);

        RecyclerView rvToDo = (RecyclerView) findViewById(R.id.toDoListRecycler);

        toDoListItems = ToDoListItem.mockList();

        ToDoListAdapter toDoAdapter = new ToDoListAdapter(this, toDoListItems);

        rvToDo.setAdapter(toDoAdapter);

        rvToDo.setLayoutManager(new LinearLayoutManager(this));


    }
}
