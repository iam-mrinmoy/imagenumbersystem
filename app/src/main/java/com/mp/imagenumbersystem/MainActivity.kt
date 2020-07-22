package com.mp.imagenumbersystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var ivArray: List<ImageView>
    private lateinit var imgArray: List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivArray = listOf<ImageView>(imageView1, imageView2,imageView3)
        imgArray = listOf(
            R.drawable.img0,
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9
        )

        btnDoIt.setOnClickListener {
            if (edtNum.text.toString().isNotEmpty()) {
                loadImageBasedOnNumbers(edtNum.text.toString())
            }
        }

    }

    private fun loadImageBasedOnNumbers(num: String) {

        // hiding imageviews
        ivArray[0].visibility = View.INVISIBLE
        ivArray[1].visibility = View.INVISIBLE
        ivArray[2].visibility = View.INVISIBLE

        val numArray = num.toCharArray()

        for ((index, element) in numArray.withIndex()) {

            println("element ->${element.toInt()} index -> $index")

            ivArray[index].visibility = View.VISIBLE
            ivArray[index].setImageResource(imgArray[element.toString().toInt()])
        }


    }


}