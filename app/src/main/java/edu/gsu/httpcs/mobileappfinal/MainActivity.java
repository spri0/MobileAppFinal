package edu.gsu.httpcs.mobileappfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import edu.gsu.httpcs.mobileappfinal.Fragments.BoardFragment;

public class MainActivity extends AppCompatActivity {

    private static RadioGroup radio_gr;
    private static RadioButton radio_1, radio_2, radio_activity;
    private static Button button_rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio_gr=(RadioGroup) findViewById(R.id.RadGr);

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
}
