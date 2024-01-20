import java.util.ArrayList;

class CameraOperations
{
	ArrayList<Camera>  rentAcamera = new ArrayList<Camera>();
	
	public ArrayList<Camera> getRentAcamera() {
		return rentAcamera;
	}
	public void setRentAcamera(ArrayList<Camera> rentAcamera) {
		this.rentAcamera = rentAcamera;
	}

	 
	public String addCamera(Camera camera) {
	        if (!rentAcamera.contains(camera)) {
	            camera.setStatus("Available");
	            rentAcamera.add(camera);
	            return "Camera added successfully";
	        } else {
	            return "Camera already exists";
	        }
	    }

	public String removeCamera(int camid) {
        for (Camera camera : rentAcamera) {
            if (camera.getCamid() == camid) {
                if (camera.getStatus().equals("Rented")) {
                    return "Cannot remove a rented camera.";
                } else {
                    rentAcamera.remove(camera);
                    return "Camera removed successfully.";
                }
            }
        }
        return "Camera not found.";
    }
	
	public ArrayList<Camera>  ViewAll()
	{
		return(rentAcamera);
	}
	
	
	public void rentACamera(int camid, userInfo user) {
	    boolean cameraFound = false;
	    Camera foundCamera = null;

	    for (Camera camera : rentAcamera) {
	        if (camera.getCamid() == camid && camera.getStatus().equals("Available")) {
	            cameraFound = true;
	            foundCamera = camera;
	            break;
	        }
	    }

	    if (cameraFound && foundCamera != null) {
	        double rentPerDay = foundCamera.getRentperday();

	        if (user.getWalletAmt() >= rentPerDay) {
	            foundCamera.setStatus("Rented");
	            user.setWalletAmt(user.getWalletAmt() - rentPerDay);
	            System.out.println("Your Camera with ID " + camid +" with rent "+ rentPerDay +"has been rented successfully!");
	        } else {
	            System.out.println(" Error : Transcation failed due to insufficeient wallet balance. Please deposit the money to your wallet ");
	        }
	    } else {
	        System.out.println("Camera with ID " + camid + " is not available for rent or does not exist.");
	    }
	}



	public ArrayList<Camera> ShowAllCameras() {
	    ArrayList<Camera> purchasedCameras = new ArrayList<>();

	    for (Camera camera : rentAcamera) {
	        if (!camera.getStatus().equals("Rented")) {
	            purchasedCameras.add(camera);
	        }
	    }

	    return purchasedCameras;
	}
	}

	
