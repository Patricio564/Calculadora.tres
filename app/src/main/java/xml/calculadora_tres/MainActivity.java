package xml.calculadora_tres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private Button button_enviar;
private TextView text_respuesta;

private EditText editText_n1;
private EditText editText_n2;
private EditText edittext_n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_enviar=findViewById(R.id.button_enviar);
        button_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(enviar(Integer.parseInt(editText_n1.getText().toString()),Integer.parseInt(editText_n2.getText().toString()),Integer.parseInt(edittext_n3.getText().toString()))+" ");
            }
        });
        text_respuesta=findViewById(R.id.text_respuesta);
    }
    public double enviar (int a,int b,int c){
        int respuesta =0;
        if (a!=0){
            respuesta =(c*b)/a;
        }
        return respuesta;
    }
}