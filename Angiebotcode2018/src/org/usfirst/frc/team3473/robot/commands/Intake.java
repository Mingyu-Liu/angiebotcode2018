package org.usfirst.frc.team3473.robot.commands;


import org.usfirst.frc.team3473.robot.subsystems.Intakesys;
import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Intake extends Command {

    public Intake() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(OI.button1.get()) {
    		Robot.shooter.setShooterSpeed(-1.0);
    		Robot.intake.setIntakeShooter(1.0);
    	
    	}
    	else {
    		Robot.intake.setIntakeShooter(0);
    		Robot.shooter.setShooterSpeed(0);
    		}
    }


	// Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
