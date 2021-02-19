package mx.com.disoftware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var lista = arrayListOf<Task>()
    lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv = findViewById(R.id.recycler_view_container)
        getList()
        val taskAdapter = TaskAdapter(lista)
        rv.adapter = taskAdapter

    }

    fun getList() {
        lista.add(Task("ver cómo funciona un RecyclerView en Android", true))
        lista.add(Task("Dormir un poco", false))
        lista.add(Task("Coger con Ara, para su casa", false))
        lista.add(Task("Hacerme wey", true))
    }

}