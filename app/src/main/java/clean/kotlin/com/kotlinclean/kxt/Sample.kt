package clean.kotlin.com.kotlinclean.kxt

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log

inline fun <reified T> T.logi(message: String) = Log.i(T::class.java.simpleName, message)

inline fun <T> AppCompatActivity.callFunWithFunctionAsArgument(function: () -> T): T {
    Log.d("KotlinClean", "start event")
    val result = try {
        val returnValue = function()
        returnValue
    } finally {
        Log.d("KotlinClean", "something happend")
    }
    return result
}