package com.jackson.aperture;

public class Lens {

    String lensName;
    int minAperture;
    int maxAperture;
    int focalLength;

    public int getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(int focalLength) {
        this.focalLength = focalLength;
    }

    public int getMinAperture() {
        return minAperture;
    }

    public void setMinAperture(int minAperture) {
        this.minAperture = minAperture;
    }

    public int getMaxAperture() {
        return maxAperture;
    }

    public void setMaxAperture(int maxAperture) {
        this.maxAperture = maxAperture;
    }
    public String getLensName() {
        return lensName;
    }

    public void setLensName(String lensName) {
        this.lensName = lensName;
    }

}
