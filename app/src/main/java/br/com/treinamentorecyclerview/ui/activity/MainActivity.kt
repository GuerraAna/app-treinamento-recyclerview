package br.com.treinamentorecyclerview.ui.activity

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.treinamentorecyclerview.R
import br.com.treinamentorecyclerview.databinding.ActivityMainBinding
import br.com.treinamentorecyclerview.model.Contatos
import br.com.treinamentorecyclerview.ui.recyclerview.adapter.ListaContatosAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbar
        toolbar.setTitle("Treino RecyclerView")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            toolbar.setTitleTextColor(getColor(R.color.white))
            toolbar.setBackgroundColor(getColor(R.color.hard_blue))
        }

        val recyclerView = binding.recyclerview
        recyclerView.adapter = ListaContatosAdapter(context = this, contatos = listOf(
            Contatos(
                nome = "Ana Clara Guerra",
                telefoneCelular = "(11) 99934-2933",
                telefoneResidencial = "2683-5364"
            ),
            Contatos(
                nome = "Ana Clara Guerra",
                telefoneCelular = "(11) 99934-2933",
                telefoneResidencial = "2683-5364"
            ),
            Contatos(
                nome = "Ana Clara Guerra",
                telefoneCelular = "(11) 99934-2933",
                telefoneResidencial = "2683-5364"
            )
        ))
    }
}