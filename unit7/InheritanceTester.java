public class InheritanceTester
{
    public static void main (String [] args){
        PosterType type = new PosterType();
        Markers mark = new Markers();
        type.length();
        type.width();
        type.color();
        type.typeOfPaper();
        type.quality();
        mark.markerType();
        mark.colorsAvailable ();
        mark.markerSize();
    }
   
}