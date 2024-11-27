package br.com.fatec.cozinha_da_mimi.client

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.fatec.cozinha_da_mimi.R
import br.com.fatec.cozinha_da_mimi.model.Restaurante

class TelaPrincipalClienteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal_cliente)

        val recyclerRestaurantes = findViewById<RecyclerView>(R.id.recyclerRestaurantes)
        recyclerRestaurantes.layoutManager = LinearLayoutManager(this)

        // Exemplo de dados para o RecyclerView
        val restaurantes = listOf(
            Restaurante("1", "Restaurante A", "Descrição A", "Endereço A", "Telefone A", emptyList()),
            Restaurante("2", "Restaurante B", "Descrição B", "Endereço B", "Telefone B", emptyList())
        )

        // Aqui você pode adaptar para um Adapter que exibirá os dados dos restaurantes
        val adapter = RestauranteAdapter(restaurantes)
        recyclerRestaurantes.adapter = adapter
    }
}
