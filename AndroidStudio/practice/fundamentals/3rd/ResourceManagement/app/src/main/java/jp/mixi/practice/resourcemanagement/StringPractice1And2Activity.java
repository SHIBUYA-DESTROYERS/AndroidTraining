package jp.mixi.practice.resourcemanagement;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class StringPractice1And2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_practice1);
        String engineer = getString(R.string.engineer, "ほげ", "ふが", "にゃーん");
        TextView text = (TextView)findViewById(R.id.textView6);
        text.setText(engineer);
    }

}
