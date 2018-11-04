package org.usfirst.frc.team3473.robot.commands;

import edu.wpi.first.wpilibj.AnalogGyro;
import org.usfirst.frc.team3473.robot.Robot;
import org.usfirst.frc.team3473.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.interfaces.Gyro;

/**
 *
 */
public class Auton extends Command {
	private Gyro gyro;
	private double startingTime;
	private double speed;
	private double time;

	public Auton(double speed, double time) {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		this.speed = speed;
		this.time = time;
	}
	double kp = 0.03;
	public void driveStraight() {
		gyro.reset();
		while(isFinished()==false){
		double angle = gyro.getAngle();
				while(angle<180 || angle>180) {
					while(angle<180) {
						RobotMap.backLeft.set(speed);
						RobotMap.frontLeft.set(speed);
						RobotMap.middleLeft.set(speed);
						RobotMap.backRight.set(0);
						RobotMap.middleRight.set(0);
						RobotMap.frontRight.set(0);
						if(angle==0) {
							continue;
						}	
					}
					while(angle>180) {
						RobotMap.backLeft.set(0);
						RobotMap.frontLeft.set(0);
						RobotMap.middleLeft.set(0);
						RobotMap.backRight.set(speed);
						RobotMap.middleRight.set(speed);
						RobotMap.frontRight.set(speed);
						if(angle==0) {
							continue;
						}
						
					}
				}
				
		}
		
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		startingTime = System.currentTimeMillis();
		Robot.drivetrain.setLeft(speed);
		Robot.drivetrain.setRight(speed);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		double timeElapsed = System.currentTimeMillis() - startingTime;
		if (timeElapsed < time) {
			return false;
		}
		return true;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.drivetrain.setLeft(0);
		Robot.drivetrain.setRight(0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
