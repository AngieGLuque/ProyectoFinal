package pnt.co.edu.unisabana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton user_Create = findViewById(R.id.createUserButton);
        ImageButton user_Login = findViewById(R.id.loginUserButon);
        user_Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(MainActivity.this,NewUserActivity.class);
                startActivity(open);
            }
        });
        user_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(open);
            }
        });
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://infinite-beyond-12720.herokuapp.com/")
            .build();
        final HerokuService service = retrofit.create(HerokuService.class);
    }
}
