package mx.com.disoftware

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter(private val dataSet: ArrayList<Task>) : RecyclerView.Adapter<TaskAdapter.ViewHolder>() {

    // Enlaza el adaptador (TaskAdapter) con el xml que tiene el diseño de cada item del Recycler View (task.xml).
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task, parent, false)
        return ViewHolder(view)
    }

    // Encargado de establecer la comuniación del adaptador (TaskAdapter) con el ViewHolder (clase interna).
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(dataSet[position])
    }

    // tamaño de la lista.
    override fun getItemCount() = dataSet.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // aquí se hace referencia a los elementos que necesitamos pintar en cada elemento que tendrá el Recycler View.
        private val taskName = view.findViewById<TextView>(R.id.text_view_name_task)
        private val checkboxTask = view.findViewById<CheckBox>(R.id.checkbox_task)

        fun setData(task: Task) {
            taskName.text = task.nameTask
            checkboxTask.isChecked = task.completed
        }

    }

}