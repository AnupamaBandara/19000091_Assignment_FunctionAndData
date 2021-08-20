object Question1 {
  def main(args:Array[String]):Unit = {
    val a = new Rational(1, 4)

    println("Before Neg")
    println(a)
    println()
    println()

    println("After Neg")
    println(a.neg)
    println()
  }
  class Rational(n:Int, d:Int){
    val numer = n
    val denom = d

    def neg = new Rational(- this.numer, this.denom)

    override def toString = this.numer.toString + " / " + this.denom.toString
  }
}



