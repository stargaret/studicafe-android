package com.studicafe;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class QuestionList extends Activity {

	ArrayList<String> questions = new ArrayList<String>();
	private QuestionListAdapter questionListAdapter;
	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question_list);
		questions.add("Rate = k[M]");
		questions.add("Rate = k[N]");
		questions.add("Rate = k[O]");
		questions.add("Rate = k[P]");
		questions.add("Rate = k[Q]");
		questions.add(randomString());

		// final View view = inflater.inflate(R.layout.activity_question_list,
		// container, false);
		questionListAdapter = new QuestionListAdapter(getApplicationContext(), questions);
		listView = (ListView) findViewById(R.id.question_list);
		listView.setAdapter(questionListAdapter);

		OnItemClickListener listener = new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View view, int position, long id) {
				int rightAnswerPos = (int) ((((questions.size() - 1) * Math.random()) + position))
						% questions.size();
				questionListAdapter.setHighlighted(rightAnswerPos);
				questionListAdapter.setWrongAnswer(position);
				questionListAdapter.notifyDataSetChanged();
			}
		};
		listView.setOnItemClickListener(listener);
	}

	private String randomString() {
		return String.valueOf(Math.random());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_question_list, menu);
		return true;
	}

}
