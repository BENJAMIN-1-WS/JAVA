package com.example.color;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    View screenView;
    Button Click;
    Button Click2;
    int[] color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //
        setContentView(R.layout.activity_main); //
        color = new int[] {Color.BLUE, Color.GREEN, Color.GRAY, Color.YELLOW , Color.MAGENTA,Color.LTGRAY }; //arry

        screenView=findViewById(R.id.rView); // id rView From activity_main = > app  screen View

        Click = (Button) findViewById(R.id.button2); // Change Background color On App



        Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int aryLength=color.length;
                Random random=new Random();
                int rNum=random.nextInt(aryLength);

                screenView.setBackgroundColor(color[rNum]); // update color

            }
        });

    }

}