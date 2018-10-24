import java.util.Date;

public class StopWatch {
    public StopWatch() {
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
    }

    private long startTime = System.currentTimeMillis();
private long endTime = System.currentTimeMillis();
public  void start()
{startTime = System.currentTimeMillis();}
public void stop()
{endTime = System.currentTimeMillis();}
public long getElapsedTime()
{long elapsedTime = endTime-startTime;
return elapsedTime;
}

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
