package concepts.multithreading

object MultiThreadEx2 extends App {
  
  // Example 1
  for (x <- 1 to 5)  
  { 
      val th = new Thread(new MyThread()) 
      th.setName(x.toString()) 
      th.start() 
  }
  
  class MyThread extends Runnable { 
     override def run() { 
        println("Thread " + Thread.currentThread().getName() + " is running.") 
     } 
  } 
  
  
  
  // Example 2
  val th1 = new Thread( new Runnable {
    override def run(): Unit = println("Running in Thread 1")
  })
  th1.start()
  
}