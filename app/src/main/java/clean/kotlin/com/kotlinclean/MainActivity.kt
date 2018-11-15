package clean.kotlin.com.kotlinclean

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import clean.kotlin.com.kotlinclean.kxt.callFunWithFunctionAsArgument

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val id = callFunWithFunctionAsArgument { getStringWithParameter(2000) }

        id.let { Log.d("Test", "2") }

        val idB = callFunWithFunctionAsArgument { getBoolean() }
        Log.d("KotlinClean", "True $idB")
    }

    private fun getStringWithParameter(i: Int): Int {
        return i
    }

    private fun getBoolean(): Boolean {
        return false
    }
}
