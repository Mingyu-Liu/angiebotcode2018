package org.usfirst.frc.team3473.robot.subsystems;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.RobotMap;
import org.usfirst.frc.team3473.robot.commands.Driving;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		
	}
	public void setLeft(double speed) { //sets the methods our commands access
		RobotMap.backLeft.set(speed);
		RobotMap.frontLeft.set(speed);
		RobotMap.middleLeft.set(speed);
	}

	public void setRight(double speed) {
		RobotMap.backRight.set(-speed);
		RobotMap.middleRight.set(-speed);
		RobotMap.frontRight.set(-speed);
	}
}
