package com.example.mateusz.seekbar_19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static SeekBar seek_bar ;
    private  static TextView text_view ;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekbarr();
    }
    public void seekbarr() {
        seek_bar=(SeekBar)findViewById(R.id.seekBar) ;
        text_view=(TextView)findViewById(R.id.textView);
        text_view.setText("Covered: " + seek_bar.getProgress() + "/" + seek_bar.getMax());

        seek_bar.setOnSeekBarChangeListener(
                
                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value ;
                    int colour_increment=0xff000011 ;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progress_value=progress ;
                        text_view.setText("Covered: " + seek_bar.getProgress() + "/" + seek_bar.getMax());
                        Toast.makeText(MainActivity.this,"SeekBar in progress",Toast.LENGTH_SHORT).show();

                        if (seek_bar.getProgress()<=10){
                            seek_bar.setBackgroundColor(colour_increment);

                        }
                        else if (seek_bar.getProgress()<=20){
                            seek_bar.setBackgroundColor(2*colour_increment);
                        }
                        else if (seek_bar.getProgress()<=30){
                            seek_bar.setBackgroundColor(3*colour_increment);
                        }
                        else if (seek_bar.getProgress()<=40){
                            seek_bar.setBackgroundColor(4*colour_increment);
                        }
                        else if (seek_bar.getProgress()<=50){
                            seek_bar.setBackgroundColor(5*colour_increment);
                        }
                        else if (seek_bar.getProgress()<=60){
                            seek_bar.setBackgroundColor(6*colour_increment);
                        }
                        else if (seek_bar.getProgress()<=70){
                            seek_bar.setBackgroundColor(7*colour_increment);
                        }
                        else if (seek_bar.getProgress()<=80){
                            seek_bar.setBackgroundColor(8*colour_increment);
                        }
                        else if (seek_bar.getProgress()<=90){
                            seek_bar.setBackgroundColor(9*colour_increment);
                        }
                        else if (seek_bar.getProgress()<=100){
                            seek_bar.setBackgroundColor(10*colour_increment);
                        }
                        else if (seek_bar.getProgress()<=110){
                            seek_bar.setBackgroundColor(11*colour_increment);
                        }
                        else if (seek_bar.getProgress()<=120){
                            seek_bar.setBackgroundColor(12*colour_increment);
                        }
                        else if (seek_bar.getProgress()<=130){
                            seek_bar.setBackgroundColor(13*colour_increment);
                        }
                        else if (seek_bar.getProgress()<=140){
                            seek_bar.setBackgroundColor(14*colour_increment);
                        }
                        else if (seek_bar.getProgress()<=15){
                            seek_bar.setBackgroundColor(15*colour_increment);
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(MainActivity.this,"SeekBar in StartTracking",Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        text_view.setText("Covered: "+seek_bar.getProgress()+"/"+seek_bar.getMax());
                        Toast.makeText(MainActivity.this,"SeekBar in StopTracking",Toast.LENGTH_SHORT).show();

                    }
                }
        );

    }
}
