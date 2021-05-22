package com.example.visualization50;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    private TextView mTextView;
    int a=1;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(this);

        mTextView = (TextView)findViewById(R.id.textView);
        mTextView.setText("0");
    }
    public void goToMapsActivity(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("amount",a);
        startActivity(intent);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (seekBar.getProgress() <5) {
            mTextView.setText("1");
            a=1;
        }else {

            if (seekBar.getProgress() < 10) {
                mTextView.setText("2");
                a=2;
            }else{
                if (seekBar.getProgress() < 15) {
                    mTextView.setText("3");
                    a=3;
                }else {
                    if (seekBar.getProgress() < 20) {
                        mTextView.setText("4");
                        a=4;
                    }else{
                        if (seekBar.getProgress() < 25) {
                            mTextView.setText("5");
                            a=5;
                        }else {
                            if (seekBar.getProgress() < 30) {
                                mTextView.setText("6");
                                a=6;
                            }else {
                                if (seekBar.getProgress() < 35) {
                                    mTextView.setText("7");
                                    a=7;
                                }else {
                                    if (seekBar.getProgress() < 40) {
                                        mTextView.setText("8");
                                        a=8;
                                    }else {
                                        if (seekBar.getProgress() < 45) {
                                            mTextView.setText("9");
                                            a=9;
                                        }else {
                                            if (seekBar.getProgress() < 50) {
                                                mTextView.setText("10");
                                                a=10;
                                            }else {
                                                if (seekBar.getProgress() < 55) {
                                                    mTextView.setText("11");
                                                    a=11;
                                                }else {
                                                    if (seekBar.getProgress() < 60) {
                                                        mTextView.setText("12");
                                                        a=12;
                                                    }else {
                                                        if (seekBar.getProgress() < 65) {
                                                            mTextView.setText("13");
                                                            a=13;
                                                        }else {
                                                            if (seekBar.getProgress() < 70) {
                                                                mTextView.setText("14");
                                                                a=14;
                                                            }else {
                                                                if (seekBar.getProgress() < 75) {
                                                                    mTextView.setText("15");
                                                                    a=15;
                                                                }else {
                                                                    if (seekBar.getProgress() < 80) {
                                                                        mTextView.setText("16");
                                                                        a=16;
                                                                    }else {
                                                                        if (seekBar.getProgress() < 85) {
                                                                            mTextView.setText("17");
                                                                            a=17;
                                                                        }else {
                                                                            if (seekBar.getProgress() < 90) {
                                                                                mTextView.setText("18");
                                                                                a=18;
                                                                            }else {
                                                                                if (seekBar.getProgress() < 95) {
                                                                                    mTextView.setText("19");
                                                                                    a=19;
                                                                                }else {
                                                                                    if (seekBar.getProgress() <= 100) {
                                                                                        mTextView.setText("20");
                                                                                        a=20;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}