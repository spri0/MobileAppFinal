package edu.gsu.httpcs.mobileappfinal;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SFActivity extends AppCompatActivity {

    ImageButton but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sf);

        final MediaPlayer sound1=MediaPlayer.create(this, R.raw.ryur);
        Button butt1=(Button) this.findViewById(R.id.buttonRy);
        butt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sound1.start();
            }
        });

        final MediaPlayer sound2=MediaPlayer.create(this, R.raw.kenr);
        Button butt2=(Button) this.findViewById(R.id.buttonKe);
        butt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sound2.start();
            }
        });

        final MediaPlayer sound3=MediaPlayer.create(this, R.raw.chunr);
        Button butt3=(Button) this.findViewById(R.id.buttonCh);
        butt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sound3.start();
            }
        });

        final MediaPlayer sound4=MediaPlayer.create(this, R.raw.dhalr);
        Button butt4=(Button) this.findViewById(R.id.buttonDh);
        butt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sound4.start();
            }
        });

        but1=(ImageButton)findViewById(R.id.imageButton3);
        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent char1=new Intent(SFActivity.this,CharActivity.class);
                startActivity(char1);
            }
        });

    }
}
