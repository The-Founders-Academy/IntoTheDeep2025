package org.firstinspires.ftc.teamcode.mecanum.commands;


import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.CommandOpMode;

import org.firstinspires.ftc.teamcode.mecanum.util.CommandGamepad;
import org.firstinspires.ftc.teamcode.mecanum.BaseMecanumDrive;
import org.firstinspires.ftc.teamcode.mecanum.mecanum.Mecanum2025;

public class DriverRelativeDrive extends CommandBase {
    private Mecanum2025 m_mecanum;
    private CommandGamepad m_driver;

    public DriverRelativeDrive(Mecanum2025 mecanum, CommandGamepad driver) {
        m_mecanum = mecanum;
        m_driver = driver;
        addRequirements(m_mecanum, m_driver);
    }

    @Override
    public void execute() {
        m_mecanum.moveFieldRelative(m_driver.getLeftY(), -m_driver.getLeftX(), -m_driver.getRightX());     // rotation inverted because clockwise rotation is negative
    }

}
