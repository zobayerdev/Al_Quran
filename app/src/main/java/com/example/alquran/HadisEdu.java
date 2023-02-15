package com.example.alquran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.alquran.amol.AdapterAmol;
import com.example.alquran.amol.ModelAmol;
import com.example.alquran.hadis.Adapterhadis;
import com.example.alquran.hadis.ModelHadis;

import java.util.ArrayList;
import java.util.List;

public class HadisEdu extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelHadis> hadislist;
    Adapterhadis adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis_edu);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("সহিহ আমল সমূহ");

        initData();
        initRecyclerView();

    }

    private void initData() {

        hadislist = new ArrayList<>();
        hadislist.add(new ModelHadis(
                "(০১) সে-ই মুসলিম, যার জিহ্বা ও হাত থেকে অন্য মুসলিম নিরাপদ থাকে।",
                "‘আবদুল্লাহ ইবনু ‘আমর (রাঃ) হতে বর্ণিত। আল্লাহর রাসূল সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম ইরশাদ করেন, সে-ই মুসলিম," +
                        " যার জিহবা ও হাত হতে সকল মুসলিম নিরাপদ এবং সে-ই প্রকৃত মুহাজির, আল্লাহ যা নিষেধ করেছেন তা যে ত্যাগ করে।",
                "(৬৪৮৪; মুসলিম ১/১৪ হাঃ ৪০, আহমাদ ৬৭৬৫)"));


        hadislist.add(new ModelHadis(
                "(০২) ইসলামে কোন্\u200C জিনিসটি উত্তম?",
                "আবূ মূসা (রাঃ) হতে বর্ণিত। তিনি বলেন, তারা (সাহাবাগণ) জিজ্ঞেস করলেন, হে আল্লাহর রাসূল! ইসলামে কোন্ জিনিসটি উত্তম? তিনি বললেনঃ যার জিহবা ও হাত হতে মুসলিমগণ নিরাপদ থাকে।",
                "(মুসলিম ১/১৪ হাঃ ৪২, আহমাদ ৬৭৬৫)"));


        hadislist.add(new ModelHadis(
                "(০৩) খাদ্য খাওয়ানো ইসলামের অন্তর্ভুক্ত।",
                "‘আবদুল্লাহ্ ইবনু ‘আমর (রাঃ) হতে বর্ণিত। জনৈক ব্যক্তি আল্লাহর রাসূল সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম -কে জিজ্ঞেস করল, ইসলামের কোন্ জিনিসটি উত্তম? তিনি বললেন, তুমি খাদ্য খাওয়াবে ও চেনা অচেনা সকলকে সালাম দিবে।",
                "(২৮, ৬২৩৬; মুসলিম ১/১৪ হাঃ ৪২, আহমাদ ৬৭৬৫)"));


        hadislist.add(new ModelHadis(
                "(০৪) নিজের জন্য যা পছন্দ করা হয় সেটা স্বীয় ভাইদের জন্যও পছন্দ করা ঈমানের অংশ।",
                "আনাস (রাযি.) হতে বর্ণিত। নবী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম বলেনঃ তোমাদের কেউ প্রকৃত মু‘মিন হতে পারবে না, যতক্ষণ না সে তার ভাইয়ের জন্য সেটাই পছন্দ করবে, যা তার নিজের জন্য পছন্দ করে।",
                "(মুসলিম ১/১৭ হাঃ ৪৫, আহমাদ ১২৮০১, ১৩৮৭৫)"));


        hadislist.add(new ModelHadis(
                "(০৫) আল্লাহ্\u200Cর রাসূল সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম-কে ভালোবাসা ঈমানের অন্তর্ভুক্ত।",
                "আবূ হুরাইরাহ (রাযি.) হতে বর্ণিত। আল্লাহর রাসূল সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম বলেনঃ সেই আল্লাহর শপথ, যাঁর হাতে আমার প্রাণ, তোমাদের কেউ প্রকৃত মু‘মিন হতে পারবে না, যতক্ষণ না আমি তার নিকট তার পিতা ও সন্তানাদির চেয়ে অধিক ভালবাসার পাত্র হই।",
                " (আধুনিক প্রকাশনীঃ ১৩, ইসলামিক ফাউন্ডেশনঃ ১৩)"));


        hadislist.add(new ModelHadis(
                "(০৬) ঈমানের সুস্বাদ।",
                "আনাস (রাযি.) হতে বর্ণিত। নবী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম বলেছেনঃ তিনটি গুণ যার মধ্যে আছে, সে ঈমানের স্বাদ আস্বাদন করতে পারেঃ ১। আল্লাহ্ ও তাঁর রাসূল তার নিকট অন্য সকল কিছু হতে অধিক প্রিয় হওয়া; ২। কাউকে একমাত্র আল্লাহর জন্যই ভালবাসা; ৩। কুফরীতে প্রত্যাবর্তনকে আগুনে নিক্ষিপ্ত হবার মত অপছন্দ করা।",
                "(২১, ৬০৪১, ৬৯৪১; মুসলিম ১/১৫ হাঃ ৪৩, আহমাদ ১২০০২)"));


        hadislist.add(new ModelHadis(
                "(০৭) আনসারকে ভালোবাসা ঈমানের আলামত।",
                "আনাস ইবনু মালিক (রাযি.) হতে বর্ণিত। নবী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম ইরশাদ করেনঃ ঈমানের আলামত হল আনসারকে ভালবাসা এবং মুনাফিকীর চিহ্ন হল আনসারের প্রতি শত্রুতা পোষণ করা।",
                "(৩৭৮৪; মুসলিম ১/৩৩ হাঃ ৭৪, আহমাদ ১৩৬০৮)"));


        hadislist.add(new ModelHadis(
                "(০৮) ফিতনা হতে পালায়ন দ্বীনের অংশ",
                "আবূ সা‘ঈদ খুদরী (রাযি.) হতে বর্ণিত। তিনি বলেন, আল্লাহর রাসূল সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম বলেছেনঃ সেদিন দূরে নয়, যেদিন মুসলিমের উত্তম সম্পদ হবে কয়েকটি বকরী, যা নিয়ে সে পাহাড়ের চূড়ায় অথবা বৃষ্টিপাতের স্থানে চলে যাবে। ফিতনা হতে সে তার ধর্ম সহকারে পলায়ন করবে।",
                "(৩৩০০, ৩৬০০, ৬৪৯৫, ৭০৮৮) (১৮, ইসলামিক ফাউন্ডেশনঃ ১৮)"));


        hadislist.add(new ModelHadis(
                "(০৯) লজ্জা ঈমানের অঙ্গ",
                "আব্দুল্লাহ ইবনু ‘উমার (রাযি.) হতে বর্ণিত। একদা আল্লাহর রাসূল সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম এক আনসারীর পাশ দিয়ে অতিক্রম করছিলেন। তিনি তাঁর ভাইকে তখন (অধিক) লজ্জা ত্যাগের জন্য নাসীহাত করছিলেন। আল্লাহর রাসূল সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম তাকে বললেনঃ ওকে ছেড়ে দাও। কারণ লজ্জা ঈমানের অঙ্গ।",
                "(৬১১৮; মুসলিম ১/১২ হাঃ ৩৬, আহমাদ ৪৫৫৪)"));


        hadislist.add(new ModelHadis(
                "(১০) সালামের প্রচলন করা ইসলামের শামিল।",
                "‘আবদুল্লাহ্ ইবনু ‘আমর (রাযি.) হতে বর্ণিত। এক ব্যক্তি আল্লাহর রাসূল সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম -কে জিজ্ঞেস করল, ‘ইসলামের কোন্ কাজ সবচেয়ে উত্তম?’ তিনি বললেনঃ তুমি লোকদের খাদ্য খাওয়াবে এবং চেনা অচেনা সকলকে সালাম দিবে।",
                "(আধুনিক প্রকাশনীঃ ২৭, ইসলামিক ফাউন্ডেশনঃ ২৭)"));

    }

    private void initRecyclerView() {

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapterhadis(hadislist);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}