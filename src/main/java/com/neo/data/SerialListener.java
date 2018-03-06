package com.neo.data;

import java.util.Date;

import org.springframework.http.ResponseEntity;

import com.neo.util.SerialTool;

import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

public class SerialListener implements SerialPortEventListener {

	@Override
	public void serialEvent(SerialPortEvent serialPortEvent) {}

}
