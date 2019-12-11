package id.ac.polinema.beliphone.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import id.ac.polinema.beliphone.R;
import id.ac.polinema.beliphone.fragments.AkunFragment;
import id.ac.polinema.beliphone.fragments.BerandaFragment;
import id.ac.polinema.beliphone.fragments.ListFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new BerandaFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.Beranda:
                fragment = new BerandaFragment();
                break;
            case R.id.List:
                fragment = new ListFragment();
                break;
            case R.id.Akun:
                fragment = new AkunFragment();
                break;
        }
        return loadFragment(fragment);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}