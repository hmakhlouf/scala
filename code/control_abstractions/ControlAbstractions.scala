package com.tekcrux.higherorderfunctions

object ControlAbstractions extends App {
  
  def runInThread(block: () => Unit) {
    new Thread {
      override def run() { block() }
    }.start()
  }
  
  runInThread { () => println("Hi-1") ; Thread.sleep(5000); println("Bye-1") }
  runInThread { () => println("Hi-2") ; Thread.sleep(2000); println("Bye-2") }
     
  
  // Control Abs simplified notation. to avoid () from the above example
  def runInThreadByName(block: => Unit) {
    new Thread {
      override def run() { block }
    }.start()
  }
  
  runInThreadByName { println("Hi-3") ; Thread.sleep(3000); println("Bye-3") }

  
  // until loop abstraction
  def until(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
      until(condition)(block)
    }
  }
  
  var x = 10
  until (x == 0) {
    x -= 1
    println(x)
  }
  
}







