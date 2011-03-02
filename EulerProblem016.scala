//Raises 2^1000 and places each digit into a sequence to be summed
println(BigInt(2).pow(1000).toString.view.map(_.asDigit).sum)
