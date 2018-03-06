package com.neo.util;

import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import com.neo.serialException.*;

/**
 * 监测数据测试类
 * 
 * @author zy
 *
 */
public class Test {

	private static final long serialVersionUID = 1L;

	private static SerialPort serialPort = null;

	private static final String PORT_NAME = "COM3";

	private static final int BPS = 9600;

	public static void main(String[] args) {

		// 获取指定端口名及波特率的串口对象
		try {
			serialPort = SerialTool.openPort(PORT_NAME, BPS);
			// 在该串口对象上添加监听器
			SerialPortEventListener serialListener = new SerialPortEventListener() {
				/**
				 * 处理监控到的串口事件
				 */
				public void serialEvent(SerialPortEvent serialPortEvent) {

					switch (serialPortEvent.getEventType()) {

					case SerialPortEvent.BI: // 10 通讯中断
						System.out.println("与串口设备通讯中断");
						break;

					case SerialPortEvent.OE: // 7 溢位（溢出）错误

					case SerialPortEvent.FE: // 9 帧错误

					case SerialPortEvent.PE: // 8 奇偶校验错误

					case SerialPortEvent.CD: // 6 载波检测

					case SerialPortEvent.CTS: // 3 清除待发送数据

					case SerialPortEvent.DSR: // 4 待发送数据准备好了

					case SerialPortEvent.RI: // 5 振铃指示

					case SerialPortEvent.OUTPUT_BUFFER_EMPTY: // 2 输出缓冲区已清空
						break;

					case SerialPortEvent.DATA_AVAILABLE: // 1 串口存在可用数据

						//System.out.println("found data");
						byte[] data = null;

						try {
							if (serialPort == null) {
								System.out.println("串口对象为空！监听失败！");
							} else {
								data = SerialTool.readFromPort(serialPort); // 读取数据，存入字节数组
								System.out.println(new String(data,"ascii"));

								// 自定义解析过程
								if (data == null || data.length < 1) { // 检查数据是否读取正确
									System.out.println("读取数据过程中未获取到有效数据！请检查设备或程序！");
								} else {
									// 解析数据
									//String str = new String(data, "UTF-8");
									//System.out.println(str);
								}
							}

						} catch (Exception e) {
							e.getMessage();
						}
						break;
					}

				}
			};
			SerialTool.addListener(serialPort, serialListener);
		} catch (SerialPortParameterFailure | NotASerialPort | NoSuchPort | PortInUse | TooManyListeners e) {
			SerialTool.closePort(serialPort);
			e.printStackTrace();
		}
	}
}
