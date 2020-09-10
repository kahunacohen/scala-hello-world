package fns

object Fns {
  def factorialLoop(n: Int): BigInt = {
    var ret = 1
    for (x <- 1 to n) {
     ret *= x 
    }
    ret
  }
}
