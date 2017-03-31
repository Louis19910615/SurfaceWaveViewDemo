package louis.surfacewaveviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import louis.surfacewaveview.ui.SurfaceWaveView;

public class MainActivity extends AppCompatActivity {

    private SurfaceWaveView surfaceWaveView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
