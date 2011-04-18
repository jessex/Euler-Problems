val divSums = (0 until 10000).view.map(n => (1 to (n/2)).filter(n % _ == 0).sum)
//zip through with d being the sum of divisors and i being the number
val amicables = divSums.zipWithIndex.collect { 
	case (s, i) if s < 10000 && divSums(s) == i && divSums(s) != s => i
}
println(amicables.sum)
