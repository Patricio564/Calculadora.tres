package xml.calculadora_tres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private Button button_calcular;
private TextView text_respuesta;
private TextView textView_x;

private EditText editText_n1;
private EditText editText_n2;
private EditText edittext_n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_calcular=findViewById(R.id.button_calcular);
        button_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(calcular(Double.parseDouble(editText_n1.getText().toString()),Double.parseDouble(editText_n2.getText().toString()),Double.parseDouble(edittext_n3.getText().toString()))+" ");
            }
        });
        text_respuesta=findViewById(R.id.text_respuesta);
    }
    public float calcular(Double a,Double b,Double c){
        float respuesta =0;

        if (a!=0){
            respuesta = (float)((a*b)/c);
        }
        return respuesta;
    }
}
