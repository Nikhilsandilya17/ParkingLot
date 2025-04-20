package model;

public abstract class Vehicle {
    private String licenseNo;
    private VehicleType vehicleType;

    public Vehicle(String licenseNo, VehicleType vehicleType) {
        this.licenseNo = licenseNo;
        this.vehicleType = vehicleType;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
