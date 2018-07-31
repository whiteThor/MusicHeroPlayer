package musicmachine.sanples.android.ruben.com.musicheroplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class PlayerService extends Service {

    private static final String TAG = PlayerService.class.getSimpleName();

    private MediaPlayer mMediaPlayer;

    @Override
    public void onCreate() {
        Log.d(TAG,"On Create Service");
        super.onCreate();
     //   mMediaPlayer = MediaPlayer.create()

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG,"On StartCommand Service");
        return START_NOT_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG,"On Bind Service");
        return null;
    }
}
