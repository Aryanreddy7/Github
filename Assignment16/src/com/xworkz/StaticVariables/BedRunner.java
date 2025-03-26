package com.xworkz.StaticVariables;

import com.xworkz.StaticVariblesAndEncapsulation.Bed;
import com.xworkz.StaticVariblesAndEncapsulation.BedSheet;

public class BedRunner {
    public static void main(String[] args) {
        Pillow pillow = new Pillow();
        Bed bed = new Bed();
        BedSheet bedSheet = new BedSheet();
        bedSheet.clean(bed);
        pillow.sleep(bed);

    }
}
