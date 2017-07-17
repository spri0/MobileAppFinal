package edu.gsu.httpcs.mobileappfinal;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final Context context=this;
    private static RadioGroup radio_gr;
    private static RadioButton radio_1, radio_2, radio_activity;
    private Button bStart;
    private Button bStop;
    private ImageButton dead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio_gr=(RadioGroup) findViewById(R.id.RadGr);

        bStart=(Button) findViewById(R.id.stabutton);
        bStop=(Button) findViewById(R.id.stobutton);

        bStart.setOnClickListener(this);
        bStop.setOnClickListener(this);

        dead=(ImageButton)findViewById(R.id.sakbutton);
        dead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog=new Dialog(context);
                dialog.setContentView(R.layout.dialog);
                TextView txt=(TextView)
                        dialog.findViewById(R.id.txt);
                txt.setText("Hello there!");
                Button dialogButton= (Button)
                    dialog.findViewById(R.id.dialogButton);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });


        radio_gr.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){

                if(checkedId==R.id.radioButton){
                    radio_1=(RadioButton)findViewById(R.id.radioButton);
                    radio_1.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            Intent sfi=new Intent(MainActivity.this,SFActivity.class);
                            startActivity(sfi);
                        }
                    });
                }

                if(checkedId==R.id.radioButton2){
                    radio_2=(RadioButton)findViewById(R.id.radioButton2);
                    radio_2.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            Intent marvi=new Intent(MainActivity.this,MarvelActivity.class);
                            startActivity(marvi);
                        }
                    });
                }

                if(checkedId==R.id.radioButton3){
                    radio_activity=(RadioButton)findViewById(R.id.radioButton3);
                    radio_activity.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            Intent activi=new Intent(MainActivity.this,InfoActivity.class);
                            startActivity(activi);
                        }
                    });
                }

            }
        });

    }

    @Override
    public void onClick(View view){
        if (view==bStart){
            startService(new Intent(this, theService.class));
        } else if (view==bStop){
            stopService(new Intent(this, theService.class));
        }
    }
}
