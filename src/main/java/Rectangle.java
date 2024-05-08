

public class Rectangle {

//properties
        int length;
        int width;

        // constructor
public Rectangle(int inputLength, int inputWidth) {
        this.length = inputLength;
        this.width = inputWidth;
}
        public int calculateArea(){
                return this.length * this.width;
        }

        public boolean isRectangle() {
                if (this.length==this.width ) {
                        return true;
                } else {
                        return false;
                }
       }
}
