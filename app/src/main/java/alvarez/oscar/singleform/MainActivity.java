package alvarez.oscar.singleform;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import alvarez.oscar.singleform.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initListeners();
    }

    private void initListeners() {
        binding.buttonLogin.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(i);
        });
        binding.buttonRegister.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(i);
        });
    }
}
