package com.surveyprojectcs338.groupproject.surveyprojectcs338;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    RadioButton[] mRadioArray;

    CheckBox mCheck1;
    CheckBox mCheck2;
    CheckBox mCheck3;
    CheckBox mCheck4;
    CheckBox mCheck5;

    Button mButton;

    QuestionObject[] questionArray;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        mQuestionText = (TextView) findViewById(R.id.questionName);
        mRickImage = (ImageView) findViewById(R.id.rickImage);

        mEditText = (EditText) findViewById(R.id.questionEditText);

        mRadioGroup = (RadioGroup) findViewById(R.id.questionRadioGroup);
        mRadio1 = (RadioButton) findViewById(R.id.questionRadioButton1);
        mRadio2 = (RadioButton) findViewById(R.id.questionRadioButton2);
        mRadio3 = (RadioButton) findViewById(R.id.questionRadioButton3);
        mRadio4 = (RadioButton) findViewById(R.id.questionRadioButton4);
        mRadio5 = (RadioButton) findViewById(R.id.questionRadioButton5);
        mRadioArray = new RadioButton[]{mRadio1, mRadio2, mRadio3, mRadio4, mRadio5};

        mCheck1 = (CheckBox) findViewById(R.id.questionCheckBox1);
        mCheck2 = (CheckBox) findViewById(R.id.questionCheckBox2);
        mCheck3 = (CheckBox) findViewById(R.id.questionCheckBox3);
        mCheck4 = (CheckBox) findViewById(R.id.questionCheckBox4);
        mCheck5 = (CheckBox) findViewById(R.id.questionCheckBox5);

        mButton = (Button) findViewById(R.id.questionButton);

        questionArray = new QuestionObject[]{
                new QuestionObject(0, "How old are you?", null),
                new QuestionObject(0, "What is your ethnicity?", null),
                new QuestionObject(1, "How old were you when you first started gaming?",
                        new String[]{"0 - 4", "5 - 9", "10 - 15", "16 - 22", "23 - 999"}),
                new QuestionObject(0, "What is your favorite console?", null),
                new QuestionObject(0, "What was your first game?", null),
                new QuestionObject(1, "What is your favorite genre?",
                        new String[]{"Action", "RPG", "Horror", "Shooter", "Beat-em-up"}),
                new QuestionObject(1, "Do you prefer AAA or Indie?",
                        new String[]{"AAA", "Indie"}),
                new QuestionObject(2, "What do you think about Rick?",
                        new String[]{"Our Lord and Savior", "The Perfect Being", "Very Cool", "Incredible", "Rick"}),
                new QuestionObject(0, "What should the next question be?", null),
                new QuestionObject(0, "How did you find this survey?", null),
                new QuestionObject(1, "Are you sure you want to submit your answers?",
                        new String[]{"Yes", "No"})
        };

        // Set up original question

        // Set Question Name
        mQuestionText.setText(questionArray[0].getQuestionName());
        mRickImage.setVisibility(View.GONE);

        mEditText.setVisibility(View.VISIBLE);

        mRadioGroup.setVisibility(View.GONE);

        mCheck1.setVisibility(View.GONE);
        mCheck2.setVisibility(View.GONE);
        mCheck3.setVisibility(View.GONE);
        mCheck4.setVisibility(View.GONE);
        mCheck5.setVisibility(View.GONE);

        // Set up Button
        i = 1;

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i != questionArray.length) {
                    QuestionObject question = questionArray[i];

                    // Set Question Name
                    mQuestionText.setText(question.getQuestionName());
                    // If question is fill in
                    if (question.getQuestionType() == 0) {
                        mRickImage.setVisibility(View.GONE);

                        mEditText.setVisibility(View.VISIBLE);

                        mRadioGroup.setVisibility(View.GONE);

                        mCheck1.setVisibility(View.GONE);
                        mCheck2.setVisibility(View.GONE);
                        mCheck3.setVisibility(View.GONE);
                        mCheck4.setVisibility(View.GONE);
                        mCheck5.setVisibility(View.GONE);
                    }
                    // If question is radio button
                    else if (question.getQuestionType() == 1) {
                        mRickImage.setVisibility(View.GONE);

                        mEditText.setVisibility(View.GONE);

                        mRadioGroup.setVisibility(View.VISIBLE);

                        mRadio1.setVisibility(View.GONE);
                        mRadio2.setVisibility(View.GONE);
                        mRadio3.setVisibility(View.GONE);
                        mRadio4.setVisibility(View.GONE);
                        mRadio5.setVisibility(View.GONE);

                        mCheck1.setVisibility(View.GONE);
                        mCheck2.setVisibility(View.GONE);
                        mCheck3.setVisibility(View.GONE);
                        mCheck4.setVisibility(View.GONE);
                        mCheck5.setVisibility(View.GONE);

                        // Set radio buttons
                        for (int l = 0; l < question.getRadioAnswers().length; l++) {
                            mRadioArray[l].setText(question.getRadioAnswers()[l]);
                            mRadioArray[l].setVisibility(View.VISIBLE);
                        }
                    }
                    // If question is rick
                    else if (question.getQuestionType() == 2) {
                        mRickImage.setVisibility(View.VISIBLE);

                        mEditText.setVisibility(View.GONE);

                        mRadioGroup.setVisibility(View.GONE);

                        mCheck1.setVisibility(View.VISIBLE);
                        mCheck2.setVisibility(View.VISIBLE);
                        mCheck3.setVisibility(View.VISIBLE);
                        mCheck4.setVisibility(View.VISIBLE);
                        mCheck5.setVisibility(View.VISIBLE);

                        // Set radio buttons
                        mRadio1.setText(question.getRadioAnswers()[0]);
                        mRadio2.setText(question.getRadioAnswers()[1]);
                        mRadio3.setText(question.getRadioAnswers()[2]);
                        mRadio4.setText(question.getRadioAnswers()[3]);
                        mRadio5.setText(question.getRadioAnswers()[4]);

                        // Set check boxes
                        mCheck1.setText(question.getRadioAnswers()[0]);
                        mCheck2.setText(question.getRadioAnswers()[1]);
                        mCheck3.setText(question.getRadioAnswers()[2]);
                        mCheck4.setText(question.getRadioAnswers()[3]);
                        mCheck5.setText(question.getRadioAnswers()[4]);
                    }

                    // Increment through the array
                    i++;
                }
                else {
                    Intent intent = new Intent(QuestionActivity.this, VideoActivity.class);
                    startActivity(intent);
                }
            }
        });


    }
}
