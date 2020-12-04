package cl.santotomas.tarjetacredito.utilidades;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import cl.santotomas.tarjetacredito.ConexionSQLiteHelper;
import cl.santotomas.tarjetacredito.R;

public class RegistroUsuariosActivity extends AppCompatActivity {

    EditText campoId,campoNombre,campoApellido,campoNumerodeTarjeta,campoMesTarjeta,campoAnhoTarjeta,campoCodigoTarjeta,campoDireccion,campoCiudad,campoEstado,campoCodigoPostal;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_personas);

        campoId=(EditText) findViewById(R.id.campoId);
        campoNombre= (EditText) findViewById(R.id.campoNombre);
        campoApellido= (EditText) findViewById(R.id.campoApellido);
        campoNumerodeTarjeta= (EditText) findViewById(R.id.campoNumerodeTarjeta);
        campoMesTarjeta= (EditText) findViewById(R.id.campoMesdeTarjeta);
        campoAnhoTarjeta= (EditText) findViewById(R.id.campoAnhoTarjeta);
        campoCodigoTarjeta= (EditText) findViewById(R.id.campoCodigoTarjeta);
        campoDireccion= (EditText) findViewById(R.id.campoDireccion);
        campoCiudad= (EditText) findViewById(R.id.campoCiudad);
        campoEstado= (EditText) findViewById(R.id.campoEstado);
        campoCodigoPostal= (EditText) findViewById(R.id.campoCodigoPostal);


    }

    public void onClick (View view) {
      //registrarPersonas():

        registrarPersonasSql();

    }

    private void registrarPersonasSql() {

        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd usuarios", null, 1);

        SQLiteDatabase db=conn.getWritableDatabase();

        String insert= "INSERT INTO"+utilidades.TABLA_PERSONA
                +"( "
                +utilidades.CAMPO_ID+","+utilidades.CAMPO_NOMBRE","+utilidades.CAMPO_APELLIDO","+utilidades.CAMPO_NUMEROTARJETA","+utilidades.CAMPO_MESTARJETA","+utilidades.CAMPO_ANOTARJETA","+utilidades.CAMPO_CODIGOTARJETA","+utilidades.CAMPO_DIRECCION","+utilidades.CAMPO_CIUDAD","+utilidades.CAMPO_ESTADO","+utilidades.CAMPO_CODIGOPOSTAL+") VALUES (+campoId.getText().toString()+", '"+campoNombre.getText().toString()+"', '"+campoApellido.getText().toString()+"', '"+campoNumerodeTarjeta.getText().toString()+"','"+campoMesTarjeta.getText().toString()+"', '"+campoAnhoTarjeta.getText().toString()+"', '"+campoCodigoTarjeta.getText().toString()+"', '"+campoDireccion.getText().toString()+"', '"+campoEstado.getText().toString()+"', '"+campoCodigoPostal.getText().toString());+"');

        db.execSQL();

        db.close();
    }

    private void registrarPersonas() {
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd usuarios", null, 1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(utilidades.CAMPO_ID,campoId.getText().toString());
        values.put(utilidades.CAMPO_NOMBRE,campoNombre.getText().toString());
        values.put(utilidades.CAMPO_APELLIDO,campoApellido.getText().toString());
        values.put(utilidades.CAMPO_NUMEROTARJETA,campoNumerodeTarjeta.getText().toString());
        values.put(utilidades.CAMPO_MESTARJETA,campoMesTarjeta.getText().toString());
        values.put(utilidades.CAMPO_ANOTARJETA,campoAnhoTarjeta.getText().toString());
        values.put(utilidades.CAMPO_CODIGOTARJETA,campoCodigoTarjeta.getText().toString());
        values.put(utilidades.CAMPO_DIRECCION,campoDireccion.getText().toString());
        values.put(utilidades.CAMPO_CIUDAD,campoCiudad.getText().toString());
        values.put(utilidades.CAMPO_ESTADO,campoEstado.getText().toString());
        values.put(utilidades.CAMPO_CODIGOPOSTAL,campoCodigoPostal.getText().toString());

        Long idResultante=db.insert(utilidades.TABLA_PERSONA,utilidades.CAMPO_NOMBRE,values);

        Toast.makeText(getApplicationContext(),"Id Persona: "+idResultante,Toast.LENGTH_SHORT.show();
        db.close();

    }

}
