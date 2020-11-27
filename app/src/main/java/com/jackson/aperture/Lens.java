package com.jackson.aperture;

public class Lens {

    String lensName;
    int minFocalLength;
    int maxFocalLength;
    boolean prime;
    double[] apertureArray;

    public Lens(String lensName, int minFocalLength, int maxFocalLength, boolean prime, double[] apertureArray) {
        this.lensName = lensName;
        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;
        this.prime = prime;
        this.apertureArray = apertureArray;
    }

    public int getMinFocalLength() {
        return minFocalLength;
    }

    public void setMinFocalLength(int minFocalLength) {
        this.minFocalLength = minFocalLength;
    }

    public int getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMaxFocalLength(int maxFocalLength) {
        this.maxFocalLength = maxFocalLength;
    }

    public boolean isPrime() {
        return prime;
    }

    public void setPrime(boolean prime) {
        this.prime = prime;
    }

    public double[] getApertureArray() {
        return apertureArray;
    }

    public void setApertureArray(double[] apertureArray) {
        this.apertureArray = apertureArray;
    }

    public String getLensName() {
        return lensName;
    }

    public void setLensName(String lensName) {
        this.lensName = lensName;
    }

}
