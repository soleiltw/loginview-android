package tw.soleil.loginview.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import tw.soleil.loginview.R;

/**
 * Created by edward_chiang on 15/5/17.
 */
public class ViewPagerLoginActivity extends Activity {

    public static final int LOGINCODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login_view_pager);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        Button loginButton = (Button)findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginFinishIntent = new Intent();
                setResult(Activity.RESULT_OK, loginFinishIntent);
                finish();
            }
        });
    }
}
