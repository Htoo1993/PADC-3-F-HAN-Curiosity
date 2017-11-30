package xyz.htooaungnaing.curiosity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_sign_up_with_email)
    Button btnSignUpWithEmail;

    @BindView(R.id.btn_sign_in_with_email)
    Button btnSignInWithEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this,this);

        btnSignUpWithEmail.setText(Html.fromHtml("<b>Sign Up</b> <br /> <small>With Email   </small>"));
        btnSignInWithEmail.setText(Html.fromHtml("<b>Sign In</b> <br /> <small>With Email                </small>"));
    }
}
