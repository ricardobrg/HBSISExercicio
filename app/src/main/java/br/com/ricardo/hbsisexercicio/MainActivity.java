package br.com.ricardo.hbsisexercicio;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    public static final int LOGIN_REQUEST_CODE = 111;
    SharedPreferences prefs;
    private int uid = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefs = getSharedPreferences("HBSISEx", MODE_PRIVATE);
        uid = prefs.getInt("uid", 0);
        if(uid == 0){
            Intent loginIntent = new Intent(this, LoginActivity.class);
            startActivityForResult(loginIntent, LOGIN_REQUEST_CODE);
        }else{
            setLayout();
        }
    }

    private void setLayout() {
        setContentView(R.layout.activity_main);
        TextView user = findViewById(R.id.usuario);
        user.setText("User ID: "+String.valueOf(uid));
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == LOGIN_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                uid = data.getIntExtra("uid", 0);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putInt("uid",uid);
                editor.apply();
                setLayout();
            }else{
                Toast.makeText(this,"Falha no Login", Toast.LENGTH_LONG).show();
            }
        }
    }
}
