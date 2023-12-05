// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, val idade: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun matricular(usuarios: List<Usuario>) {
        inscritos.addAll(usuarios)
    }

    override fun toString(): String {
        var message: String = "\tFormação $nome\n" +
                "Alunos inscritos:\n"

        for (aluno in inscritos) {
            message += "\t${aluno.nome} - ${aluno.idade} anos.\n"
        }

        return message
    }
}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")

    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val usuario1: Usuario = Usuario("Sabrina Carolina", 22)
    val usuario2: Usuario = Usuario("Luzia Bernardes", 20)
    val usuario3: Usuario = Usuario("Letícia Gomes", 25)
    val usuario4: Usuario = Usuario("Gustavo Nascimento", 23)
    val usuario5: Usuario = Usuario("Erick Theo", 24)
    val usuarios: List<Usuario> = listOf(usuario1, usuario2, usuario3, usuario4, usuario5)

    val conteudo1: ConteudoEducacional = ConteudoEducacional("Princípios de Agilidade e Desenvolvimento Colaborativo")
    val conteudo2: ConteudoEducacional = ConteudoEducacional("Aprendendo Kotlin na Prática em Sua Documentação Oficial")
    val conteudo3: ConteudoEducacional = ConteudoEducacional("Praticando Sua Lógica de Programação com Kotlin")
    val conteudo4: ConteudoEducacional = ConteudoEducacional("Explorando Padrões de Projetos em Kotlin")
    val conteudo5: ConteudoEducacional = ConteudoEducacional("Entendendo Banco de Dados SQL E NoSQL")
    val conteudo6: ConteudoEducacional = ConteudoEducacional("Kotlin no Backend com Spring Boot 3")
    val conteudos: List<ConteudoEducacional> = listOf(conteudo1, conteudo2, conteudo3, conteudo4, conteudo5, conteudo6)

    val formacaoKotlin: Formacao = Formacao("Formação Kotlin Back-End Developer", conteudos)
    formacaoKotlin.matricular(usuarios)

    println(formacaoKotlin)
}
