package com.surveyprojectcs338.groupproject.surveyprojectcs338;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Questions
 *
 * 1. Age
 * 2. Ethnicity
 * 3. How old you were when you started gaming?
 * 4. Favorite console?
 * 5. First game?
 * 6. Favorite genre?
 * 7. Prefer AAA or Indie?
 * 8. What do you think about Rick? (Picture of Rick)
 * 9. What should the next question be?
 * 10. How did you find this survey?
 */

public class MainActivity extends AppCompatActivity {

    QuestionObject[] questionArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Start Video Activity
        //Intent intent = new Intent(this, VideoActivity.class);
        //startActivity(intent);

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
                new QuestionObject(0, "How did you find this survey?", null)
        };

        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
    }
}
