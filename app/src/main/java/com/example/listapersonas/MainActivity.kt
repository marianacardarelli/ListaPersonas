package com.example.listapersonas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listapersonas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Inflamos la pantalla con binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Evita que la lista quede debajo de la barra de estado
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initRecyclerView()
    }

    private fun initRecyclerView() {
        // Lista vertical
        binding.rvPersonas.layoutManager = LinearLayoutManager(this)
        // Le pasamos al adapter la lista de personas del profesor
        binding.rvPersonas.adapter = PersonaAdapter(PersonaProvider.cargarPersonas())
    }
}