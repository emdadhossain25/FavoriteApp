package com.example.administrator.favoriteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // TODO (26) Create an EditText variable called mSearchBoxEditText
    EditText mSearchBoxEditText;
    // TODO (27) Create a TextView variable called mUrlDisplayTextView
    TextView mUrlDispalyTextView;
    // TODO (28) Create a TextView variable called mSearchResultsTextView
    TextView mSearchResultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // TODO (29) Use findViewById to get a reference to mSearchBoxEditText
        mSearchBoxEditText = (EditText) findViewById(R.id.et_search_box);
        // TODO (30) Use findViewById to get a reference to mUrlDisplayTextView
        mUrlDispalyTextView = (TextView) findViewById(R.id.tv_url_display);
        // TODO (31) Use findViewById to get a reference to mSearchResultsTextView
        mSearchResultsTextView = (TextView) findViewById(R.id.tv_github_search_results_json);
    }
}

