package com.surveyprojectcs338.groupproject.surveyprojectcs338;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class QuestionActivity extends AppCompatActivity {

    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        mEditText = (EditText) findViewById(R.id.questionEditText);
        mEditText.setVisibility(View.GONE);

    }
}
