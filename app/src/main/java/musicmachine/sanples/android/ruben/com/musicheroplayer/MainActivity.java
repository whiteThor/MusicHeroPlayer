package musicmachine.sanples.android.ruben.com.musicheroplayer;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    public static final String FRAGMENT_PRINCIPAL = "fragment_principal";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentPrincipal saveFragmentPrincipal = (FragmentPrincipal) getSupportFragmentManager().findFragmentByTag(FRAGMENT_PRINCIPAL);
        if(saveFragmentPrincipal==null){
            FragmentPrincipal fragmentPrincipal = new FragmentPrincipal();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.placeHolder, fragmentPrincipal, FRAGMENT_PRINCIPAL);
            fragmentTransaction.commit();
        }

    }



}
