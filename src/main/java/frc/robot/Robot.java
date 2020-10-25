package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.LimitSwitchNormal;
import com.ctre.phoenix.motorcontrol.LimitSwitchSource;

public class Robot extends TimedRobot {
  TalonSRX motor=new TalonSRX(0);

  @Override
  public void robotInit() {
  }


  @Override
  public void robotPeriodic() {
  }


  @Override
  public void autonomousInit() {
  }


  @Override
  public void autonomousPeriodic() {
  }


  @Override
  public void teleopInit() {
    motor.configReverseLimitSwitchSource(LimitSwitchSource.FeedbackConnector, LimitSwitchNormal.NormallyClosed);
  }

  
  @Override
  public void teleopPeriodic() {
  if(motor.getSensorCollection().isRevLimitSwitchClosed()){
    motor.set(ControlMode.PercentOutput,1); 
  }else{
    motor.set(ControlMode.PercentOutput,0); 
  }
  }

  
  @Override
  public void disabledInit() {
  }


  @Override
  public void disabledPeriodic() {
  }

  
  @Override
  public void testInit() {
  }

  
  @Override
  public void testPeriodic() {
  }
}
