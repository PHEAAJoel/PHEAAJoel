// Start writing your ScalaFiddle code here

import scala.collection.mutable.ListBuffer

class Suite(name:String, color:String){
  var Name = name;
  var Color = color;
  println(s"Suite Created $name")
  
  def getAbv(): String ={
    return Name.substring(0,1) +"/"+Color.substring(0,1);
  }
  
}

var suites: ListBuffer[Suite] = ListBuffer()

suites += (new Suite("Hearts","Red"));
suites += (new Suite("Clubs","Black"));
suites += (new Suite("Diamonds","Red"));
suites += (new Suite("Spades","Black"));

//sort by name and print the names.
val sortedSuites = suites.sortBy(_.Name)
for (s <- sortedSuites) println(s.Name)
