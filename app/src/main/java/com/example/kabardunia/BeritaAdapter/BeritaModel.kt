package com.example.kabardunia.BeritaAdapter

import com.example.kabardunia.R

class news(val title:String, val desc:String, val photo:Int)

// Memunculkan daftar Konten berita pada halaman depan aplikasi
    object BeritaModel {
        val newslist = listOf<news>(
            news(
                "Pasar ramai dikunjungi warga meskipun wabah covid 19 belum dinyatakan usai",
                "Kabar Dunia | 1 Jam yang lalu",
                R.drawable.img_news1
            ),

            news(
                "Kapal Nelayan menyalurkan bansos masyarakat Sulawesi",
                "Kabar Dunia | 1 Jam yang lalu",
                R.drawable.img_news2
            ),

            news(
                "Macet mulai terjadi di wilayah jalur pemudik semarang",
                "Kabar Dunia | 2 jam yang lalu",
                R.drawable.img_news3
            ),

            news(
                "Jelang new normal jakarta macet lagi",
                "Kabar Dunia | 3 jam yang lalu",
                R.drawable.img_news4
            ),

            news(
                "Dukung indonesia perangi covid-19, sampoerna donasi ventilator dan APD Full Set",
                "Kabar Dunia | 4 jam yang lalu",
                R.drawable.img_news5
            ),

            news(
                "Saat risma jelaskan soal penanganan corona pada kepala BNpB dan Menkes",
                "Kabar Dunia | 5 jam yang lalu",
                R.drawable.img_news6
            ),

            news(
                "Banjir keritik ke trump yang kerahkan militer usai demo george floyd",
                "Kabar Dunia | 6 jam yang lalu",
                R.drawable.img_news7
            ),

            news(
                "Mengapa aksi demo damai kasus george floyd bisa berubah jadi kerusuhan?",
                "Kabar Dunia | 8 jam yang lalu",
                R.drawable.img_news8
            ),

            news(
                "2 opsi bagi calon jemaah haji yang tidak jadi berangkat tahun ini",
                "Kabar Dunia | 1 menit yang lalu",
                R.drawable.img_news9
            )
        )
    }
