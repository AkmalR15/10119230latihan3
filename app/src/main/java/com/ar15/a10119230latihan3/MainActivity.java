package com.ar15.a10119230latihan3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.ar15.a10119230latihan3.DoneActivity.ID_EXTRA_MSG_EXIT;
// Tanggal Pengerjaan   : 25-April-2022
// Deskripsi Pengerjaan :- Mengerjakan Layout activity_main
//                       - Membuat Class MainActivity
//                       - Mengerjakan Layout activity_login_code
//                       - Membuat Class LoginCodeActivity
//                       - Mengerjakan Layout activity_biodata
//                       - Membuat Class BiodataActivity
//                       - Mengerjakan Layout activity_done
//                        26-April-2022
//                       - Membuat Class DoneActivity
//                       - Mengerjakan activity_warning_dialog
//                       - Memasang logika dari MainActivity.java ke class LoginCodeActivity.java
//                       - Memasang logika dari LoginCodeActivity.java ke class BiodataActivity.java
//                       - Memasang logika dari BiodataActivity.java ke class DoneActivity.java
//                       - Memasang logika dari class DoneActivity.java
// Nama                 : Akmal Rizqulloh
// NIM                  : 10119230
// Kelas                : IF-6
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
        }
    }
    @OnClick(R.id.btnWalkthroughStart)
    void mulai() {
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
}