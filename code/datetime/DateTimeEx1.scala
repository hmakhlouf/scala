package datetime

import java.util.Date
import java.text.SimpleDateFormat
import java.util.Calendar
import java.time.LocalDate 
import java.time.format.DateTimeFormatter

object DateTimeEx1 extends App {
  
   val d1 = new Date()   
   println(d1);
   
   val d2 = new Date(2021, 1, 1)
   println(d2);
   
   val d3 = new Date(2021, 4, 1, 14, 30, 50)   
   println(d3);
   
   val today = Calendar.getInstance.getTime
     
   // create the date/time formatters
   val minuteFormat = new SimpleDateFormat("mm")
   val hourFormat = new SimpleDateFormat("hh")
   val amPmFormat = new SimpleDateFormat("a")
 
   val currentHour = hourFormat.format(today)      
   val currentMinute = minuteFormat.format(today)  
   val amPm = amPmFormat.format(today) 
  
   println(currentHour, currentMinute, amPm);
    
   // add days
   val calendar = Calendar.getInstance(); 
   calendar.setTime(new Date()); 
   calendar.add(Calendar.DATE, 2);
   println(calendar.getTime, calendar.getTime.getDay, calendar.getTime.getMonth )
   
   // date diff
   val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
   val startDate = LocalDate.parse("2020-01-01", formatter)
   val endDate = LocalDate.parse("2021-01-01", formatter)
   println(endDate.toEpochDay() - startDate.toEpochDay())

}