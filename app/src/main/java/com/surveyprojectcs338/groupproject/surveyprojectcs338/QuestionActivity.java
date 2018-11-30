package com.surveyprojectcs338.groupproject.surveyprojectcs338;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {

    TextView mQuestionText;
    ImageView mRickImage;

    EditText mEditText;

    RadioGroup mRadioGroup;
    RadioButton mRadio1;
    RadioButton mRadio2;
    RadioButton mRadio3;
    RadioButton mRadio4;
    RadioButton mRadio5;

    CheckBox mCheck1;
    CheckBox mCheck2;
    CheckBox mCheck3;
    CheckBox mCheck4;
    CheckBox mCheck5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        mEditText = (EditText) findViewById(R.id.questionEditText);
        mEditText.setVisibility(View.GONE);

    }
}
