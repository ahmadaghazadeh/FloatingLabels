package aghazadeh.ahmad.floatinglabels;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnFocusChangeListener{

    TextInputLayout mUsernameLayout;
    EditText mUsername;
    EditText mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUsernameLayout = (TextInputLayout) findViewById(R.id.login_layout);
        mUsername = (EditText) findViewById(R.id.edit_text_email);
        mPassword = (EditText) findViewById(R.id.edit_text_password);
        mUsername.setOnFocusChangeListener(this);
        mPassword.setOnFocusChangeListener(this);
    }
    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (v != mUsername && mUsername.getText().toString().isEmpty()) {
            mUsernameLayout.setErrorEnabled(true);
            mUsernameLayout.setError(getResources().getString(R.string.login_error));
        } else {
            mUsernameLayout.setErrorEnabled(false);
        }
    }
}
