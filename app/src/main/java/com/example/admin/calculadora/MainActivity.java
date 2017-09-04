package com.example.admin.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    private TextView resultado,pantalla;
    private float result, cont=0, cont1=0, cont2=1;
    private int states=0, operador=0;
    private  String num1="",num2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = (TextView) findViewById(R.id.pantalla);
        resultado = (TextView) findViewById(R.id.resultado);

    }


    public void captura1(View view)
    {
        if(states==0){

        pantalla.setText(pantalla.getText() + "1");
        num1+="1";
        }
        if(states==1){
            pantalla.setText(pantalla.getText() + "1");
        num2+="1";
        }
        if(states==2){
            reiniciar();
        }

    }

    public void captura2(View view)
    {
        if(states==0){

            pantalla.setText(pantalla.getText() + "2");
            num1+="2";
        }
        if(states==1){
            pantalla.setText(pantalla.getText() + "2");
            num2+="2";
        }
        if(states==2){
            reiniciar();
        }

    }
    public void captura3(View view)
    {
        if(states==0){

            pantalla.setText(pantalla.getText() + "3");
            num1+="3";
        }
        if(states==1){
            pantalla.setText(pantalla.getText() + "3");
            num2+="3";
        }
        if(states==2){
           reiniciar();
        }

    }
    public void captura4(View view)
    {
        if(states==0){

            pantalla.setText(pantalla.getText() + "4");
            num1+="4";
        }
        if(states==1){
            pantalla.setText(pantalla.getText() + "4");
            num2+="4";
        }
        if(states==2){
           reiniciar();
        }    }
    public void captura5(View view)
    {
        if(states==0){

            pantalla.setText(pantalla.getText() + "5");
            num1+="5";
        }
        if(states==1){
            pantalla.setText(pantalla.getText() + "5");
            num2+="5";
        }
        if(states==2){
            reiniciar();
        }    }

    public void captura6(View view)
    {
        if(states==0){

            pantalla.setText(pantalla.getText() + "6");
            num1+="6";
        }
        if(states==1){
            pantalla.setText(pantalla.getText() + "6");
            num2+="6";
        }
        if(states==2){
            reiniciar();
        }    }

    public void captura7(View view)
    {
        if(states==0){

            pantalla.setText(pantalla.getText() + "7");
            num1+="7";
        }
        if(states==1){
            pantalla.setText(pantalla.getText() + "7");
            num2+="7";
        }
        if(states==2){
           reiniciar();
        }    }
    public void captura8(View view)
    {
        if(states==0){

            pantalla.setText(pantalla.getText() + "8");
            num1+="8";
        }
        if(states==1){
            pantalla.setText(pantalla.getText() + "8");
            num2+="8";
        }
        if(states==2){
            reiniciar();
        }    }
    public void captura9(View view)
    {
        if(states==0){

            pantalla.setText(pantalla.getText() + "9");
            num1+="9";
        }
        if(states==1){
            pantalla.setText(pantalla.getText() + "9");
            num2+="9";
        }
        if(states==2){
          reiniciar();
        }    }
    public void captura0(View view)
    {
        if(states==0){

            pantalla.setText(pantalla.getText() + "0");
            num1+="0";
        }
        if(states==1){
            pantalla.setText(pantalla.getText() + "0");
            num2+="0";
        }
        if(states==2){
            reiniciar();
        }    }
    public void capturapunto(View view)
    {
        if(states==0 && cont==0){
            if(num1.isEmpty()){
                pantalla.setText(pantalla.getText() + "0.");
                num1+="0.";
            }
            else{
                pantalla.setText(pantalla.getText() + ".");
                num1+=".";}

            cont=1;
        }
        if(states==1 && cont==1){
            if(num1.isEmpty()){
                pantalla.setText(pantalla.getText() + "0.");
                num2+="0.";
            }
            else{
                pantalla.setText(pantalla.getText() + ".");
                num2+=".";}

            cont=0;
        }


          }

    public void capturasuma(View view)
    {

        if(states==0){
            if(!num1.isEmpty()){
               pantalla.setText(pantalla.getText() + "+");
                operador=1;
               states=1;
            }
        }
        if(states==1){
            if(!num2.isEmpty()){
                calcular(view);
                num1=resultado.getText().toString();
                pantalla.setText(resultado.getText() + "+");
                num2="";
                cont=1;
                operador=1;
                states=1;
            }
        }
        if(states==2){
           reiniciar();
        }



    }
    public void capturaresta(View view)
    {


        if(states==1){
            if(!num2.isEmpty() && num2!="-"){
                calcular(view);
                num1=resultado.getText().toString();
                pantalla.setText(resultado.getText() + "-");
                num2="";
                cont1=1;
                cont=1;
                operador=2;
                states=1;
            }
            if(cont2==1 && num2.isEmpty()){
                pantalla.setText(pantalla.getText()+"-");
                num2="-";
                cont2=0;
            }
        }

        if(states==0){
            if(!num1.isEmpty() && num1!="-"){
                pantalla.setText(pantalla.getText() + "-");
                operador=2;
                states=1;
            }
            if(cont1==0 && num1.isEmpty()){
                pantalla.setText("-");
                num1="-";
                cont1=1;
            }
        }

        if(states==2){
            reiniciar();
        }

    }

    public void capturamultiplica(View view)
    {

        if(states==0){
            if(!num1.isEmpty()){
                pantalla.setText(pantalla.getText() + "*");
                operador=3;
                states=1;
            }
        }
        if(states==1){
            if(!num2.isEmpty()){
                calcular(view);
                num1=resultado.getText().toString();
                pantalla.setText(resultado.getText() + "*");
                num2="";
                cont=1;
                operador=3;
                states=1;
            }
        }
        if(states==2){
            reiniciar();
        }

    }
    public void capturadividir(View view)
    {

        if(states==0){
            if(!num1.isEmpty()){
                pantalla.setText(pantalla.getText() + "/");
                operador=4;
                states=1;
            }
        }
        if(states==1){
            if(!num2.isEmpty() && num2!="0"){
                calcular(view);
                num1=resultado.getText().toString();
                pantalla.setText(resultado.getText() + "/");
                num2="";
                operador=4;
                states=1;
                cont=1;

            }
        }
        if(states==2){
            reiniciar();
        }
    }

    public void calcular(View view){
        float numb1, numb2;


        if(operador!=0 && num2!=""){
            numb1=Float.parseFloat(num1);
            numb2=Float.parseFloat(num2);
                if(operador==1){
                    result=numb1+numb2;
                    resultado.setText(Float.toString(result));

                }

                if(operador==2){
                    result=numb1-numb2;
                    resultado.setText(Float.toString(result));

                }
                if(operador==3){
                    result=numb1*numb2;
                    resultado.setText(Float.toString(result));

                }

                if(operador==4){
                    if(numb2!=0){
                        result=numb1/numb2;
                        resultado.setText(Float.toString(result));

                    }
                    else{
                        resultado.setText("Math Error");
                    }

                  }
        }
        else{
            resultado.setText(num1);
        }
        states=2;

    }

    public void reiniciar(){
        num1="";
        num2="";
        cont=0;
        cont1=0;
        cont2=1;
        states=0;
        operador=0;
        resultado.setText("");
        pantalla.setText("");

    }
}
