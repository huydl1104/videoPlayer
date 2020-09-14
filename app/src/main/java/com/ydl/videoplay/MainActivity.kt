package com.ydl.videoplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentActivity
import com.ydl.videoplay.act.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        button10.setOnClickListener(this)
        button11.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button1->{ startActivity(Intent(this@MainActivity, NormalActivity::class.java)) }
            R.id.button2->{ startActivity(Intent(this@MainActivity, FullActivity::class.java)) }
            R.id.button3->{ startActivity(Intent(this@MainActivity, TinyActivity::class.java)) }
            R.id.button4->{ startActivity(Intent(this@MainActivity, WindowActivity::class.java)) }
            R.id.button5->{ startActivity(Intent(this@MainActivity, ClarityActivity::class.java)) }
            R.id.button6->{ startActivity(Intent(this@MainActivity, MyFragmentActivity::class.java)) }
            R.id.button7->{ startActivity(Intent(this@MainActivity, RecyclerActivity::class.java)) }
            R.id.button8->{ startActivity(Intent(this@MainActivity, EightVideoActivity::class.java)) }
            R.id.button9->{ startActivity(Intent(this@MainActivity, ListActivity::class.java)) }
            R.id.button10->{ startActivity(Intent(this@MainActivity, SavePosActivity::class.java)) }
            R.id.button11->{ startActivity(Intent(this@MainActivity, SurfaceActivity::class.java)) }
        }
    }
}