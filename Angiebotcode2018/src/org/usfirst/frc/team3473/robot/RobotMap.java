/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3473.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static WPI_TalonSRX frontRight = new WPI_TalonSRX(3);
	public static WPI_TalonSRX middleRight = new WPI_TalonSRX(8);
	public static WPI_TalonSRX backRight = new WPI_TalonSRX(0);
	public static WPI_TalonSRX frontLeft = new WPI_TalonSRX(10);
	public static WPI_TalonSRX middleLeft = new WPI_TalonSRX(4);
	public static WPI_TalonSRX backLeft = new WPI_TalonSRX(1);
	public static WPI_TalonSRX intake = new WPI_TalonSRX(2);
	public static WPI_TalonSRX shooterLeft = new WPI_TalonSRX(11);
	public static WPI_TalonSRX shooterRight = new WPI_TalonSRX(6);
	public static Servo servoLeft = new Servo(0);
	public static Servo servoRight = new Servo(1);
	public static WPI_TalonSRX aim = new WPI_TalonSRX(5);
	public static AnalogGyro gyro = new AnalogGyro(0);
}
