package com.joystickandroidapp.remotejoystick.view_model;

import com.joystickandroidapp.remotejoystick.model.FGPlayer;

import java.util.concurrent.ExecutorService;

public class ViewModel {
    public String ip;
    public int port;
    public FGPlayer FGPlayerModel;
    public ExecutorService executorService;

    public ViewModel(FGPlayer FGPlayerModel, ExecutorService executorService) {
        this.FGPlayerModel = FGPlayerModel;
        this.executorService = executorService;
    }
    /* sending the new aileron value to server */
    public void setAileron(double aileronVal) {
        Runnable taskAileron = () -> {
            FGPlayerModel.sendAileronValue(Double.toString(aileronVal));
        };
        executorService.execute(taskAileron);
    }
    /* sending the new elevator value to server */
    public void setElevator(double elevatorVal) {
        Runnable taskElevator = () -> {
            FGPlayerModel.sendElevatorValue(Double.toString(elevatorVal));
        };
        executorService.execute(taskElevator);
    }

    /* sending the new rudder value to server */
    public void setRudder(double rudderVal) {
        Runnable taskRudder = () -> {
            FGPlayerModel.sendRudderValue(Double.toString(rudderVal));
        };
        executorService.execute(taskRudder);
    }

    /* sending the new throttle value to server */
    public void setThrottle(double throttleVal) {
        Runnable taskThrottle = () -> {
            FGPlayerModel.sendThrottleValue(Double.toString(throttleVal));
        };
        executorService.execute(taskThrottle);
    }





}
