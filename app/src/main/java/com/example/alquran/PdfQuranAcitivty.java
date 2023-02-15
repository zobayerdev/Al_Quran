package com.example.alquran;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class PdfQuranAcitivty extends AppCompatActivity {

    private PDFView pdfView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("আল-কুরআন");

        setContentView(R.layout.activity_pdf_quran_acitivty);

        pdfView = findViewById(R.id.pdfshow);

        pdfView.fromAsset("quran.pdf")
                .defaultPage(0)
                .enableSwipe(true)
                .swipeHorizontal(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(2)
                .load();
    }
}