package br.com.fatec.cozinha_da_mimi.model

data class Cliente(
    val id: String,             // ID único do cliente
    val nome: String,           // Nome do cliente
    val email: String,          // E-mail do cliente
    val telefone: String?,      // Telefone do cliente (opcional)
    val endereco: String?       // Endereço do cliente (opcional)
)
