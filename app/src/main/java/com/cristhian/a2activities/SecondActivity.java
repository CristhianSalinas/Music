package com.cristhian.a2activities;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        videoView = (VideoView) findViewById(R.id.Video_Test);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.Video));
        videoView.start();
    }
}