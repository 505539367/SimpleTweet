package com.codepath.apps.restclienttemplate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;

public class TweetDetailAcitivity extends AppCompatActivity {

    ImageView ivProfileImage;
    TextView tvBody;
    TextView tvScreenName;
    TextView tvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_acitivity);
        ivProfileImage = findViewById(R.id.ivProfileImage);
        tvBody = findViewById(R.id.tvBody);
        tvScreenName = findViewById(R.id.tvScreenName);
        tvTime = findViewById((R.id.tvTime));

        Intent i = getIntent();
        tvBody.setText(i.getStringExtra("body"));
        tvScreenName.setText(i.getStringExtra("name"));
        tvTime.setText(i.getStringExtra("time"));
        Glide.with(this).load(i.getStringExtra("imageurl")).transform(new CenterInside(), new RoundedCorners(15)).into(ivProfileImage);;


    }
}
