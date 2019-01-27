package voice_to_text.sandy148101.com.services;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

import java.security.Provider;

public  class MyServices extends Service{

    MediaPlayer mediaPlayer;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this,"Service start",Toast.LENGTH_SHORT).show();

        mediaPlayer= MediaPlayer.create(this,R.raw.song);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"Service Start !",Toast.LENGTH_SHORT).show();
        mediaPlayer =MediaPlayer.create(this,R.raw.song);
        mediaPlayer.start();

        return  super.onStartCommand(intent,flags,startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"Service destroyed",Toast.LENGTH_SHORT).show();
        mediaPlayer.release();
    }
}

