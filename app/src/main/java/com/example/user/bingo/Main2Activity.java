package com.example.user.bingo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    int check,check2,check3,check4,check5,check6,check7,check8,check9;
    ArrayList list = null;
    HashMap map ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        map = new HashMap();

    }
    private void setColorRed (Button button){
        button.setTextColor(0x99FF0000);
    }
    private void setColorBlack (Button button){
        button.setTextColor(0x99000000);
    }
    public void onClick (View v){
        Button button = (Button)findViewById(R.id.button3);
        if(check == 0){
            setColorRed(button);
            map.put("3",button.getText().toString());
            check=1;
        }else {
            setColorBlack(button);
            map.remove("3");
            check=0;
        }

    }
    public void onCLick2 (View v){
        Button button = (Button)findViewById(R.id.button2);

        if(check2 == 0){
            setColorRed(button);
            map.put("2",button.getText().toString());
            check2=1;
        }else {
            map.remove("2");
            setColorBlack(button);
            check2=0;
        }
    }
    public void onCLick3 (View v){
        Button button = (Button)findViewById(R.id.button1);
        if(check3 == 0){
            map.put("1",button.getText().toString());
            setColorRed(button);
            check3=1;
        }else {
            map.remove("1");
            setColorBlack(button);
            check3=0;
        }
    }
    public void onCLick4 (View v){
        Button button = (Button)findViewById(R.id.button4);
        if(check4 == 0){
            map.put("4",button.getText().toString());
            setColorRed(button);
            check4=1;
        }else {
            map.remove("4");
            setColorBlack(button);
            check4=0;
        }
    }
    public void onCLick5 (View v){
        Button button = (Button)findViewById(R.id.button5);
        if(check5 == 0){
            map.put("5",button.getText().toString());
            setColorRed(button);
            check5=1;
        }else {
            map.remove("5");
            setColorBlack(button);
            check5=0;
        }
    }
    public void onCLick6 (View v){
        Button button = (Button)findViewById(R.id.button6);
        if(check6 == 0){
            map.put("6",button.getText().toString());
            setColorRed(button);
            check6=1;
        }else {
            map.remove("6");
            setColorBlack(button);
            check6=0;
        }
    }
    public void onCLick7 (View v){
        Button button = (Button)findViewById(R.id.button7);
        if(check7 == 0){
            map.put("7",button.getText().toString());
            setColorRed(button);
            check7=1;
        }else {
            map.remove("7");
            setColorBlack(button);
            check7=0;
        }
    }
    public void onCLick8 (View v){
        Button button = (Button)findViewById(R.id.button8);
        if(check8 == 0){
            map.put("8",button.getText().toString());
            setColorRed(button);
            check8=1;
        }else {
            setColorBlack(button);
            map.remove("8");
            check8=0;
        }
    }
    public void onCLick9 (View v){
        Button button = (Button)findViewById(R.id.button9);
        if(check9 == 0){
            map.put("9",button.getText().toString());
            setColorRed(button);
            check9=1;
        }else {
            setColorBlack(button);
            map.remove("9");
            check9=0;
        }
    }
    public void onStart (View v){
        list = new ArrayList();
        //產生亂數
        Random random = new Random();
        //此陣列內容不會重複
        HashSet newMap = new HashSet();
        //若陣列size小於9就繼續迴圈
        while (newMap.size()<9){
            int ran2 = random.nextInt(30)+1;
            newMap.add(ran2);
        }
        Log.e("newMAP", String.valueOf(newMap));
        //取值
        Iterator it=newMap.iterator();
        int i ;
        while (it.hasNext()){
            i= (int) it.next();
            list.add(i);
        }
        Log.e("list", String.valueOf(list.get(0)));

        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);
        button1.setText(String.valueOf(list.get(0)));
        button2.setText(String.valueOf(list.get(1)));
        button3.setText(String.valueOf(list.get(2)));
        button4.setText(String.valueOf(list.get(3)));
        button5.setText(String.valueOf(list.get(4)));
        button6.setText(String.valueOf(list.get(5)));
        button7.setText(String.valueOf(list.get(6)));
        button8.setText(String.valueOf(list.get(7)));
        button9.setText(String.valueOf(list.get(8)));
        setColorBlack(button1);
        setColorBlack(button2);
        setColorBlack(button3);
        setColorBlack(button4);
        setColorBlack(button5);
        setColorBlack(button6);
        setColorBlack(button7);
        setColorBlack(button8);
        setColorBlack(button9);
        check=0;
        check2=0;
        check3=0;
        check4=0;
        check5=0;
        check6=0;
        check7=0;
        check8=0;
        check9=0;
        EditText edit = (EditText)findViewById(R.id.editText);
        edit.setText("");
        map.clear();
    }
    public void onView (View v){
        ArrayList list = new ArrayList();
        Log.e("map", String.valueOf(map));
        EditText edit = (EditText)findViewById(R.id.editText);
        for (Object key : map.keySet()) {
            list.add(map.get(key));
        }
        edit.setText(String.valueOf(list));

    }

}
