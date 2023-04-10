package concepts.multithreading

object MultiThreadEx1 extends App {
  
  // Example 1
  for (x <- 1 to 5)  { 
      val th = new MyThread()   
      th.setName(x.toString()) 
      th.start() 
  }
  
  class MyThread extends Thread { 
      override def run() { 
          println("Thread " + Thread.currentThread().getName() + " is running.") 
      } 
  }
  
  
  // Example 2
  val th1 = new Thread( new Thread {
    override def run(): Unit = println("Running in Thread 1")
  })
  th1.start()
  
}