package br.com.fatec.cozinha_da_mimi.model

data class Pedido(
    val id: String,            // ID único do pedido
    val clienteId: String,     // ID do cliente
    val restauranteId: String, // ID do restaurante
    val itens: List<Produto>,  // Lista de produtos no pedido
    val status: String,        // Status do pedido (pendente, em preparo, etc.)
    val dataPedido: String,    // Data e hora do pedido
    val total: Double          // Valor total do pedido
)
