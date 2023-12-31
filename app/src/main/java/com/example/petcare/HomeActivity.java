package com.example.petcare;
import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener;

public class HomeActivity extends AppCompatActivity implements OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        CardView petsCardView1 = findViewById(R.id.petsCardView1);
        CardView petsCardView2 = findViewById(R.id.petsCardView2);
        CardView exoticPetsCardView = findViewById(R.id.exoticPetsCardView);
        CardView careCardView1 = findViewById(R.id.careCardView1);
        CardView careCardView2 = findViewById(R.id.careCardView2);
        CardView careCardView4 = findViewById(R.id.careCardView4);
        CardView newCardView2 = findViewById(R.id.newCardView2);
        CardView newCardView3 = findViewById(R.id.newCardView3);
        CardView newCardView4 = findViewById(R.id.newCardView4);
        ImageView imageView = findViewById(R.id.image_view_1);

        drawerLayout = findViewById(R.id.drawer_layout_1);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        petsCardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PetsActivity.class);
                startActivity(intent);
            }
        });

        petsCardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MyPetsActivity.class);
                startActivity(intent);
            }
        });

        exoticPetsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ExoticPetsActivity.class);
                startActivity(intent);
            }
        });

        careCardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CareActivity.class);
                startActivity(intent);
            }
        });

        careCardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Care1Activity.class);
                startActivity(intent);
            }
        });

        careCardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Care2Activity.class);
                startActivity(intent);
            }
        });

        newCardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, NewActivity2.class);
                startActivity(intent);
            }
        });

        newCardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, NewActivity3.class);
                startActivity(intent);
            }
        });

        newCardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, NewActivity4.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        int id = menuItem.getItemId();

        if (id == R.id.home1) {
            drawerLayout.closeDrawer(Gravity.LEFT);
        } else if (id == R.id.home2) {
            Intent intent = new Intent(this, Home2Activity.class);
            startActivity(intent);
        } else if (id == R.id.home3) {
            Intent intent = new Intent(this, Home3Activity.class);
            startActivity(intent);
        } else if (id == R.id.home4) {
            Intent intent = new Intent(this, Home4Activity.class);
            startActivity(intent);
        } else if (id == R.id.home5) {
            Intent intent = new Intent(this, Home5Activity.class);
            startActivity(intent);
        } else if (id == R.id.home7) {
            Intent intent = new Intent(this, Home7Activity.class);
            startActivity(intent);
        }

        return true;
    }

}




