package com.example.alquran;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private Button go_notification_activity;

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;
    private CardView offlineQuran, pdfQuran, quran, hadis, dinsikkha, Amol,
            dua, seheri, prayEdu, jakat, tasbih, qibla, allahName;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // offlineQuran = findViewById(R.id.offlineQuran);
        hadis = findViewById(R.id.hadis);
        dinsikkha = findViewById(R.id.dinsikkha);
        Amol = findViewById(R.id.amol);
        dua = findViewById(R.id.dua);
        // seheri = findViewById(R.id.seheri);
        prayEdu = findViewById(R.id.prayEdu);
        jakat = findViewById(R.id.jakat);
        tasbih = findViewById(R.id.tasbih);
        qibla = findViewById(R.id.qibla);
        allahName = findViewById(R.id.allahName);
        // donation = findViewById(R.id.donation);
        quran = findViewById(R.id.quran);
        pdfQuran = findViewById(R.id.pdfQuran);


        // ############################# Drawer Layout Activity ##########################
        // init drawerLayout
        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigation_view);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.start, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // eikhane eituku hocche amader navigation layout er kaj korar jonno.
        navigationView.setNavigationItemSelectedListener(this::onOptionsItemSelected);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        quran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Intent intent = new Intent(MainActivity.this, UpdateQuranActivity.class);
                // startActivity(intent);
                Toast.makeText(MainActivity.this, "??????-???????????????...!", Toast.LENGTH_SHORT).show();
            }
        });

        pdfQuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PdfQuranAcitivty.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "??????????????? ????????? ????????????...", Toast.LENGTH_SHORT).show();
            }
        });

        qibla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, KabaActivity.class));
                Toast.makeText(MainActivity.this, "??????????????? ?????????????????? ????????????...!", Toast.LENGTH_SHORT).show();
            }
        });

        hadis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HadisEdu.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "??????????????? ????????????...!", Toast.LENGTH_SHORT).show();
            }
        });

        dinsikkha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DiniSikkha.class));
            }
        });

        Amol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AmolActivity.class));
                Toast.makeText(MainActivity.this, "????????????????????? ????????? ???????????? ???????????? ?????????...!", Toast.LENGTH_SHORT).show();
            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DuaActivity.class));
                Toast.makeText(MainActivity.this, "???????????? ???????????? ???????????? ?????????...!", Toast.LENGTH_SHORT).show();
            }
        });

        allahName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AllahnameActivity.class));
                Toast.makeText(MainActivity.this, "???????????? ?????? ???????????????...!", Toast.LENGTH_SHORT).show();
            }
        });

/*        seheri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   startActivity(new Intent(MainActivity.this, SeheriRecyclerActivity.class));
                Toast.makeText(MainActivity.this, "????????????????????? ????????? ??????????????? \n ???????????????????????? ??????????????? ?????????????????? ??? ????????????????????? ????????????????????? ??????????????? ?????????...!", Toast.LENGTH_LONG).show();
            }
        });*/

        prayEdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NamazEdu.class));
                Toast.makeText(MainActivity.this, "??????????????? ??????????????????...!", Toast.LENGTH_SHORT).show();
            }
        });

        jakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog_jakat();
            }
        });

        tasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TashbiCalculator.class));
                Toast.makeText(MainActivity.this, "??????????????? ????????????...!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void showDialog_jakat() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.update_bottomsheet_layout);


        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }

        switch (item.getItemId()) {
/*           case R.id.nav_donation:
               Toast.makeText(this, "????????????????????? ????????????!", Toast.LENGTH_SHORT).show();
              break;*/
            case R.id.nav_notification_notice:
                // startActivity(new Intent(MainActivity.this, AdminNotification.class));
                Toast.makeText(this, "?????????????????????????????????!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_req_dev:
                //  startActivity(new Intent(MainActivity.this, RequestDeveloperActivity.class));
                Toast.makeText(this, "??????????????? ??????????????? ???????????????!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_dev:
                final Dialog dialog = new Dialog(this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.developer_bottomsheet_layout);

                dialog.show();
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
                dialog.getWindow().setGravity(Gravity.BOTTOM);
                Toast.makeText(this, "???????????????????????? ???????????????!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_policy:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://theholyquranislamicapp.trodev.com/")));
                Toast.makeText(this, "??????????????????????????? ???????????????!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_share:
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Al Quran -Islamic App");
                    String shareMessage = "\nThe Holy Quran -Islamic App ????????????????????? ????????????????????? ????????????\n\n";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                    Toast.makeText(this, "??????????????? ????????????!", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    //e.toString();
                }

                break;
            case R.id.nav_rate:
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
                    Toast.makeText(this, "??????????????? ?????????!", Toast.LENGTH_SHORT).show();
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
                }
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}