package fns

import scala.annotation.tailrec


object Fns {

  def factorialLoop(n: Int): BigInt = {
    var ret = 1
    for (x <- 1 to n) {
     ret *= x 
    }
    ret
  }
  
  /*
   * factorialRecurse(2)
  - go(2, 1)
  - n is not <= 0:
    - go(2 - 1, 2*1)
    - go (n=1,acc=2)
  - n is not <= 0
     - go(1-1, 1*2)
     - go(n=0, acc=2)
  - n  is <= 0:
      - return acc=2
  */
  def factorialRecurse(n: Int): Int = {
    @tailrec def go(n: Int, acc: Int): Int = {
      if (n <= 0 ) acc
      else go(n - 1, n*acc)
    }
    go(n, 1)
  }
}
