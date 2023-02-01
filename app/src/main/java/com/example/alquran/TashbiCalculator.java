package com.example.alquran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class TashbiCalculator extends AppCompatActivity {

    private Button add, sub;
    private TextView textView;
    private ProgressBar progressBar;
    int valueprocess = 0;
    private Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tashbi_calculator);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("তাসবিহ");


        String [] type ={" আল্লাহু আকবর"," সুবহানাল্লাহ"," আলহামদুল্লিল্লাহ"," আস্তাগফিরুল্লাহ"," লা ইলাহা ইল্লাল্লাহু মোহাম্মাদুর রাসুল্লাহ"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,R.layout.drop_down_list,type
        );

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.filled_exposed);
        autoCompleteTextView.setAdapter(adapter);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(TashbiCalculator.this, "আপনি"+autoCompleteTextView.getText().toString()+" সিলেক্ট করেছেন", Toast.LENGTH_SHORT).show();
            }
        });



        sub = findViewById(R.id.sub);
        progressBar = findViewById(R.id.progressBar);
        textView = findViewById(R.id.textView);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sub.isClickable()) {
                    valueprocess = 0;
                    updateProgress();
                    vibrator.vibrate(20);
                } else {
                    vibrator.vibrate(2);
                }
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valueprocess <= 99) {
                    valueprocess += 1;
                    vibrator.vibrate(30);
                    updateProgress();
                } else if (valueprocess == 100) {
                    Toast.makeText(TashbiCalculator.this, "আপনি "+valueprocess+" বার পাঠ করেছেন"+autoCompleteTextView.getText().toString() , Toast.LENGTH_LONG).show();
                    Toast.makeText(TashbiCalculator.this, "!!!! নতুন করে তাসবিহ পাঠ করতে রিসেট বাটনে ক্লিক করে পড়ুন !!!!", Toast.LENGTH_SHORT).show();
                    vibrator.vibrate(2000);
                }
            }

        });
        updateProgress();
    }

    public void updateProgress() {
        progressBar.setProgress(valueprocess);
        textView.setText(valueprocess + " বার");
    }
}