package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class GripPiston extends SubsystemBase {

    private DoubleSolenoid doubleSolenoid;
    
    public GripPiston() {
        doubleSolenoid = new DoubleSolenoid(0, PneumaticsModuleType.CTREPCM, solenoidChannelLeft, solenoidChannelRight);
    }

    public void gripDown() {
        doubleSolenoid.set(DoubleSolenoid.value.kForward);
    }

    public void gripUp() {
        doubleSolenoid.set(DoubleSolenoid.value.kReverse)
    }

    public void gripToggle() {
        doubleSolenoid.set(DoubleSolenoid.value.toggle)
    }
}

