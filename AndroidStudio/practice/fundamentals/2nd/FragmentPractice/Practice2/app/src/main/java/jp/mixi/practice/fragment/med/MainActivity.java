
package jp.mixi.practice.fragment.med;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FragmentManager も、android.support.v4.app.FragmentManager を利用する
        FragmentManager manager = getSupportFragmentManager();
        // レイアウトから Fragment を見つけ出してインスタンスを得る
        Fragment fragment = manager.findFragmentById(R.id.MyFragment);
    }
}

