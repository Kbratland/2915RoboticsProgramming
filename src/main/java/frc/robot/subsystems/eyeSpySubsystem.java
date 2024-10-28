package frc.robot.subsystems;

import org.photonvision.PhotonCamera;
import org.photonvision.targeting.PhotonTrackedTarget;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class eyeSpySubsystem extends SubsystemBase {
    
    PhotonCamera photonCamera = new PhotonCamera("2915Cam");

    public PhotonTrackedTarget targetGet(){
        var camResult = photonCamera.getLatestResult();
        if(camResult.hasTargets()){
            PhotonTrackedTarget camTarget = camResult.getBestTarget();
            return camTarget;
        }
        else{
            return null;
        }
    }
   
}

