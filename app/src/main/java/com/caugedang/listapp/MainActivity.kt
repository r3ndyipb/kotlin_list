package com.caugedang.listapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var buahnya: RecyclerView
    private var list: ArrayList<buah> = arrayListOf()

    private lateinit var listBuahAdapter: listBuahAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buahnya = findViewById(R.id.buah)
        buahnya.setHasFixedSize(true)

        list.addAll(dataBuah.listData)
        showRecyclerList()
        //setListClickAction()

    }

    private fun showRecyclerList(){
        buahnya.layoutManager = LinearLayoutManager(this)
        val listBuahAdapter = listBuahAdapter(list)
        buahnya.adapter = listBuahAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.profile, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.openProfile -> {
                //Toast.makeText(this, "test", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, detailProfile::class.java)
                startActivity(intent)
            }
        }
    }

    private fun setListClickAction() {

        if(::listBuahAdapter.isInitialized) {

            listBuahAdapter.setOnItemClickCallback(
                object : listBuahAdapter.OnItemClickCallback {
                    override fun onItemClick(data: buah) {
                        Toast.makeText(
                            this@MainActivity,
                            "Anda memilih ${data.nama_buah}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            )
        }
    }

}
