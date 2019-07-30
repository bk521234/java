// Memento pattern can be used to save states for
// retoring to previous states of an application.
// 
// Advantage:
// We can use Serialization to achieve memento pattern implementation
// that is more generic rather than Memento pattern where every object
// needs to have it’s own Memento class implementation.
// 
// Disadvantage:
// If Originator object is very huge then Memento object size will also
// be huge and use a lot of memory.

import java.util.List; 
import java.util.ArrayList; 

class Life 
{
    private String time; 
   
    public void set(String time)  
    { 
        System.out.println("Setting time to " + time); 
        this.time = time; 
    }
   
    public Memento saveToMemento()  
    { 
        System.out.println("Saving time to Memento"); 
        return new Memento(time); 
    }
   
    public void restoreFromMemento(Memento memento)  
    { 
        time = memento.getSavedTime(); 
        System.out.println("Time restored from Memento: " + time); 
    }
   
    public static class Memento  
    { 
        private final String time; 
   
        public Memento(String timeToSave)  
        { 
            time = timeToSave; 
        }
   
        public String getSavedTime()  
        { 
            return time; 
        }
    }
}

class Design  
{ 
      
    public static void main(String[] args)  
    { 
          
        List<Life.Memento> savedTimes = new ArrayList<Life.Memento>(); 
   
        Life life = new Life(); 
   
        //time travel and record the eras 
        life.set("1000 B.C."); 
        savedTimes.add(life.saveToMemento()); 
        life.set("1000 A.D."); 
        savedTimes.add(life.saveToMemento()); 
        life.set("2000 A.D."); 
        savedTimes.add(life.saveToMemento()); 
        life.set("4000 A.D."); 
   
        life.restoreFromMemento(savedTimes.get(0));    
   
    }
}
