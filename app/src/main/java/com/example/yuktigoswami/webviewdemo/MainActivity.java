package com.example.yuktigoswami.webviewdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button f,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f=(Button)findViewById(R.id.button);
        g=(Button)findViewById(R.id.button2);
        f.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(MainActivity.this,ViewWeb.class);
                        startActivity(i);
                    }
                }
        );
        g.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(MainActivity.this,ViewWeb.class);
                        startActivity(i);
                    }
                }
        );
    }
}
