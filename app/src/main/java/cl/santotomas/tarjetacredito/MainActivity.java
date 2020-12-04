package cl.santotomas.tarjetacredito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cl.santotomas.tarjetacredito.utilidades.RegistroUsuariosActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd usuarios", null, 1);

    }

    public void onClick(View view) {
        Intent miIntent=null;
        switch (view.getId()){
            case R.id.btnregistrar:
                miIntent=new Intent(MainActivity.this, RegistroUsuariosActivity.class);
                break;
        }
        if (miIntent!=null);
        startActivity(miIntent);
    }
}