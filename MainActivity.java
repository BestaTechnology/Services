package voice_to_text.sandy148101.com.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button playbtn, stopbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playbtn =(Button)findViewById(R.id.playbtn);
        stopbtn =(Button)findViewById(R.id.stopbtn);

           playbtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Toast.makeText(getApplicationContext(),"Play click",Toast.LENGTH_SHORT).show();
               startService(new Intent(MainActivity.this,MyServices.class));

               }
           });

           stopbtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   stopService(new Intent(MainActivity.this,MyServices.class));


               }
           });
    }
}
