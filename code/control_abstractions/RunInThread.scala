package control_abstractions

object RunInThread extends App {
    
  def runInThread(block: => Unit) {
    new Thread {
      override def run() { block }
    }.start()
  }
  
  runInThread { println("Hi-1") ; Thread.sleep(5000); println("Bye-1") }
  runInThread { println("Hi-2") ; Thread.sleep(3000); println("Bye-2") }
  runInThread { println("Hi-3") ; Thread.sleep(2000); println("Bye-3") }
    
}