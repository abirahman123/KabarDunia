package com.example.kabardunia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kabardunia.BeritaAdapter.BeritaModel
import com.example.kabardunia.BeritaAdapter.NewsAdapter
import com.example.kabardunia.BeritaAdapter.news
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var newsAdapter : NewsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Menghapus action bar
        supportActionBar?.hide()

        //membuat tampilan headline
        var headline: news?
        if (BeritaModel.newslist.size > 0){

            headline = BeritaModel.newslist[BeritaModel.newslist.size -1]
            tvw_TitleHeadLine.setText(headline.title)
            tvw_DescHeadline.setText(headline.desc)
            img_news0.setImageResource(headline.photo)

            cdv_newsheadline.setOnClickListener {
                val intent_detail = Intent(this, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, headline.title)
                        putExtra(DetailActivity.cont_KontenNews, headline.desc)
                        putExtra(DetailActivity.cont_PhotoNews, headline.photo.toString())
                    }

                startActivity(intent_detail)
                finish()
            }

        }

        //Recyclerview halaman depan
        var recyclerView = LinearLayoutManager(this)
        recyclerView.orientation = LinearLayoutManager.VERTICAL
        rcv_daftarberita.layoutManager = recyclerView

//        Memanggil adapter
        newsAdapter = NewsAdapter(this, BeritaModel.newslist)
        rcv_daftarberita.adapter = newsAdapter

//        Menampilkan detail
        newsAdapter.setOnClickCallback(object : NewsAdapter.OnItemClickCallback {
            override fun onItemClick(data: news) {

                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, data.title.toString())
                        putExtra(DetailActivity.cont_PhotoNews, data.photo.toString())
                        putExtra(DetailActivity.cont_KontenNews, data.desc.toString())
                    }

                startActivity(intent)
                finish()

            }
        })
    }
}