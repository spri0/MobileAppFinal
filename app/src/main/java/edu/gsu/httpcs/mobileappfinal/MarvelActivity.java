package edu.gsu.httpcs.mobileappfinal;

import android.graphics.Matrix;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MarvelActivity extends AppCompatActivity {

    ImageView imageView;
    Matrix matrix=new Matrix();
    Float scale=1f;
    ScaleGestureDetector SGD;

    public void didTapButton(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.imageButton);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        button.startAnimation(myAnim);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marvel);

        final MediaPlayer sound5=MediaPlayer.create(this, R.raw.wolvr);
        Button butt5=(Button) this.findViewById(R.id.buttonWo);
        butt5.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               sound5.start();
           }
        });

        final MediaPlayer sound6=MediaPlayer.create(this, R.raw.cyc);
        Button butt6=(Button) this.findViewById(R.id.buttonCy);
        butt6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sound6.start();
            }
        });

        final MediaPlayer sound7=MediaPlayer.create(this, R.raw.spidr);
        Button butt7=(Button) this.findViewById(R.id.buttonSp);
        butt7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sound7.start();
            }
        });

        final MediaPlayer sound8=MediaPlayer.create(this, R.raw.jugr);
        Button butt8=(Button) this.findViewById(R.id.buttonJu);
        butt8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sound8.start();
            }
        });

        imageView=(ImageView) findViewById(R.id.imageButton);
        SGD=new ScaleGestureDetector(this,new ScaleListener());

    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{
        @Override
        public boolean onScale(ScaleGestureDetector detector){
            scale=scale*detector.getScaleFactor();
            scale=Math.max(0.1f, Math.min(scale,5f));
            matrix.setScale(scale,scale);
            imageView.setImageMatrix(matrix);
            return true;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        SGD.onTouchEvent(event);
        return true;
    }
}
