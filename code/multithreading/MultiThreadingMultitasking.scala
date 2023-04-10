package concepts.multithreading

object MultiThreadingMultitasking extends App {
  var t1 = new ThreadMultitasking()  
  t1.start()  
  t1.task() 
  t1.anOthertask()
}

class ThreadMultitasking extends Thread {  
  
  override def run(){  
    for(i<- 0 to 5){  
      println("run: " + i)              
      Thread.sleep(500)  
    }  
  }  
  
  def task(){  
    for(i<- 100 to 105){  
      println("task: " + i)  
      Thread.sleep(200)  
    }  
  } 
  
  def anOthertask(){  
    for(i<- 200 to 205){  
      println("anOthertask: " + i)  
      Thread.sleep(200)  
    }  
  }
}  