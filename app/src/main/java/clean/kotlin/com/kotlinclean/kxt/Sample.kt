package clean.kotlin.com.kotlinclean.kxt

import android.content.Context
import android.util.Log
import android.widget.Toast

inline fun <T> callFunWithFunctionAsArgument(function: () -> T): T {
    Log.d("KotlinClean", "start event")
    val result = try {
        val returnValue = function()
        returnValue
    } finally {
        Log.d("KotlinClean", "something happend")
    }
    return result
}

