package br.com.treinamentorecyclerview.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.treinamentorecyclerview.R
import br.com.treinamentorecyclerview.model.Contatos

class ListaContatosAdapter(
    private val contatos: List<Contatos>,
    private val context: Context
) : RecyclerView.Adapter<ListaContatosAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun vincular(contatos: Contatos) {
            val imagem = itemView.findViewById<ImageView>(R.id.imageView)
               // imagem.
            val nome = itemView.findViewById<TextView>(R.id.tv_nome)
                nome.text = contatos.nome
            val telefoneCelular = itemView.findViewById<TextView>(R.id.tv_telefone_celular)
                telefoneCelular.text = contatos.telefoneCelular
            val telefoneResidencial = itemView.findViewById<TextView>(R.id.tv_telefone_residencial)
                telefoneResidencial.text = contatos.telefoneResidencial
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_recyclerview, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contatos = contatos[position]
        holder.vincular(contatos)
    }

    override fun getItemCount(): Int = contatos.size
}
