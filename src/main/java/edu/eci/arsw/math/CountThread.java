package edu.eci.arsw.math;

import static edu.eci.arsw.math.Main.bytesToHex;

public class CountThread extends Thread{
    @Override
    public void interrupt() {
        super.interrupt();
    }

    public CountThread () {

    }

    public void start(int init, int end) {
        super.start();
    }


}
