package muhanxi.zhibodemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static android.webkit.WebSettings.PluginState.ON;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SWCameraStreamingActivity.class);

                intent.putExtra("stream_json_str","rtmp://pili-publish.2dyt.com/1503d/streamkey?e=1502093100&token=tYBGEzG7NE_D23EScw43ZTxynVkyt1IpHig5WHRY:BfxD_8YaZvKCncgiX9FKSczLZsw=");

                startActivity(intent);


            }
        });


        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,PLVideoViewActivity.class);

                intent.putExtra("videoPath","rtmp://pili-live-rtmp.2dyt.com/1503d/streamkey");

                startActivity(intent);

            }
        });


    }
}
