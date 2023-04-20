package com.example.utspember

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycler : RecyclerView
    lateinit var recycleAdapter: Adapter
    lateinit var listData: ArrayList<DataML>


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler = findViewById(R.id.idrecycler)
        listData = ArrayList()

        val layoutManager = GridLayoutManager(this, 2)
        recycler.layoutManager = layoutManager
        recycleAdapter = Adapter(listData, this)


        recycler.adapter = recycleAdapter
        listData.add(DataML(R.drawable.eudora, "Eudora", "21044110001", "20 Tahun"))
        listData.add(DataML(R.drawable.zilong, "Zilong", "21044110002", "21 Tahun"))
        listData.add(DataML(R.drawable.guinevere, "Guinevere", "21044110003", "20 Tahun"))
        listData.add(DataML(R.drawable.layla, "Layla", "21044110004", "19 Tahun"))
        listData.add(DataML(R.drawable.miya, "Miya", "21044110005", "19 Tahun"))
        listData.add(DataML(R.drawable.odette, "Odette", "21044110006", "20 Tahun"))
        listData.add(DataML(R.drawable.nana, "Nana", "21044110007", "20 Tahun"))
        listData.add(DataML(R.drawable.chou, "Chou", "21044110008", "19 Tahun"))
        listData.add(DataML(R.drawable.ling, "Ling", "21044110009", "18 Tahun"))
        listData.add(DataML(R.drawable.lancelot, "Lancelot", "21044110010", "20 Tahun"))
        listData.add(DataML(R.drawable.akai, "Akai", "21044110011", "20 Tahun"))
        listData.add(DataML(R.drawable.harith, "Harith", "21044110012", "21 Tahun"))
        listData.add(DataML(R.drawable.franco, "Franco", "21044110013", "20 Tahun"))
        listData.add(DataML(R.drawable.johnson, "Johnson", "21044110014", "19 Tahun"))
        listData.add(DataML(R.drawable.karrie, "Karrie", "21044110015", "19 Tahun"))
        listData.add(DataML(R.drawable.khufra, "Khufra", "21044110016", "20 Tahun"))
        listData.add(DataML(R.drawable.lolita, "Lolita", "21044110017", "20 Tahun"))
        listData.add(DataML(R.drawable.tigreal, "Tigreal", "21044110018", "19 Tahun"))
        listData.add(DataML(R.drawable.xavier, "Xavier", "21044110019", "18 Tahun"))
        listData.add(DataML(R.drawable.gatotkaca, "Gatot Kaca", "21044110020", "20 Tahun"))

        showList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_list) {
            showList()
        } else if (item.itemId == R.id.menu_grid) {
            showGrid()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showGrid() {
        val layoutManager = GridLayoutManager(this, 2)
        recycler.layoutManager = layoutManager
        recycleAdapter = Adapter(listData, this)
        recycler.adapter = recycleAdapter
    }

    private fun showList() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler.layoutManager = layoutManager
        recycleAdapter = Adapter(listData, this)
        recycler.adapter = recycleAdapter
    }
}