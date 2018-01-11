package com.dylan_stahl.dailylegend;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pfheonix on 1/11/2018.
 */

public class ToDoListAdapter extends RecyclerView.Adapter<ToDoListAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitleTextView;
        public Button mEditButton;

        public ViewHolder(View itemView){

            super(itemView);

            mTitleTextView = (TextView) itemView.findViewById(R.id.todoitemtitle);
            mEditButton = (Button) itemView.findViewById(R.id.edit_button);
        }
    }

    private List<ToDoListItem> mItems;
    private Context mContext;

    public ToDoListAdapter(Context context, List<ToDoListItem> items){
        mContext = context;
        mItems = items;
    }

    private Context getContext() {
        return mContext;
    }

    @Override
    public ToDoListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View toDoView = inflater.inflate(R.layout.todoitem, parent, false);

        ViewHolder viewHolder = new ViewHolder(toDoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ToDoListAdapter.ViewHolder viewHolder, int position){

        ToDoListItem toDoItem = mItems.get(position);

        TextView textView = viewHolder.mTitleTextView;
        textView.setText(toDoItem.getTitle());
        Button button = viewHolder.mEditButton;
        button.setText(R.string.edit);
    }

    @Override
    public int getItemCount(){
        return this.mItems.size();
    }
}
