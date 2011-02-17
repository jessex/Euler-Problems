def twoFactors(number:BigInt, start:Int):List[BigInt] = {
	var factor:Int = start
	val checker = math.sqrt(number.doubleValue) //Cut-off point
	while(1 == 1) {
		if ((number % factor) == 0) return List(factor, number/factor)
		else factor += 1
		
		if (factor > checker) return List() //number is Prime
	}
	return List()
}

//Node representing combination of factors of parent
class Node(a:BigInt, b:BigInt) {
	var aPrime = false
	var bPrime = false
	
	val aFactors = twoFactors(a, 2) //Get factors for factor a
	if (aFactors.isEmpty) aPrime = true //No factors, so is prime
	else {
		val aChild = new Node(aFactors(0), aFactors(1)) //Construct child
	}
	
	val bFactors = twoFactors(b, 2) //Repeat for factor b...
	if (bFactors.isEmpty) bPrime = true
	else {
		val bChild = new Node(bFactors(0), bFactors(1))
	}
	
	if(aPrime) primeFactors = a :: primeFactors
	if(bPrime) primeFactors = b :: primeFactors
}

var primeFactors = List[BigInt]()
val starters = twoFactors(BigInt("600851475143"), 2)
if (!starters.isEmpty) {
	val n = new Node(starters(0), starters(1)) //Kickstart tree construction
}
println(primeFactors.max)
