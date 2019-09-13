package com.example.lab4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.File;

public class MainActivity extends AppCompatActivity {
private boolean ExistBase(){
    String fname="Base_Lab.txt";
    boolean rc=false;
    File file = new File(super.getFilesDir(),fname);
    if(rc=file.exists()){
        Log.d("Log_02","Файл "+fname+" существует");
    }
    else {
        Log.d("Log_02", "Файл " + fname + "  не найден");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Создается файл " + fname).setPositiveButton("Да", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.d("Log_02", "Создание файла " + "Base_Lab.txt");
            }
        });
        AlertDialog ad=builder.create();
        ad.show();

    }

    return rc;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
ExistBase();
        }
    }

