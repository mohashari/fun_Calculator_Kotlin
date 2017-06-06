package sinau.com.fistkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById(R.id.txtResult) as TextView
        val btnJml = findViewById(R.id.btnJml) as Button
        val btnMin = findViewById(R.id.btnMin) as Button

        btnJml.setOnClickListener(View.OnClickListener {
            view ->  result.text = (getNum1() + getNum2()).toString()
        })
        btnMin.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() - getNum2()).toString()
        })

    }
    fun getNum1(): Int{
        val input_bil1 = findViewById(R.id.bil1) as EditText
         return Integer.parseInt(input_bil1.text.toString())
    }
    fun getNum2(): Int{
        val input_bil2 = findViewById(R.id.bil2) as EditText
        return Integer.parseInt(input_bil2.text.toString())
    }
}
