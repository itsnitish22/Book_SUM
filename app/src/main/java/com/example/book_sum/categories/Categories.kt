package com.example.book_sum.categories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.book_sum.R
import com.example.book_sum.categories.adapter.CategoryAdapter
import com.example.book_sum.categories.model.usermodel
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.nio.charset.Charset

class Categories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        val category: ArrayList<usermodel> = ArrayList()
        val rv: RecyclerView = findViewById(R.id.category_recycler)

        try {
            // As we have JSON object, so we are getting the object
            //Here we are calling a Method which is returning the JSON object
            val obj = JSONObject(getJSONFromAssets()!!)
            // fetch JSONArray named users by using getJSONArray
            val usersArray = obj.getJSONArray("books")

            // Get the users data using for loop i.e. id, name, email and so on

//            var abc1 = usersArray.getJSONObject(0)
//            var abc2=abc1.getString("genre")
//
//            var remove = usermodel(abc2)
//            category.add(remove)
            for (i in 0 until usersArray.length()) {
                // Create a JSONObject for fetching single User's Data
                val user = usersArray.getJSONObject(i)
                // Fetch id store it in variable
                val genre_name = user.getString("genre")


                // Now add all the variables to the data model class and the data model class to the array list.
                val userDetails =
                    usermodel(genre_name)
                if(category.contains(userDetails))
                    continue
                else
                    category.add(userDetails)
//                if (!userDetails.equals(remove)) {
//                    remove = userDetails
//                    category.add(userDetails)
//                }

                // add the details in the list

            }

        } catch (e: JSONException) {
            //exception
            e.printStackTrace()
        }
        rv.layoutManager = LinearLayoutManager(this)

        val itemAdapter = CategoryAdapter(this, category)
        rv.adapter = itemAdapter
    }

    private fun getJSONFromAssets(): String? {

        var json: String? = null
        val charset: Charset = Charsets.UTF_8
        try {
            val myUsersJSONFile = assets.open("books.json")
            val size = myUsersJSONFile.available()
            val buffer = ByteArray(size)
            myUsersJSONFile.read(buffer)
            myUsersJSONFile.close()
            json = String(buffer, charset)
        } catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }
        return json
    }
}