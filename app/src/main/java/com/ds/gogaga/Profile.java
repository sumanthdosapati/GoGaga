package com.ds.gogaga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class Profile extends AppCompatActivity {

    ImageView fb,insta,tw;
    Button like,reject;
    ImageButton back,love;
    Toolbar toolbar;
    private boolean isChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        fb=findViewById(R.id.fb);
        insta=findViewById(R.id.insta);
        tw=findViewById(R.id.twitter);
        like=findViewById(R.id.like);
        reject=findViewById(R.id.reject);
        back=findViewById(R.id.back);
        love=findViewById(R.id.love);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(getApplicationContext(),"Follow me on Facebook", Toast.LENGTH_SHORT).show();
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(getApplicationContext(),"Follow me on Instagram", Toast.LENGTH_SHORT).show();
            }
        });
        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(getApplicationContext(),"Follow me on Twitter", Toast.LENGTH_SHORT).show();
            }
        });
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(getApplicationContext(),"You Liked..", Toast.LENGTH_SHORT).show();
            }
        });
        reject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(getApplicationContext(),"You Rejected..!", Toast.LENGTH_SHORT).show();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.warning(getApplicationContext(),"Back button clicked", Toast.LENGTH_SHORT).show();
            }
        });
        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(getApplicationContext(),"Added to Favourites", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
