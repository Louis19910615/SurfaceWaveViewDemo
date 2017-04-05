package louis.surfacewaveviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

import louis.surfacewaveview.ui.SurfaceWaveView;
import louis.surfacewaveview.ui.managers.WaveTransitionManager;

public class MainActivity extends AppCompatActivity {

    private SeekBar mCtrlWaveBar;
    private int mProgress = 30;
    private SurfaceWaveView mSurfaceWaveView;
    private WaveTransitionManager mWaveTransitionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSurfaceWaveView = (SurfaceWaveView) findViewById(R.id.surface_wave_view);
        mCtrlWaveBar = (SeekBar) findViewById(R.id.ctrl_wave_bar);
        mCtrlWaveBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mProgress = progress;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mWaveTransitionManager.changeLevel(mProgress);
            }
        });

        mWaveTransitionManager = new WaveTransitionManager(mSurfaceWaveView);
        mWaveTransitionManager.startThread();
        mWaveTransitionManager.changeLevel(mProgress);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy");
        mWaveTransitionManager.stopThread();
    }
}
