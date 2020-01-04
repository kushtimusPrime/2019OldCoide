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
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import org.usfirst.frc6964.FRCBearBotsTrial2.Robot;
import org.usfirst.frc6964.FRCBearBotsTrial2.RobotMap;

/**
 *
 */
public class MoveForward extends Command {
	private double time;
	private double timeAfter;
	Timer timer;
    private final DifferentialDrive dd = RobotMap.driveSubsystemDifferentialDrive1;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public MoveForward() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	timer = new Timer();
    	timer.start();
    	time = timer.get();
    	timeAfter=time+2;
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	dd.arcadeDrive(-0.5, 0);

    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
    	if(timeAfter<=timer.get()) {
    		timer.stop();
    		return true;
    	}
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    if(isFinished()) {
    		dd.arcadeDrive(0, 0);
    	}
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	end();
    }
}
