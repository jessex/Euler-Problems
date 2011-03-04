//Maps all a^b terms for lower <= b <= upper to all a for lower <= a <= upper
def getDistinctCount(lower:Int, upper:Int) = {
	(lower to upper).flatMap(a => (lower to upper).map(b => BigInt(a).pow(b)))
	.distinct.size //Return number of distinct elements
}

println(getDistinctCount(2, 100))
