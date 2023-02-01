package com.example.alquran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.alquran.allahname.Adapter;
import com.example.alquran.allahname.ModelClass;
import com.example.alquran.dua.AdapterDua;
import com.example.alquran.dua.ModelDua;

import java.util.ArrayList;
import java.util.List;

public class DuaActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelDua> dualist;
    AdapterDua adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("দোয়া সমূহ");

        initData();
        initRecyclerView();
    }

    private void initData() {

        dualist = new ArrayList<>();
        dualist.add(new ModelDua("ঘুমানোর আগে ও পরে যে দোয়া পড়তেন বিশ্বনবি","\u200F اَللَّهُمَّ بِاسْمِكَ أَمُوتُ وَأَحْيَا\n" +
                "উচ্চারণ- আল্লাহুম্মা বিসমিকা আমুতু ওয়া আহইয়া।\n" +
                "অর্থ : ‘হে আল্লাহ! আপনারই নামে মরে যাই আবার আপনারই নামে জীবন লাভ করি।’\nআর যখন (ঘুম থেকে) সজাগ হতেন, তখন বলতেন-\n" +
                "الْحَمْدُ لِلَّهِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ\n" +
                "\nউচ্চারণ- ‘আলহামদু লিল্লাহিল লাজি আহইয়ানা বা’দা মা আমাতানা ওয়া ইলাইহিন নুশুর।’\n" +
                "\nঅর্থ : ‘সব প্রশংসা ওই আল্লাহর জন্য, যিনি মৃত্যুর পর আমাদের জীবন দান করেছেন এবং তার দিকেই আমাদের পুনরুত্থান।’","নূরানি কুরআন শিক্ষা"));


        dualist.add(new ModelDua("ঘূর্ণিঝড়ে যে দোয়া পড়বেন","রাসুলুল্লাহ সাল্লাল্লাহু আলাইহি ওয়া সাল্লাম বলেছেন, ‘তোমরা বাতাসকে গালি দিও না। তবে যদি তোমরা একে তোমাদের ইচ্ছার বিরুদ্ধে দেখতে পাও," +
                " তবে এ দোয়া করবে- \n اَللَّهُمَّ اِنَّا نَسْئَالُكَ مِنْ خَيْرِ هَذِهِ الرِّيْحِ وَ خَيْرِ مَا فَيْهَا وَ خَيْرِمَا أُمِرَتْ بِهِ وَ نَعُوْذُبِكَ مِنْ شَرِّ هَذِهِ الرِّيْحِ وَ شَرِّ مَا فَيْهَا وَ شَرِّ مَا أُمِرَتْ بِهِ\n" +
                "\nউচ্চারণ : আল্লাহুম্মা ইন্না নাসআলুকা মিন খাইরি হাজিহির রিহি ওয়া খাইরি মা ফিহা ওয়া খাইরি মা উমিরাত বিহি, ওয়া নাউজুবিকা মিন শাররি হাজিহির রিহি ওয়া শাররি মা ফিহা ওয়া শাররি মা উমিরাত বিহি’" +
                " \n\nঅর্থ : হে আল্লাহ! আমরা তোমার নিকট এ বাতাসের ভালো দিক, এতে যে কল্যাণ রয়েছে তা এবং যে উদ্দেশ্যে তা নির্দেশপ্রাপ্ত হয়ে এসেছে তার উত্তম দিকটি প্রার্থনা করছি।" +
                " এবং তোমার নিকট এর খারাপ দিক হতে, এতে যে অকল্যাণ রয়েছে তা হতে এবং এটা যে উদ্দেশ্যে আদেশপ্রাপ্ত হয়ে এসেছে তার মন্দ দিক হতে আশ্রয় প্রার্থনা করছি।","(তিরমিজি, মিশকাত)"));

        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));


        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));



        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));



        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));
        dualist.add(new ModelDua("ঘুমাতে যাওয়ার আগে দোয়া","আল্লাহু আকবার","নূরানি কুরআন শিক্ষা"));



    }

    private void initRecyclerView() {

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new AdapterDua(dualist);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}