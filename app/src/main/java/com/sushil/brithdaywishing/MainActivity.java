package com.sushil.brithdaywishing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sushil.brithdaywishing.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    // View Binding 
    ActivityMainBinding binding;
    String input="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = binding.nameInput.getText().toString();
                if(!input.equals("")) {
                    Intent intent = new Intent(MainActivity.this, WishingScreen.class);
                    intent.putExtra("Name", input);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}