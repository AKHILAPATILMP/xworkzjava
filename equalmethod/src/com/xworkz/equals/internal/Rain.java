package com.xworkz.equals.internal;

import java.util.Objects;

public class Rain {
    private String season;
    private double intensity;
    private String region;
    private boolean isContinuous;

    public void setSeason(String season) {
        this.season = season;
    }

    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setIsContinuous(boolean isContinuous) {
        this.isContinuous = isContinuous;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Rain) {
                System.out.println("Rain ref will compare");
                Rain rain1 = this;
                Rain rain2 = (Rain) obj;

                if (rain1.intensity == rain2.intensity) {
                    System.out.println("Both rains have the same intensity");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rain [season=" + season + ", intensity=" + intensity + ", region=" + region + ", isContinuous=" + isContinuous + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(season, intensity, region, isContinuous);
    }
}
