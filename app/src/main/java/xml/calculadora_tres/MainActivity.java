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

    private EditText num1;
    private EditText num2;
    private EditText porcentaje1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        porcentaje1 = findViewById(R.id.porcentaje1);
        button_calcular=findViewById(R.id.button_calcular);
        text_respuesta=findViewById(R.id.text_respuesta);

        button_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(calcular(Double.parseDouble(num1.getText().toString()),Double.parseDouble(num2.getText().toString()),Double.parseDouble(porcentaje1.getText().toString()))+" ");
            }
        });


    }




    public double calcular(Double numero_1 ,Double numero_2 ,Double porcentaje_1){



        return ((numero_2 * porcentaje_1)/numero_1);
    }
}
