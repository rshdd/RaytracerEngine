/**
 * [1968] - [2021] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package edu.up.isgc.raytracer;

public interface IIntersectable {
    public abstract Intersection getIntersection(Ray ray);
}
