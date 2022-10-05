package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Double numeroGuardado = Double.valueOf(0);
    String operacao = new String();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtViewResultado = (TextView) findViewById(R.id.TextViewResult);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button0 = (Button) findViewById(R.id.button0);
        Button buttonSomar = (Button) findViewById(R.id.buttonSomar);
        Button buttonDividir = (Button) findViewById(R.id.buttonDividir);
        Button buttonMultiplicar = (Button) findViewById(R.id.buttonMultiplicar);
        Button buttonSubtrair = (Button) findViewById(R.id.buttonSubtrair);
        Button buttonPonto = (Button) findViewById(R.id.buttonPonto);
        Button buttonResultado = (Button) findViewById(R.id.buttonResultado);
        Button buttonReturn = (Button) findViewById(R.id.buttonReturn);
        Button buttonCE = (Button) findViewById(R.id.buttonCE);



        // operations to be performed
        // when user tap on the button
        if (buttonCE!= null) {
            buttonCE.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    txtViewResultado.setText("");
                    numeroGuardado = Double.valueOf(0);
                    operacao = "";

                }
            }));
        }

        if (buttonReturn != null) {
            buttonReturn.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {
                    if(txtViewResultado.getText().toString().length() != 0) {
                        txtViewResultado.setText(txtViewResultado.getText().toString().substring(0, txtViewResultado.getText().toString().length() - 1));
                    }
                }
            }));
        }

        if (button1 != null) {
            button1.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    txtViewResultado.setText(txtViewResultado.getText()+"1");

                }
            }));
        }

        if (button2 != null) {
            button2.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    txtViewResultado.setText(txtViewResultado.getText()+"2");
                }
            }));
        }

        if (button3 != null) {
            button3.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    txtViewResultado.setText(txtViewResultado.getText()+"3");
                }
            }));
        }

        if (button4 != null) {
            button4.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    txtViewResultado.setText(txtViewResultado.getText()+"4");
                }
            }));
        }

        if (button5 != null) {
            button5.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    txtViewResultado.setText(txtViewResultado.getText()+"5");
                }
            }));
        }

        if (button6 != null) {
            button6.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    txtViewResultado.setText(txtViewResultado.getText()+"6");
                }
            }));
        }

        if (button7 != null) {
            button7.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    txtViewResultado.setText(txtViewResultado.getText()+"7");
                }
            }));
        }

        if (button8 != null) {
            button8.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    txtViewResultado.setText(txtViewResultado.getText()+"8");
                }
            }));
        }

        if (button9 != null) {
            button9.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    txtViewResultado.setText(txtViewResultado.getText()+"9");
                }
            }));
        }

        if (button0 != null) {
            button0.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    txtViewResultado.setText(txtViewResultado.getText()+"0");
                }
            }));
        }

        if (buttonSomar != null) {
            buttonSomar.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                        operacao = "somar";
                        numeroGuardado = Double.valueOf(txtViewResultado.getText().toString());
                        txtViewResultado.setText("");

                    }
            }));
        }

        if (buttonSubtrair != null) {
            buttonSubtrair.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    operacao = "subtrair";
                    numeroGuardado = Double.valueOf(txtViewResultado.getText().toString());
                    txtViewResultado.setText("");
                }
            }));
        }

        if (buttonDividir != null) {
            buttonDividir.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    operacao = "dividir";
                    numeroGuardado = Double.valueOf(txtViewResultado.getText().toString());
                    txtViewResultado.setText("");
                }
            }));
        }


        if (buttonMultiplicar != null) {
            buttonMultiplicar.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    operacao = "multiplicar";
                    numeroGuardado = Double.valueOf(txtViewResultado.getText().toString());
                    txtViewResultado.setText("");

                }
            }));
        }

        if (buttonPonto != null) {
            buttonPonto.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {

                    if(txtViewResultado.getText().toString().indexOf('.') == -1  ) {
                        txtViewResultado.setText(txtViewResultado.getText() + ".");
                    }
                }
            }));
        }

        if (buttonResultado != null) {
            buttonResultado.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
                public final void onClick(View it) {


                    switch (operacao) {
                        case "somar":
                            txtViewResultado.setText((numeroGuardado + Double.valueOf(txtViewResultado.getText().toString())) + "");
                            numeroGuardado = Double.valueOf(txtViewResultado.getText().toString());
                            break;
                        case "subtrair":
                            txtViewResultado.setText((numeroGuardado - Double.valueOf(txtViewResultado.getText().toString())) + "");
                            numeroGuardado = Double.valueOf(txtViewResultado.getText().toString());
                            break;
                        case "multiplicar":
                            txtViewResultado.setText((numeroGuardado * Double.valueOf(txtViewResultado.getText().toString())) + "");
                            numeroGuardado = Double.valueOf(txtViewResultado.getText().toString());
                            break;
                        case "dividir":
                            txtViewResultado.setText((numeroGuardado / Double.valueOf(txtViewResultado.getText().toString())) + "");
                            numeroGuardado = Double.valueOf(txtViewResultado.getText().toString());
                            break;
                        default:
                            Toast.makeText((Context) MainActivity.this, "Selecione uma operaçao!", Toast.LENGTH_LONG).show();
                            break;
                    }
                }
            }));
        }

    }
}


