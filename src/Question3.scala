object Question3 {
  def main(args:Array[String]):Unit = {
    val a1 = new Account("1061", 101, 100000)
    val a2 = new Account("1428", 102, 100)

    println("BEFORE")
    println(a1)
    println(a2)

    println()
    a1.transfer(a2, 25000)

    println("AFTER WITHDRAWING Rs. 25000.00")
    println(a1)
    println(a2)
  }
  class Account(n:String, a:Int, b:Double){
    val nic:String = n
    val acnumber:Int = a
    var balance:Double = b

    def withdraw(a:Double) = {
      this.balance = this.balance - a
    }

    def deposit(a:Double) = {
      this.balance = this.balance + a
    }

    def transfer(a:Account, b:Double):Unit = {
      this.withdraw(b)
      a.deposit(b)
    }

    override def toString = "[" + this.nic + ": " + this.acnumber + ": " + this.balance + "]"
  }

}

