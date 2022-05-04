package com.vntu.akit;

public class geometricShapes {
  private double radius;
  private double width;
  private double height;
  private String circle;
  private String figure;

  public double getRadius(){ return this.radius; }
  public double getWidth(){ return this.width; }
  public double getHeight(){ return this.height; }
  public String getFigure(){ return this.figure; }

  public void setRadius(double radius){
    this.radius = radius;
  }
  public void setWidth(double width){
    this.width = width;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  public void setFigure(String figure) {
    this.figure = figure;
  }
  public void setCircle(String circle) {
    this.circle = circle;
  }

    void transformationGeo_x2 () {
     width = width * 2;
     radius = radius * 2;
     height = height * 2;
    }
    void print(){
        System.out.println("Figure: " + this.figure);
        if (radius > 0) System.out.println("Figure: " + this.circle);

    }
}
