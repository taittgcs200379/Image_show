package com.example.uimage_show_cw2;
import static com.example.uimage_show_cw2.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static ImageView imgView;
    private static  Button forward, backward;
    private int image=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView= findViewById(R.id.show_image);
        forward=findViewById(R.id.button2);
        backward=findViewById(R.id.button);

        setImageResource(image);
        backwardClick();
        forwardClick();
    }

    private void forwardClick() {
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(image>1)
                {
                    image--;
                    setImageResource(image);
                }
            }
        });
    }

    private void backwardClick() {
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(image<2)
                {
                    image++;
                    setImageResource(image);
                }

            }
        });

    }
    private void setImageResource(int index) {

        switch (index) {
            case 1:
                imgView.setImageResource(R.drawable.image1);
                break;
            case 2:
                imgView.setImageResource(R.drawable.image2);
                break;

        }
    }

}