package jay.example.stepcounter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.sql.Date;
import java.sql.Timestamp;
 
@Entity
public class Steps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    int stepsCount;
    Timestamp startTime;
    Timestamp endTime;
   // static int total = 0;
   
    
 
  /*  public Steps(long id,int stepsCount, Timestamp startTime, Timestamp endTime) {
        this.id = id;
        this.stepsCount = stepsCount;
        this.startTime = startTime;
        this.endTime =endTime;
        
    } */ 
 
    public Steps() {
 
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public int getstepsCount() {
        return stepsCount;
    }
 
    public void setstepsCount(int stepsCount) {
        this.stepsCount = stepsCount;
    }
 
    public Timestamp getstartTime() {
        return startTime;
    }
 
    public void setstartTime(Timestamp startTime) {
        this.startTime = startTime;
    }
 
    public Timestamp getendTime() {
        return endTime;
    }
 
    public void setendTime(Timestamp endTime) {
        this.endTime = endTime;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer("Steps(");
        sb.append("Id : ");
        sb.append(id);
        sb.append(", stepsCount : ");
        sb.append(stepsCount);
        sb.append(", starTime : ");
        sb.append(startTime);
        sb.append(", endTime : ");
        sb.append(endTime);
        sb.append(")");
        
        
        return sb.toString();
    }
 
    /*public  static int getTotal()
    {
    	return total;
    }
    
    public  static void setTotal(int sum)
    {
    	 total = sum;
    } */
    
}