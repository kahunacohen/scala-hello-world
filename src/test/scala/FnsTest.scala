import fns.Fns
import org.scalatest.funspec.AnyFunSpec


class FnsSpec extends org.scalatest.funspec.AnyFunSpec {
  describe("factorialLoop") {
    it("calculates the factorial of 0") {
      assert(Fns.factorialLoop(0) == 1)
    }
    it("calculates the factorial of 1") {
      assert(Fns.factorialLoop(1) == 1)
    }
    it("calculates the factorial of a positive integer over 1") {
      assert(Fns.factorialLoop(3) == 6)
    }
  }
  describe("factorialRecurse") {
    it("calculates the factorial of a positive integer over 1") {
      assert(Fns.factorialLoop(3) == 6)
    }
  }
}
