package traits

trait Logger1 {
    def log(msg: String)    // An abstract method
}

class ConsoleLogger1 extends Logger1 {    
    def log(msg: String) { 
      println(msg + " -- ConsoleLogger1") 
    } 
}

class DBLogger1 extends Logger1 {
    def log(msg: String) { 
      println(msg + " -- DBLogger1") 
      // store the message in DB
    }
}

class FileLogger1 extends Logger1 {
    def log(msg: String) { 
      println(msg + " -- FileLogger1") 
      // store the message in a file
    }
}

object Main1 extends App {    
    //val consoleLogger = new ConsoleLogger1
    //consoleLogger.log("Hi..! I am printing from Main..!!")
    
    logMessage(new ConsoleLogger1, "Some Message")
    logMessage(new DBLogger1, "Some Message")
    logMessage(new FileLogger1, "Some Message")
    
    def logMessage(logger: Logger1, message: String ) {
       logger.log(message)
    }   
}

