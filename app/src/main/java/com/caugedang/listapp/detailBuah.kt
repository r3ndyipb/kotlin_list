package com.caugedang.listapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class detailBuah: AppCompatActivity() {

    companion object {
        const val GAMBAR_BUAH = "gambarBuah"
        const val NAMA_BUAH = "namaBuah"
        const val KETERANGAN_BUAH = "keteranganBuah"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
    }
}