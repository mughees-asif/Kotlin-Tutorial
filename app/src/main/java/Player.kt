class Player (val name: String,
              var level: Int = 1,
              var lives: Int = 1,
              var score: Int = 0) {

    var weapon: Weapon = Weapon("Fist", 1)


    fun show() {
        println("""
            name: $name
            lives: $lives
            level: $level
            score: $score
        """)
    }
}