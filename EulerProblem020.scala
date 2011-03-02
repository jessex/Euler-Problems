//Calculates 100! and places each digit into sequence to be summed
def fac(n:BigInt):BigInt = if(n < 2) 1 else n * fac(n-1)
println(fac(100).toString.view.map(_.asDigit).sum)
