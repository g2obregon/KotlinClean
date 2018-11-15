package clean.kotlin.com.kotlinclean

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import clean.kotlin.com.kotlinclean.kxt.toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btTryOne.setOnClickListener {
            val p = getDivisionBy(getRandomInt())
            toast("The operation with 2 / i is $p")
        }

        btTryTwo.setOnClickListener {
            val p = isEven(getRandomInt())
            toast("The operation isEven for return $p")
        }
    }

    private fun getRandomInt(): Int {
        val randomNumber = (1..12).shuffled().first()
        return randomNumber
    }

    private fun getDivisionBy(i: Int): Int {
        Log.d("KotlinClean", "start long event.....")
        val result = 2 / i
        Log.d("KotlinClean", "end long event .....")
        return result
    }

    private fun isEven(randomNumber: Int): Boolean {
        Log.d("KotlinClean", "start long event.....")
        val b = 2 % randomNumber == 0
        Log.d("KotlinClean", "end long event .....")
        return b
    }
}