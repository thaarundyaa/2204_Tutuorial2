package answers.scala

object q4_b {

  def main(args:Array[String]):Unit ={
    print(profit(5), profit(10), profit(15), profit(20), profit(25), profit(30),profit(45), profit(40), profit(45))
  }

  def profit(price: Int): Int = {
    earnings(price) - cost(price)
  }
  def cost(price: Int) : Int = {
    500 + 3 * attendees(price)
  }
  def earnings(price: Int) : Int = {
    price * attendees(price)
  }
  def attendees(price: Int): Int = {
    120 - (price - 15)/5*20
  }

}
