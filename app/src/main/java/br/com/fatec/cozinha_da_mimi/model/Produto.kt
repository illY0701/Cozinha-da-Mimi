package br.com.fatec.cozinha_da_mimi.model

data class Produto(
    val id: String,            // ID único do produto
    val nome: String,          // Nome do prato
    val descricao: String,     // Descrição do prato
    val preco: Double,         // Preço do prato
    val imagemUrl: String?     // URL da imagem do prato (opcional)
)
