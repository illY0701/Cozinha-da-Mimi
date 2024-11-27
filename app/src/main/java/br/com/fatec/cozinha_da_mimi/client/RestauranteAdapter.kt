package br.com.fatec.cozinha_da_mimi.client

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fatec.cozinha_da_mimi.R
import br.com.fatec.cozinha_da_mimi.model.Restaurante
import kotlinx.android.synthetic.main.item_restaurante.view.* // Usando Kotlin synthetics para referenciar as views

class RestauranteAdapter(private val restaurantes: List<Restaurante>) :
    RecyclerView.Adapter<RestauranteAdapter.RestauranteViewHolder>() {

    // Cria uma nova ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_restaurante, parent, false)
        return RestauranteViewHolder(view)
    }

    // Preenche os dados da ViewHolder com informações dos restaurantes
    override fun onBindViewHolder(holder: RestauranteViewHolder, position: Int) {
        val restaurante = restaurantes[position]
        holder.bind(restaurante)
    }

    // Retorna o número total de itens
    override fun getItemCount(): Int = restaurantes.size

    // ViewHolder para o RecyclerView
    inner class RestauranteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(restaurante: Restaurante) {
            itemView.tvNomeRestaurante.text = restaurante.nome
            itemView.tvDescricaoRestaurante.text = restaurante.descricao
        }
    }
}
