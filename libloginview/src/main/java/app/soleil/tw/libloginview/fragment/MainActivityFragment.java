package app.soleil.tw.libloginview.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import app.soleil.tw.libloginview.LoginView;
import app.soleil.tw.libloginview.R;
import app.soleil.tw.libloginview.activity.ViewPagerLoginActivity;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.libloginview_fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button viewPagerButton = (Button)view.findViewById(R.id.view_pager_login_view_button);
        viewPagerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(LoginView.TAG, "Start intent with ViewPagerLoginActivity");

                Intent loginIntent = new Intent(getActivity(), ViewPagerLoginActivity.class);
                startActivityForResult(loginIntent, ViewPagerLoginActivity.LOGINCODE);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ViewPagerLoginActivity.LOGINCODE) {
            Log.i(LoginView.TAG, "Login from ViewPagerLoginActivity");
            Log.d(LoginView.TAG, "Result Code is: " + resultCode);

            if (resultCode == Activity.RESULT_OK) {
                Log.i(LoginView.TAG, "Login success.");
            }

        }
    }
}
