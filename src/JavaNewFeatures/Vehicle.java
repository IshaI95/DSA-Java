package JavaNewFeatures;

import java.io.Serializable;

public sealed class Vehicle extends Thread implements Cloneable, Serializable permits Car, Bike{
}
