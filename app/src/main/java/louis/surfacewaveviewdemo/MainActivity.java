package louis.surfacewaveviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import louis.surfacewaveview.ui.SurfaceWaveView;
import louis.surfacewaveview.ui.managers.WaveTransitionManager;

public class MainActivity extends AppCompatActivity {

    private Button mCtrlWaveBtn0;
    private Button mCtrlWaveBtn1;
    private Button mCtrlWaveBtn2;
    private Button mCtrlWaveBtn3;
    private SurfaceWaveView mSurfaceWaveView;
    private WaveTransitionManager mWaveTransitionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSurfaceWaveView = (SurfaceWaveView) findViewById(R.id.surface_wave_view);

        mCtrlWaveBtn0 = (Button) findViewById(R.id.ctrl_wave_btn0);
        mCtrlWaveBtn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mWaveTransitionManager.powerOff();
            }
        });

        mCtrlWaveBtn1 = (Button) findViewById(R.id.ctrl_wave_btn1);
        mCtrlWaveBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mWaveTransitionManager.changeLevel(30);
            }
        });

        mCtrlWaveBtn2 = (Button) findViewById(R.id.ctrl_wave_btn2);
        mCtrlWaveBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mWaveTransitionManager.changeLevel(60);
            }
        });

        mCtrlWaveBtn3 = (Button) findViewById(R.id.ctrl_wave_btn3);
        mCtrlWaveBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mWaveTransitionManager.changeLevel(100);
            }
        });

        mWaveTransitionManager = new WaveTransitionManager(mSurfaceWaveView);
        mWaveTransitionManager.startThread();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy");
        mWaveTransitionManager.stopThread();
    }
}
