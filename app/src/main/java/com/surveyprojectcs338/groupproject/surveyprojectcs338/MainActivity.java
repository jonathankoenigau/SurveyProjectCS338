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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Start Video Activity
        //Intent intent = new Intent(this, VideoActivity.class);
        //startActivity(intent);

        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
    }
}
