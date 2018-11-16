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
            var randomNumber = getRandomInt()
            val p = callFunWithFunctionAsArgument { getDivisionBy(randomNumber) }
            toast("The operation with 2 / i is $p")
        }

        btTryTwo.setOnClickListener {
            var randomNumber = getRandomInt()
            val p = callFunWithFunctionAsArgument { isEven(randomNumber)}
            toast("The operation isEven for return $p")
        }
    }

    private fun getDivisionBy(i: Int): Int {
        return 2 / i
    }

    private fun isEven(randomNumber: Int): Boolean {
        return 2 % randomNumber == 0
    }

    private fun getRandomInt(): Int {
        val randomNumber = (1..12).shuffled().first()
        return randomNumber
    }
}


private inline fun <T> callFunWithFunctionAsArgument(function: () -> T): T{
    Log.d("KotlinClean", "start long event.....")
    val elResultado = function()
    Log.d("KotlinClean", "end long event .....")
    return elResultado
}
