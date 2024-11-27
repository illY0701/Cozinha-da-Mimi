package br.com.fatec.cozinha_da_mimi.client

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import br.com.fatec.cozinha_da_mimi.R

class LoginCadastroClienteActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_cadastro_cliente)

        // Inicializa o FirebaseAuth
        auth = FirebaseAuth.getInstance()

        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtSenha = findViewById<EditText>(R.id.edtSenha)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnCadastro = findViewById<Button>(R.id.btnCadastro)

        // Lógica de Login
        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString()
            val senha = edtSenha.text.toString()

            if (email.isNotEmpty() && senha.isNotEmpty()) {
                auth.signInWithEmailAndPassword(email, senha)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sucesso no login, vai para a tela principal do cliente
                            startActivity(Intent(this, TelaPrincipalClienteActivity::class.java))
                            finish()  // Evita voltar para a tela de login/cadastro
                        } else {
                            // Falha no login
                            Toast.makeText(baseContext, "Falha no login.", Toast.LENGTH_SHORT).show()
                        }
                    }
            } else {
                Toast.makeText(baseContext, "Preencha todos os campos.", Toast.LENGTH_SHORT).show()
            }
        }

        // Lógica de Cadastro
        btnCadastro.setOnClickListener {
            val email = edtEmail.text.toString()
            val senha = edtSenha.text.toString()

            if (email.isNotEmpty() && senha.isNotEmpty()) {
                auth.createUserWithEmailAndPassword(email, senha)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sucesso no cadastro, vai para a tela principal do cliente
                            startActivity(Intent(this, TelaPrincipalClienteActivity::class.java))
                            finish()  // Evita voltar para a tela de login/cadastro
                        } else {
                            // Falha no cadastro
                            Toast.makeText(baseContext, "Falha no cadastro.", Toast.LENGTH_SHORT).show()
                        }
                    }
            } else {
                Toast.makeText(baseContext, "Preencha todos os campos.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
