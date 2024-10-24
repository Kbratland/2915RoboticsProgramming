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
    public boolean targetSpotted(){
        return targetGet() != null;
    }
    public double getYaw(){
        if(targetGet() != null){
            double retYaw = targetGet().getYaw();
            return retYaw;
        }
        else{
            return(0);
        }

    }
    public double getPitch(){
        if(targetGet() != null){
            double retPitch = targetGet().getPitch();
            return retPitch;
        }
        else{
            return(0);
        }
    }
    public double getArea(){
        if(targetGet() != null){
            double retArea = targetGet().getArea();
            return retArea;
        }
        else{
            return(0);
        }
    }
}
