package com.tm.darkstar

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.lang.Exception


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun getWeather(view:View){
        val myKey = "2093b02f759229c1da497533ba4e672a"

        //val name = editTextCityName.getText().toString()

        val cityName = (EditText(findViewById(R.id.editTextCityName)))
        val cityNameString = cityName.text.toString()

        val url = "http://api.weatherstack.com/current?access_key=" + myKey + "&query=" + cityNameString

        // example: http://api.weatherstack.com/current?access_key=2093b02f759229c1da497533ba4e672a&query=New%20York
      }

    inner class weatherAsyncTask:AsyncTask<String, String, String> {

        override fun onPreExecute() {
            // This runs before task is started
        }

        override fun doInBackGround(vararg p0: String?): String {
            //TODO Add The HTTP Call HERE
            try {
                val url=URL(p0[0])

                val =
            }catch (ex:Exception) { }
        }

        override fun onProgressUpdate(vararg values: String?) {
            // Run when the inout changes
            super.onProgressUpdate(*values)
        }

        override fun onPostExecute(result: String?) {
            // This function runs after execution
        }
    }

//    fun getWeather(view: View) {
//        val myKey = "2093b02f759229c1da497533ba4e672a"
//
//        //val name = editTextCityName.getText().toString()
//
//        val cityName = (EditText(findViewById(R.id.editTextCityName)))
//        val cityNameString = cityName.text.toString()
//
//        val url = "http://api.weatherstack.com/current?access_key=" + myKey + "&query=" + cityNameString
//
//    }


}