package com.example.listapersonas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PersonaAdapter(private val personas: List<Persona>) :
    RecyclerView.Adapter<PersonaViewHolder>() {

    // Crea una fila nueva a partir del layout item_persona
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_persona, parent, false)
        return PersonaViewHolder(view)
    }

    // Rellena la fila de la posición indicada con los datos de esa persona
    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        holder.render(personas[position])
    }

    // Le dice al RecyclerView cuántas filas hay
    override fun getItemCount(): Int = personas.size
}