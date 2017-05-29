package revotech.com.calculator;



        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import android.widget.TextView;
        import android.widget.Toast;

        import revotech.com.calculator.services.Calculator;


public class CalcActivity extends AppCompatActivity implements View.OnClickListener {
    private Calculator calculator = Calculator.getInstance();
    private TextView textView;

    String answer;

    String appropriate = "=";

    String second = "";
    boolean pointExist = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        textView = (TextView) findViewById(R.id.result);


        Button clear = (Button) findViewById(R.id.clear);
        Button subtraction = (Button) findViewById(R.id.subtraction);
        Button multiplication = (Button) findViewById(R.id.multi);
        Button division = (Button) findViewById(R.id.divivsion);
        Button summa = (Button) findViewById(R.id.summ);
        Button six = (Button) findViewById(R.id.six);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button three = (Button) findViewById(R.id.three);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);
        Button point = (Button) findViewById(R.id.point);
        Button equally = (Button) findViewById(R.id.equally);
        Button zero = (Button) findViewById(R.id.zero);
        Button two = (Button) findViewById(R.id.two);
        Button one = (Button) findViewById(R.id.one);
        Button leftBracket = (Button) findViewById(R.id.left_bracket);
        Button rightBracket = (Button) findViewById(R.id.right_bracket);
        Button percent = (Button) findViewById(R.id.percent);
        Button sqrt = (Button) findViewById(R.id.sqrt);


        clear.setOnClickListener(this);
        subtraction.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        division.setOnClickListener(this);
        summa.setOnClickListener(this);
        six.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        three.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        point.setOnClickListener(this);
        equally.setOnClickListener(this);
        zero.setOnClickListener(this);
        two.setOnClickListener(this);
        one.setOnClickListener(this);
        leftBracket.setOnClickListener(this);
        rightBracket.setOnClickListener(this);
        percent.setOnClickListener(this);
        sqrt.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.clear:
                answer = "0";
                pointExist = false;
                textView.setText("0");
                break;
            case R.id.subtraction:
                second = second.concat("-");
                textView.setText(second);
                pointExist = false;
                break;
            case R.id.multi:
                second = second.concat("*");
                textView.setText(second);
                pointExist = false;
                break;
            case R.id.divivsion:
                second = second.concat("/");
                textView.setText(second);
                pointExist = false;
                break;
            case R.id.summ:
                second = second.concat("+");
                textView.setText(second);
                pointExist = false;
                break;
            case R.id.percent:
                second = second.concat("%");
                textView.setText(second);
                pointExist = false;
                break;
            case R.id.sqrt:
                second = second.concat("√");
                textView.setText(second);
                pointExist = false;
                break;
            case R.id.equally:
                if (!second.isEmpty()) {
                    answer = calculator.calc(second);
                    textView.setText(second + appropriate + answer);
                } else {
                    Toast notification = Toast.makeText(this, R.string.empty_input, Toast.LENGTH_LONG);
                    notification.show();
                }
                second = "";
                pointExist = false;
                break;
            case R.id.six:
                second = second.concat("6");
                textView.setText(second);
                break;
            case R.id.four:
                second = second.concat("4");
                textView.setText(second);
                break;
            case R.id.five:
                second = second.concat("5");
                textView.setText(second);
                break;
            case R.id.three:
                second = second.concat("3");
                textView.setText(second);
                break;
            case R.id.seven:
                second = second.concat("7");
                textView.setText(second);
                break;
            case R.id.eight:
                second = second.concat("8");
                textView.setText(second);
                break;
            case R.id.nine:
                second = second.concat("9");
                textView.setText(second);
                break;
            case R.id.point:
                if (!pointExist) {
                    second = second.concat(".");
                    pointExist = true;
                    textView.setText(second);
                }
                break;
            case R.id.zero:
                second = second.concat("0");
                textView.setText(second);
                break;
            case R.id.two:
                second = second.concat("2");
                textView.setText(second);
                break;
            case R.id.one:
                second = second.concat("1");
                textView.setText(second);
                break;
            case R.id.left_bracket:
                second = second.concat("(");
                textView.setText(second);
                break;
            case R.id.right_bracket:
                second = second.concat(")");
                textView.setText(second);
                break;
            default:
                break;
        }
    }


}
