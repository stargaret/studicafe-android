package com.studicafe;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class QuestionListAdapter extends ArrayAdapter<String> {

    private Context context;
    private List<String> items;
    private int highlighted = -1;
    private int wrongAnswer = -1;

    public QuestionListAdapter() {
        super(null, R.layout.question_list_row);
    }
    public QuestionListAdapter(Context context, List<String> objects) {
        super(context, R.layout.question_list_row, objects);
        this.context = context;
        this.items = objects;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.question_list_row, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.question_row_item);
        textView.setText(items.get(position).toString());
        if (position == highlighted) {
            rowView.setBackgroundColor(Color.rgb(80, 160, 160));
        }
        if (position == wrongAnswer) {
            ((ImageView) rowView.findViewById(R.id.question_row_x)).setVisibility(View.VISIBLE);
        }
        return rowView;
    }

    public void setHighlighted(int highlighted) {
        this.highlighted = highlighted;
    }

    ;

    public void setWrongAnswer(int wrongAnswer) {
        this.wrongAnswer = wrongAnswer;
    }

    public void doSomething(int id) {

    }

    ;

}
