package musicmachine.sanples.android.ruben.com.musicheroplayer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;



public class FragmentPrincipal extends Fragment  {
    private TextView mtextCarpeta;
    private ImageButton mOpenDialogButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_principal,container, false);
        mtextCarpeta = view.findViewById(R.id.textCarpeta);
        mOpenDialogButton= view.findViewById(R.id.openDialogButton);
        mtextCarpeta.setText("Selecciones una Carpeta:");


        setListeners();

        return view;


    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==123 && resultCode == -1){ //)
            Uri selectedFile = data.getData();
            mtextCarpeta.setText(selectedFile.getScheme());
            }
    }

    private void setListeners(){
        mOpenDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent()
                .setType("audio/mpeg")
                .setAction(Intent.ACTION_GET_CONTENT);

                startActivityForResult(Intent.createChooser(intent, "Selecciona la Carpeta"),123);
            }
        });


    }
}
