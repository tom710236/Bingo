package com.example.user.bingo;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editName = (EditText)findViewById(R.id.editText2);
        mName = editName.getText().toString();
        //帳號若輸入正確 記住登入帳號
        SharedPreferences setting =
                getSharedPreferences("Login", MODE_PRIVATE);
        editName.setText(setting.getString("userName", ""));
    }
    public void onClick (View v){
        EditText editName = (EditText)findViewById(R.id.editText2);
        mName = editName.getText().toString();

        if(!mName.equals("") && mName!=null){
            setAlert(mName);
        }else {
            Toast.makeText(this,"請輸入使用者名稱",Toast.LENGTH_SHORT).show();
        }
    }
    private void setAlert(final String mName){
        final View item = LayoutInflater.from(this).inflate(R.layout.layout, null);
        new AlertDialog.Builder(this)
                .setTitle(mName+"您好，"+"歡迎使用賓果ＡＰＰ")
                .setView(item)
                .setNegativeButton("取消", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //記住帳號
                        SharedPreferences setting =
                                getSharedPreferences("Login", MODE_PRIVATE);
                        setting.edit()
                                .putString("userName", mName)
                                .commit();
                        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(intent);
                    }
                }).show();
    }

}
