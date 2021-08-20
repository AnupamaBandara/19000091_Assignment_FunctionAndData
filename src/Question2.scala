object Question2 {
  def main(args:Array[String]):Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    println("Answer:")
    println(x.sub(y).sub(z))
  }
  class Rational(n:Int, d:Int){
    val numer = n
    val denom = d

    def sub(num:Rational):Rational = {
      new Rational(this.numer * num.denom - num.numer * this.denom, this.denom * num.denom)
    }

    override def toString = this.numer.toString + " / " + this.denom.toString
  }
}



