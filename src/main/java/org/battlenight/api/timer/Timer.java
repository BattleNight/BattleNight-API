package org.battlenight.api.timer;

public interface Timer {

    public long getTime();

    public long getTimeRemaining();

    public boolean isRunning();

    public void setTime(long time);

    public void setTimeRemaining(long time);

    public void start();

    public void stop();

}
