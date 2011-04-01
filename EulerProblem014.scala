def collatz(n:Int, steps:Int):Int = {
	if (n == 1) steps + 1 //return amount of steps
	else {
		val a = if (n % 2 == 0) n / 2 else n * 3 + 1
		collatz(a, steps + 1) //add 1 to step count and continue sequence
	}
}

println((1 until 1000000).view.map(n => (n, collatz(n, 0))).reduceLeft((a, b) => 
if (a._2 > b._2) a else b)._1) //get all sequences and find longest
