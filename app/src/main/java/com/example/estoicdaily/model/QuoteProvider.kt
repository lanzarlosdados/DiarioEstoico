package com.example.estoicdaily.model

class QuoteProvider {
    companion object {

        fun random(): QuoteModel {
            val position = (0..10).random()
            return quotes[position]
        }

        private val quotes = listOf(
            QuoteModel(
                quote = "El que hace el bien a otro, también hace el bien a sí mismo.",
                author = "Seneca"
            ),
            QuoteModel(
                quote = "No te sabotees a ti mismo adoptando involuntariamente actitudes negativas e improductivas a través de tus relaciones con otros",
                author = "Epicteto"
            ),
            QuoteModel(
                quote = "Largo es el camino de la enseñanza por medio de teorías; breve y eficaz por medio de la práctica.",
                author = "Séneca"
            ),
            QuoteModel(
                quote = "No hay viento favorable para el que no sabe donde va.",
                author = "Séneca"
            ),
            QuoteModel(
                quote = "El autocontrol es la fuerza. El pensamiento correcto es dominio. La calma es poder.",
                author = "James Allen"
            ),
            QuoteModel(
                quote = "El estoicismo se trata de la domesticación de las emociones, no de su eliminación.",
                author = "Nassim Nicholas"
            ),
            QuoteModel(
                quote = "Cuanto más busques lo incómodo, más te sentirás cómodo.",
                author = "Conor McGregor"
            ),
            QuoteModel(
                quote = "Nadie tiene el poder de tener todo lo que desea pero está en sus manos no querer lo que no tiene y, utilizar con entusiasmo de la mejor manera lo que si tiene.",
                author = "Séneca"
            ),
            QuoteModel(
                quote = "Tienes poder sobre tu mente, no en eventos externos. Date cuenta de esto y encontrarás fuerza.",
                author = "Marco Aurelio"
            ),
            QuoteModel(
                quote = "Así como el Sol no espera que las oraciones y conjuros se levanten, sino que resplandece y es bien recibido por todos: así que tú tampoco esperes aplaudir y gritar y alabar para cumplir con tu deber; no, haz el bien por tu propia voluntad, y serás amado como el Sol.",
                author = "Epicteto"
            ),
            QuoteModel(quote = "Todo lo que escuchamos es solo una opinión, no un hecho. Lo que vemos es una perspectiva, no la realidad.",
                author = " Marco Aurelio"
            )
        )
    }
}