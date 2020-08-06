package com.unisales.patologia.Activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import com.unisales.patologia.Fragments.EstruturaCorrosaoFragment;
import com.unisales.patologia.Fragments.EstruturaFragment;
import com.unisales.patologia.Fragments.FirstFragment;
import com.unisales.patologia.Fragments.HomeFragment;
import com.unisales.patologia.Fragments.ParedeHorizontalFragment;
import com.unisales.patologia.Fragments.ParedeInclinadoFragment;
import com.unisales.patologia.Fragments.ParedeVerticalFragment;
import com.unisales.patologia.Fragments.PisoAbaulamentoFragment;
import com.unisales.patologia.Fragments.PisoFragment;
import com.unisales.patologia.Fragments.PisoGretamentoFragment;
import com.unisales.patologia.Fragments.PisoTrincaFragment;
import com.unisales.patologia.Fragments.SecondFragment;
import com.unisales.patologia.Fragments.SobreFragment;
import com.unisales.patologia.Fragments.TetoFragment;
import com.unisales.patologia.Fragments.TetoInfiltracaoFragment;
import com.unisales.patologia.Fragments.TetoTrincaFragment;
import com.unisales.patologia.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static Fragment currentFragment;
    public static Menu topMenu;
    public static FirstFragment firstFragment;
    public static SecondFragment secondFragment;
    public static HomeFragment homeFragment;
    public static ParedeHorizontalFragment paredeHorizontalFragment;
    public static ParedeVerticalFragment paredeVerticalFragment;
    public static ParedeInclinadoFragment paredeInclinadoFragment;
    public static TetoFragment tetoFragment;
    public static TetoTrincaFragment tetoTrincaFragment;
    public static TetoInfiltracaoFragment tetoInfiltracaoFragment;
    public static PisoFragment pisoFragment;
    public static PisoTrincaFragment pisoTrincaFragment;
    public static PisoAbaulamentoFragment pisoAbaulamentoFragment;
    public static PisoGretamentoFragment pisoGretamentoFragment;
    public static EstruturaFragment estruturaFragment;
    public static EstruturaCorrosaoFragment estruturaCorrosaoFragment;
    public static SobreFragment sobreFragment;
    public static Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        topMenu = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (currentFragment == homeFragment) {
            if (id == R.id.action_sobre) {
                topMenu.getItem(0).setVisible(false);
                NavHostFragment.findNavController(homeFragment)
                        .navigate(R.id.action_homeFragment_to_sobreFragment);
            }
        }
        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    public static void LigarDefesaCivil(Fragment frag){
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+"33884346"));
        if (ContextCompat.checkSelfPermission(frag.getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(frag.getActivity(), new String[]{Manifest.permission.CALL_PHONE}, 1);
        }
        else {
            frag.startActivity(callIntent);
        }
    }
}
