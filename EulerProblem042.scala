def is_triangular(n:Int):Boolean = {
	val x = (math.sqrt(8*n + 1) - 1) / 2
	x == math.round(x) //If x is an integer it is triangular
}

def word_value(n:String) = n.map(_ - 64).sum

val words = io.Source.fromFile("words.txt").mkString.split(",").map(_.tail.init).sorted
println(words.filter(s => is_triangular(word_value(s))).size)
