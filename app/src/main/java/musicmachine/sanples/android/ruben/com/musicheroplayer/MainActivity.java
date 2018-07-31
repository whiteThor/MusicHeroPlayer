package musicmachine.sanples.android.ruben.com.musicheroplayer;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
