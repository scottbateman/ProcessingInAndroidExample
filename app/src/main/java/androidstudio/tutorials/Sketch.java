//https://code.tutsplus.com/tutorials/getting-started-with-processing-for-android--cms-30419
// https://android.processing.org/tutorials/android_studio/index.html

package androidstudio.tutorials;

import processing.core.PApplet;

// Sketch.java

public class Sketch extends PApplet {
    public void settings() {
        size(displayWidth,600);
    }

    public void setup() {

    }

    public void draw() {
        if (mousePressed) {
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
    public void myDraw() {
        ellipse(200, 200, 100, 100);
    }
}