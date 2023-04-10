package concepts.multithreading

object MultiThreadingSleep extends App {
  
  var t1 = new ThreadSleep(5, 500)  
  var t2 = new ThreadSleep(8, 200)  
  t1.setName("Thread1")
  t1.start() 
  
  t2.setName("Thread2")
  t2.start()    
}

class ThreadSleep(n: Int, sleep: Int) extends Thread {  
  override def run() {  
    for(i<- 0 to n) {  
      println(this.getName + " " + i)  
      Thread.sleep(sleep)  
    }  
  }  
}  