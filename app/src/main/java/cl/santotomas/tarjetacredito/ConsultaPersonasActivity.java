package cl.santotomas.tarjetacredito;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import cl.santotomas.tarjetacredito.utilidades.utilidades;

public class ConsultaPersonasActivity extends AppCompatActivity {

    EditText campoId,campoNombre,campoApellido,campoNumerodeTarjeta,campoMesTarjeta,campoAnhoTarjeta,campoCodigoTarjeta,campoDireccion,campoCiudad,campoEstado,CampoCodigoPostal;

    ConexionSQLiteHelper conn;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consultar_personas);

        conn=new ConexionSQLiteHelper(getApplicationContext(), "bd_personas", null, 1)

        campoId=(EditText) findViewById(R.id.documentoId);
        campoNombre= (EditText) findViewById(R.id.campoNombre);
        campoApellido= (EditText) findViewById(R.id.campoApellido);
        campoNumerodeTarjeta= (EditText) findViewById(R.id.campoNumerodeTarjeta);
        campoMesTarjeta= (EditText) findViewById(R.id.campoMesdeTarjeta);
        campoAnhoTarjeta= (EditText) findViewById(R.id.campoAnhoTarjeta);
        campoCodigoTarjeta= (EditText) findViewById(R.id.campoCodigoTarjeta);
        campoDireccion= (EditText) findViewById(R.id.campoDireccion);
        campoCiudad= (EditText) findViewById(R.id.campoCiudad);
        campoEstado= (EditText) findViewById(R.id.campoEstado);
        campoCodigoPostal = (EditText) findViewById(R.id.campoCodigoPostal);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnregistrar:
                registar();
                break;
            case R.id.btn_buscar:
                buscar();
                break;
            case R.id.btn_guardar:
                guardar();
                break;

        }
    }

    private void guardar() {
    }

    private void buscar() {
        SQLiteDatabase db=conn.getReadableDatabase();
        String[] parametros={campoId.getText().toString(),};
        String[] campo={utilidades.CAMPO_NOMBRE,utilidades.CAMPO_NUMEROTARJETA,utilidades.CAMPO_DIRECCION};

        try {
            Cursor cursor= db.query(utilidades.TABLA_PERSONA+"=?"parametros,null,null,null);
            cursor.moveToFirst();
            campoNombre.setText(cursor.getString(0));
            campoNumerodeTarjeta.setText(cursor.getString(1));
            campoDireccion.setText(cursor.getString(2));
            cursor.close();

        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"El documento no existe",Toast.LENGTH_LONG).show;
        }

        Cursor cursor= db.query(utilidades.TABLA_PERSONA+"=?"parametros,null,null,null);
        cursor.moveToFirst();
        campoNombre.setText(cursor.getString(0));
        campoNumerodeTarjeta.setText(cursor.getString(1));
        campoDireccion.setText(cursor.getString(2));
        cursor.close();
    }

    private void registar() {
    }
}
