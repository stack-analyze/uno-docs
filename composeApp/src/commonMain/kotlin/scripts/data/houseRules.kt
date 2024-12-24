package scripts.data

data class Rule(
    val title: String,
    val desc: String,
)

val houseRules: Map<String, List<Rule>> = mapOf(
    "oficiales" to listOf(
        Rule(
            title = "7-0",
            desc = """
        esta regla consite en el cambio de cartas:
            si lanzas la carta 0 todo se intercambia su mano en la dirreciòn actual.
            si lanza la carta 7 intercambias con cualquier persona que tu eligas
        "esta reglas es canonica en el uno no mercy"
        """.trimIndent()
        ),
        Rule(
            title = "acumulacion",
            desc = """
        esta regla se trata acumular las cartas de igual o mayor valor.
            ejemplo: 
                si lanzas un toma 2 debes lanzar otro toma2 o superior. 
                si lanza un toma 4 no puedes tirar un toma2 debido no aplicar el castigo.
                si no tienes otra para lanzar debes tomar la cantidad total de cartas y pierdes tu turno.
        en el uno no mercy esta reglas es canonica.
        en hispano america esta regla es usada de una forma mal ejecutada usando la condiciòn de igual, menor o mayor valor. 
        """.trimIndent()
        ),
        Rule(
            title = "robar hasta jugar",
            desc = """
        esta regla consiste en robar cartas hasta que le salga:
            si el jugador tirò un 4 azul.
            el siguiente debe robar cartas hasta que le salga un nùmero 4 azul, color azul o un nùmero 4 azul de otro color.
            "los comodines son validos."
        "en el uno no mercy esta regla es canonica"
        """.trimIndent()
        ),
        Rule(
            title = "intersección",
            desc = """
        esta regla se ejecuta de la siguiente forma:
            si un jugador lanzo un 8 rojo cualquier jugador puede tirar un carta identica.
        "en el uno party esta regla es canonica"
        """.trimIndent()
        ),
    ),
    "exclusivas" to listOf(
        Rule(
            title = "piedad",
            desc = """
        esta regla es exclusiva de uno no mercy:
        consiste que el jugador tiene una cantidad mayor o igual a 25 cartas estas eliminado.
        """.trimIndent()
        ),
        Rule(
            title = "carta de poder",
            desc = """
        esta regla es exclusiva de flex:
        antes de la partida cada jugador tiene su carta de poder debe empezar con el lado verde.
        se debe usar bajo las siguientess condiciones:
            1) si tienes una carta numerada con el lado flex se puede usar
            2) cartas numerada que tiene un simbolo de voltear.
            3) cartas de acciòn u comodìn con lados flex u comodìn todos voltean.
        "recuerda si tiraste tu carta con el lado flex debe voltean su carta de poder a rojo."
        """.trimIndent()
        )
    ),
    "no oficiales" to listOf(
        Rule(
            title = "espejo",
            desc = """
            esta reglas te permite tira todas tu cartas de mismo valor numerico sin importar el color.
            en el uno no mercy es una regla innecesaria a favor de la carta tira un color.
            "excepto en uno spin que es canonica"
        """.trimIndent()
        ),
        Rule(
            title = "no ganar con cartas de acciòn u comodìn",
            desc = """
        esta regla es usada en hispano america. 
        se trata de prohibir la victoria por medio de cartas de acciòn u comodìn no se aplica en:
            1. torneos.
            2. jugadores experimentales.
            3. uno all wild: debido que todas las cartas son comodines.
            4. uno express y junior por su sencilla dificultad.
            5. algunos juegos de uno que son de caracter belico.
        "esta regla es innecesaria"
        """.trimIndent()
        ),
        Rule(
            title = "7 todos muteados",
            desc = """
            se trata de una version liteada de 7-0:
                1. si alguien lanza una carta 7 todos deben quedar callados.
                2. si rompes esta regla deben comen dos cartas.
            """.trimIndent(),
        ),
        Rule(
            title = "8 loco",
            desc = """
            se comporta muy similar a un modo de juego llamado wild race:
              se trata que si el ultimo que toca una carta 8 comen dos cartas.
            """.trimIndent(),
        ),
    )
)