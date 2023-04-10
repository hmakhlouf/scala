package concepts.multithreading

// The join() method waits for a thread to die. 
// In other words, The join() method is used to hold the execution 
// of currently running thread until the specified thread finished 
// it's execution.

object MultiThreadingJoin extends App {
  
  var t1 = new ThreadJoin()  
  var t2 = new ThreadJoin()  
  var t3 = new ThreadJoin()  
  t1.start()  
  t1.join()  
  t2.start()  
  t3.start() 
}

class ThreadJoin extends Thread{  
  override def run(){  
    for(i<- 0 to 5) {  
      println(i)  
      Thread.sleep(500)  
    }  
  }  
}