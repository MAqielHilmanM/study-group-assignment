package motion.modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mTvNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvNum = findViewById(R.id.tvNum);
    }

    public void onCountUp(View v){
        mCount++;
        mTvNum.setText(String.valueOf(mCount));
    }

    public void onShowUp(View v){
        Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT).show();
    }
}
