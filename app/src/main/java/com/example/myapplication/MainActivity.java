package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
        import android.app.AlertDialog;
        import android.content.DialogInterface;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;
    public class MainActivity extends AppCompatActivity  {
        Button alert;
        AlertDialog.Builder builder;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            alert=(Button) findViewById(R.id.alertbtn);
            builder=new AlertDialog.Builder(this);
            alert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    builder.setMessage("Do you want to close this application")
                            .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which) {
                                    finish();
                                    Toast.makeText(MainActivity.this, "You have selected yes",
                                            Toast.LENGTH_SHORT).show();
                                }
                            })
                            .setNegativeButton("no", new DialogInterface.OnClickListener() {@Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                dialogInterface.cancel();
                                Toast.makeText(MainActivity.this, "you have selected no",
                                        Toast.LENGTH_SHORT).show();
                            }
                            });
                    AlertDialog alertDialog= builder.create();
                    alertDialog.setTitle("Alert Dialog Demo");
                    alertDialog.show();
                }
            });
        }
    }


