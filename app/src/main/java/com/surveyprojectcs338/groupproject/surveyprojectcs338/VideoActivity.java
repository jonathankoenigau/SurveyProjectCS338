package com.surveyprojectcs338.groupproject.surveyprojectcs338;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.File;

public class VideoActivity extends AppCompatActivity {

    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        mVideoView = (VideoView)findViewById(R.id.video);
        // Where I found uri parse file: https://stackoverflow.com/questions/4896223/how-to-get-an-uri-of-an-image-resource-in-android
        // Where I saw to make a new folder for the video file: https://stackoverflow.com/questions/38612506/where-to-put-the-video-file-in-android-project
        Uri uri = Uri.parse("android.resource://com.surveyprojectcs338.groupproject.surveyprojectcs338/" + R.raw.rickroll);
        mVideoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(mVideoView);
        mVideoView.setMediaController(mediaController);

        mVideoView.start();
    }
}
