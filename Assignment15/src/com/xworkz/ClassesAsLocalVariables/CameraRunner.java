package com.xworkz.ClassesAsLocalVariables;

public class CameraRunner {
    public static void main(String[] args) {
        Lens lens=new Lens();
        Camera camera=new Camera();
        camera.setBrand("Sony");
        camera.setPrice(1000000);
        camera.setType(CameraType.DSLR);
        camera.setConnectivity("Weak");
        lens.capture(camera);
    }


}
