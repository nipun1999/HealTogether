package in.genecorp.healtogether;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class homeActivity extends AppCompatActivity {

    TextView loginText;
    EditText userID,password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
         loginText =(TextView)(findViewById(R.id.loginTxt));
         Typeface face = Typeface.createFromAsset(getAssets(),"fonts/Nunito-Bold.ttf");
         loginText.setTypeface(face);
         userID = (EditText)(findViewById(R.id.userIDTxt));
         password = (EditText)(findViewById(R.id.passwordTxt));
         userID.setTypeface(face);
         password.setTypeface(face);
         loginBtn = (Button)(findViewById(R.id.loginBtn));

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profile = new Intent(homeActivity.this,profileActivity.class);
                startActivity(profile);
            }
        });
    }
}
