/**
 * [1968] - [2021] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package edu.up.isgc.raytracer.lights;

import edu.up.isgc.raytracer.Intersection;
import edu.up.isgc.raytracer.Ray;
import edu.up.isgc.raytracer.Vector3D;
import edu.up.isgc.raytracer.objects.Object3D;
import edu.up.isgc.raytracer.tools.Material;

import java.awt.*;

/**
 * This class defines the basics for all the future inherited lights.
 */
public abstract class Light extends Object3D {
    /**
     * @param position receives the position where the light will be instantiated.
     * @param color receives an RGB color that will be applied to the light.
     * @param intensity tells how strong will the light flash in scene.
     */
    private double intensity;
    private static Material material = new Material(0,0,0,false,false);

    public Light(Vector3D position, Color color, double intensity){
        super(position, color, material);
        setIntensity(intensity);
    }

    public double getIntensity() {
        return intensity;
    }

    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }

    public abstract float getNDotL(Intersection intersection);

    public Intersection getIntersection(Ray ray){
        return new Intersection(Vector3D.ZERO(), -1, Vector3D.ZERO(), null);
    }
}
