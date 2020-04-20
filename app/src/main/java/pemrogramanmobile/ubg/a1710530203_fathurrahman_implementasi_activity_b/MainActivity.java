package pemrogramanmobile.ubg.a1710530203_fathurrahman_implementasi_activity_b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate() \n Pertama kali aplikasi dijalankan", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart() \n Menandakan activiy yang ditampilkan ke pengguna", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause() \n Aplikasi yang kita jalankan kembali ke halaman sebelumnya\",", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume() \n Menandakan aplikasi mulai berinteraksi dengan pengguna", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop() \n Menandakan aplikasi berjalan dilatar belakang dalam waktu yang cukup lama", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart() \n Menandakan Activity menampilkan UI setelah status onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy() \n Menandakan Aplikasi benar benar berhenti", Toast.LENGTH_SHORT).show();
    }

    public void bukaActivity(View v){
        Intent msg = new Intent(Intent.ACTION_VIEW);
        msg.setData(Uri.parse("http://covid19.k15.epizy.com"));
        startActivity(msg);
    }

    public void kelarActivity(View v){
        finish();
    }
}
