package br.com.fatec.cozinha_da_mimi.model

data class Restaurante(
    val id: String,              // ID único do restaurante
    val nome: String,            // Nome do restaurante
    val descricao: String,       // Descrição do restaurante
    val endereco: String,        // Endereço do restaurante
    val telefone: String?,       // Telefone do restaurante (opcional)
    val menu: List<Produto>      // Lista de produtos (pratos) do restaurante
)
