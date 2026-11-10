package com.example.listapersonas

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.listapersonas.databinding.ItemPersonaBinding

class PersonaViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemPersonaBinding.bind(view)

    fun render(persona: Persona) {
        binding.tvNombre.text = persona.nombre
        binding.tvDescripcion.text = persona.descripcion
        binding.imgFoto.setImageResource(persona.foto)
    }

}