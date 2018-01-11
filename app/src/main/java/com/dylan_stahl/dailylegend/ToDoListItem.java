package com.dylan_stahl.dailylegend;

import java.util.ArrayList;

/**
 * Created by Pfheonix on 1/11/2018.
 */

public class ToDoListItem {
    private String itemTitle;
    private boolean repeatable;

    public ToDoListItem(String title, boolean isRepeatable){
        this.itemTitle = title;
        this.repeatable = isRepeatable;
    }

    public String getTitle(){
        return this.itemTitle;
    }

    public boolean isRepeatable(){
        return this.repeatable;
    }

    public static ArrayList<ToDoListItem> mockList(){

        ArrayList<ToDoListItem> outputList = new ArrayList<>();

        for(int i = 0; i < 5; ++i){
            outputList.add(new ToDoListItem("Item " + i, true));
        }

        return outputList;
    }
}
