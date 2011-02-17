def fibonacci(max:Int, prev:BigInt, next:BigInt):List[BigInt] = {
	if ((prev + next) > max) List()
	else (prev + next) :: fibonacci(max, next, prev + next) //Tail-recursion!!
}
//Construct list of fibonacci #s, filter for evens, sum them up
println(fibonacci(4000000, 0, 1).filter(_%2 == 0).reduceLeft(_+_))
