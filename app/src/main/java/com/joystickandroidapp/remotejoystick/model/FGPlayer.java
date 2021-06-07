package com.joystickandroidapp.remotejoystick.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class FGPlayer {
    Socket fgSocket = null;
    PrintWriter fgOut = null;

    /* the function open socket with the flight gear simulator */
    void openSocket(String ipAddress, int portNumber) throws IOException {
        try {
            this.fgSocket = new Socket(ipAddress, portNumber);
            this.fgOut = new PrintWriter(fgSocket.getOutputStream(), true);
        } catch (Exception e) {
            e.printStackTrace();
            openSocket(ipAddress, portNumber);
        }
    }

    /* the function send to the simulator the new value of aileron */
    void sendAileronValue(String aileronVal) {
        if (fgOut != null) {
            fgOut.print("set/controls/flight/aileron " + aileronVal + "\r");
            fgOut.flush();
        }
    }

    /* the function send to the simulator the new value of elevator */
    void sendElevatorValue(String elevatorVal) {
        if (fgOut != null) {
            fgOut.print("set/controls/flight/elevator " + elevatorVal + "\r");
            fgOut.flush();
        }
    }

    /* the function send to the simulator the new value of rudder */
    void sendRudderValue(String rudderVal) {
        if (fgOut != null) {
            fgOut.print("set/controls/flight/rudder " + rudderVal + "\r");
            fgOut.flush();
        }
    }

    /* the function send to the simulator the new value of throttle */
    void sendThrottleValue(String throttleVal) {
        if (fgOut != null) {
            fgOut.print("set/controls/flight/throttle " + throttleVal + "\r");
            fgOut.flush();
        }
    }
}
