package com.agamya.stenoadmin.updateCourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.agamya.stenoadmin.R

class UpdateCourse : AppCompatActivity() {
    private lateinit var courseid: EditText
    private lateinit var coursename: EditText
    private lateinit var time: EditText
    private lateinit var test: EditText
    private lateinit var questions: EditText
    private lateinit var author: EditText
    private lateinit var price: EditText
    private lateinit var description: EditText
    private lateinit var review: EditText
    private lateinit var summary: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_course)
        courseid = findViewById(R.id.courseid)
        coursename = findViewById(R.id.coursename)
        time = findViewById(R.id.time)
        test = findViewById(R.id.test)
        questions = findViewById(R.id.questions)
        author = findViewById(R.id.author)
        price = findViewById(R.id.price)
        description = findViewById(R.id.description)
        review = findViewById(R.id.review)
        summary = findViewById(R.id.summary)

        val courseid=courseid.text.toString()
        Toast.makeText(this, "courseid", Toast.LENGTH_SHORT).show()

        val coursename=coursename.text.toString()
        Toast.makeText(this, "coursename", Toast.LENGTH_SHORT).show()

        val time=time.text.toString()
        Toast.makeText(this, "time", Toast.LENGTH_SHORT).show()

        val test=test.text.toString()
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show()

        val questions=questions.text.toString()
        Toast.makeText(this, "question", Toast.LENGTH_SHORT).show()

        val author=author.text.toString()
        Toast.makeText(this, "author", Toast.LENGTH_SHORT).show()

        val price=price.text.toString()
        Toast.makeText(this, "price", Toast.LENGTH_SHORT).show()

        val description=description.text.toString()
        Toast.makeText(this, "description", Toast.LENGTH_SHORT).show()

        val review=review.text.toString()
        Toast.makeText(this, "review", Toast.LENGTH_SHORT).show()

        val summary=summary.text.toString()
        Toast.makeText(this, "summary", Toast.LENGTH_SHORT).show()


    }
}
