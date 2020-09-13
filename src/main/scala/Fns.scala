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
  
  def factorialRecurse(n: Int): Int = {
    @tailrec def loop(x: Int): Int = {
      if (x == 0) 1 else loop(x - 1)
    }
    loop(n)
  }
}
