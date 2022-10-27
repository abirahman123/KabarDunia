package com.example.kabardunia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detail.*

// Untuk menampilkan isi dari berita setelah di klik
class DetailActivity : AppCompatActivity() {
    companion object {
        const val cont_TitleNews = "cont_TitleNews"
        const val cont_PhotoNews = "cont_PhotoNews"
        const val cont_KontenNews = "cont_KontenNews"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        txt_TitleNews.setText(intent.getStringExtra(cont_TitleNews))
        txt_kontenNews.setText(intent.getStringExtra(cont_KontenNews))
        img_toolbar.setImageResource(intent.getStringExtra(cont_PhotoNews)!!.toInt())

        btn_back.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                val toMain = Intent(this@DetailActivity, MainActivity::class.java)
                startActivity(toMain)
                finish()
            }
        })
    }
}