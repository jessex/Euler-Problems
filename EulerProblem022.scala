//Read names in from file and get rid of all punctuation and sort alphabetically
val names = io.Source.fromFile("names.txt").mkString.split(",").map(_.tail.init).sorted
/* Calculate score for each name, first by getting ASCII value sum for each name
 * and then by calculating product of name's score with its true index (1-based)
 */
val scores = names.map(_.map(_ - 64).sum).zipWithIndex.map(p => p._1 * (p._2 + 1))
println(scores.sum)
