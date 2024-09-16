package frc.robot.subsystems;

import org.photonvision.PhotonCamera;
import org.photonvision.targeting.PhotonTrackedTarget;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class eyeSpySubsystem extends SubsystemBase {

    PhotonCamera photonCamera = new PhotonCamera("Microsoft_LifeCam_HD-3000");

    public double getTargetYaw() {

        var result = photonCamera.getLatestResult();
        if (result.hasTargets()) {
            PhotonTrackedTarget targetX = result.getBestTarget();
            return targetX.getYaw();
        } else {
            return (0);
        }
    }

    public double getTargetPitch() {

        var result = photonCamera.getLatestResult();
        if (result.hasTargets()) {
            PhotonTrackedTarget targetY = result.getBestTarget();
            return targetY.getPitch();
        } else {
            return (0);
        }
    }

    public double getTargetArea() {

        var result = photonCamera.getLatestResult();
        if (result.hasTargets()) {
            PhotonTrackedTarget targetA = result.getBestTarget();
            return targetA.getArea();
        } else {
            return (0);
        }
    }

    public boolean targetSpotted(){
        var result = photonCamera.getLatestResult();
        return result.hasTargets();
        
    }
}
