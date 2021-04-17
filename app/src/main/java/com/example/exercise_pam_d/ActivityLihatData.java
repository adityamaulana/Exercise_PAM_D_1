package com.example.exercise_pam_d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama, tvnomor, tvbounty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);
        tvbounty = findViewById(R.id.tvBounty);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");
        switch (nama)
        {
            case "Luffy":
                tvnama.setText("Monkey D. Luffy");
                tvnomor.setText("0812346XXX");
                tvbounty.setText("1.500.000.000");
                break;

            case "Zorro":
                tvnama.setText("Roronoa Zorro");
                tvnomor.setText("0812346XXX");
                tvbounty.setText("320.000.000");
                break;

            case "Nami":
                tvnama.setText("Dorobou Neko Nami");
                tvnomor.setText("0812346XXX");
                tvbounty.setText("68.000.000");
                break;

            case "Sanji":
                tvnama.setText("Vinsmoke Sanji");
                tvnomor.setText("0812346XXX");
                tvbounty.setText("330.000.000");
                break;

            case "Usopp":
                tvnama.setText("God Sogeking");
                tvnomor.setText("0812346XXX");
                tvbounty.setText("200.000.000");
                break;

            case "Chopper":
                tvnama.setText("Tony Tony Chopper");
                tvnomor.setText("0812346XXX");
                tvbounty.setText("100");
                break;

            case "Robin":
                tvnama.setText("Nico Robin");
                tvnomor.setText("0812346XXX");
                tvbounty.setText("130.000.000");
                break;

            case "Franky":
                tvnama.setText("Saibogu Franky");
                tvnomor.setText("0812346XXX");
                tvbounty.setText("94.000.000");
                break;

            case "Brook":
                tvnama.setText("Soul King Brook");
                tvnomor.setText("0812346XXX");
                tvbounty.setText("83.000.000");
                break;

            case "Jinbei":
                tvnama.setText("Kaikyo no Jinbe");
                tvnomor.setText("0812346XXX");
                tvbounty.setText("438.000.000");
                break;
        }
    }
}