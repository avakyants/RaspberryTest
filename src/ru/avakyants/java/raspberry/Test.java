package ru.avakyants.java.raspberry;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello rasberry!");		
		 GpioController gpioController = GpioFactory.getInstance();
		 
		 GpioPinDigitalOutput gpioPinDigitalOutput = gpioController.provisionDigitalOutputPin(RaspiPin.GPIO_04, "MyLED", PinState.HIGH);
		 
		 while (true) {
	            gpioPinDigitalOutput.toggle();
	            Thread.sleep(500);
	        }
		
	}

}
