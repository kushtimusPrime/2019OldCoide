// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6964.FRCBearBotsTrial2.commands;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import org.usfirst.frc6964.FRCBearBotsTrial2.Robot;
import org.usfirst.frc6964.FRCBearBotsTrial2.RobotMap;

/**
 *
 */
public class HandChange extends Command {
//	private DoubleSolenoid left=RobotMap.handSubsystemLeftSolenoid;
	private DoubleSolenoid right=RobotMap.handSubsystemRightSolenoid;
	private double timeAfter;
	Timer timer;
	private final SpeedController arm=RobotMap.armSubsystemArmController;
	public HandChange() {
	}
    @Override
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
//    	left.set(DoubleSolenoid.Value.kForward);
    	right.set(DoubleSolenoid.Value.kForward);
    }
    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
		return false;
    	
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
//    	left.set(DoubleSolenoid.Value.kOff);
    	right.set(DoubleSolenoid.Value.kOff);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	end();
    }
}
