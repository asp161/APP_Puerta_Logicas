package com.example.sumarnumeros;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Clicknot(View View){
        Intent Boton=new Intent(this,MainActivity2.class);
        startActivity(Boton);
    }
    public void Clickand(View View){
        Intent Boton=new Intent(this,MainActivity3.class);
        startActivity(Boton);
    }
    public void Clickor(View View){
        Intent Boton=new Intent(this,MainActivity4.class);
        startActivity(Boton);
    }
    public void Clickxor(View View){
        Intent Boton=new Intent(this,MainActivity5.class);
        startActivity(Boton);
    }
    public void BackClick(View View){
        Intent Boton=new Intent(this,MainActivity.class);
        startActivity(Boton);
    }


}