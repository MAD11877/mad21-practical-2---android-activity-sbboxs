package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String TAG = "Main activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG,"On Create!");
        User user = new User();
        user.setName("Tester");
        user.setFollowed(false);

        Button myButton = findViewById(R.id.followButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v(TAG, "Button Pressed");
                String buttonText = (String) myButton.getText();
                Log.v(TAG,buttonText);
                if(user.isFollowed()==false){
                    myButton.setText("UNFOLLOW");
                    user.setFollowed((true));
                    Log.v(TAG, "Change");
                }else if (buttonText == "UNFOLLOW"){
                    user.setFollowed((false));
                    myButton.setText("FOLLOW");
                }

            }

        });
    }
}