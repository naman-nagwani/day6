package com.bridgelabz;

import java.util.Scanner;

public class Stopwatch
{
    public long startTimer=0;
    public long stopTimer=0;
    public long elapsed;

    //to start timer
    public void start()
    {
        startTimer=System.currentTimeMillis();
        System.out.println("Start Time is: "+startTimer);
    }

    // to stop timer
    public void stop()
    {
        stopTimer=System.currentTimeMillis();
        System.out.println("Stop Time is: "+stopTimer);
    }

    public long getElapsedTime()
    {
        elapsed=stopTimer-startTimer;
        return elapsed;
    }

    public static void main(String[] args) throws Exception
    {
        Stopwatch sw=new Stopwatch();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter anything then press return to Start Time: ");
        scan.next();
        sw.start();

        System.out.println();
        System.out.println("Enter anything then press return to Stop Time: ");
        scan.next();
        sw.stop();

        long l=sw.getElapsedTime();
        System.out.println();
        System.out.println("Total Time Elapsed(in milli-sec) is:"+l);
        System.out.println();
        System.out.println("Converting milli-sec to seconds: "+(l/1000)+" sec");
    }
}