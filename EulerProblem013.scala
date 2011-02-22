def sum_column(column:List[Int], carry:Int):(Int,Int) = {
	val sum = column.reduceLeft(_+_) + carry
	(sum/10, sum%10) //Return carry value and also ones place
}

def iterate_column(cols:collection.mutable.HashMap[Int,List[Int]], carry:Int, digits:List[Int]):List[Int] = {
	val i = cols.keySet.max
	val (c, s) = sum_column(cols(i), carry) //Get carry value and sum value
	cols.remove(i) //Get rid of column so we can continue with next
	var d = digits
	if(i < 11 && i > 1) d = s :: digits //Add just the ones place
	else if (i == 1) d = c :: s :: digits //Add carry and ones place
	if(cols.isEmpty) return d //All done!
	else iterate_column(cols, c, d) //Recurse minus farthest left column
}

def from_file(s:String):collection.mutable.HashMap[Int,List[Int]] = {
	val lines = io.Source.fromFile(s).getLines.toList
	var columns = collection.mutable.HashMap[Int,List[Int]]()
	for(i <- 49 to 0 by -1) {
		columns(i+1) = List[Int]() //Sort by column, not row (number)
		lines.foreach(l => columns(i+1) = l.slice(i,i+1).toInt :: columns(i+1))
	}
	columns
}

var columns = from_file("input.txt")
var s = List[String]()
iterate_column(columns, 0, List[Int]()).foreach(d => s = d.toString :: s)
println(s.reduceLeft(_+_).reverse.slice(0,10))
