package concepts.multithreading

object MultiThreadingPriority extends App {
  var t1 = new ThreadPriority()  
  var t2 = new ThreadPriority()  
  t1.setName("First Thread")  
  t2.setName("Second Thread")  
  t1.setPriority(Thread.MIN_PRIORITY)  
  t2.setPriority(Thread.MAX_PRIORITY)  
  t1.start()  
  t2.start()  
}

class ThreadPriority extends Thread {  
  override def run(){  
    for(i<- 0 to 5){  
      println(this.getName() + ", Priority:" + this.getPriority())  
      Thread.sleep(500)  
    }  
  }  
}  