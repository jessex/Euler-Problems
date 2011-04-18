//quick and easy factorial using BigInt for larger values of n
def fac(n:BigInt):BigInt = {
	if (n == 0) BigInt(1)
	else n * fac(n-1)
}
//calculates (m+n) choose n, or, (m+n)!/(m! * n!), which is number of paths
def paths(m:BigInt, n:BigInt):BigInt = fac(m + n) / (fac(m) * fac(n))
println(paths(BigInt(20), BigInt(20)))
