package com.example.anuraag.login;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText, editText2;
    Button button;
    EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.txt1);
        editText2 = findViewById(R.id.txt2);
        editText3 = findViewById(R.id.edt3);

        Toast.makeText(this, this + "", Toast.LENGTH_LONG).show();
    }

    public void authenticate(View view) {
        String i1 = editText.getText().toString(), i2 = editText2.getText().toString(), i3;

        //if(editText.getText().toString() == editText2.getText().toString())

        // if (i1.equals(i2)) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i3 = editText3.getText().toString();
        Toast.makeText(this, i3, Toast.LENGTH_SHORT).show();

            if(i3.startsWith("http://")) {
                i.setData(Uri.parse(i3));
            }else if(i3.startsWith("www")){
                i.setData(Uri.parse("http://"+i3));
            }else {
                i.setData(Uri.parse("http://www."+i3));
            }
            startActivity(i);

    /*
    }else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    */
    }
}
