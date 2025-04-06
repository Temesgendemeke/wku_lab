package Box;

public class Box {
    int length;
    int width;
    int height;
    public Box(){}
    public Box(int l,int w, int h){
     length =l;
     width = w;
     height = h;

}
    public Box(int cube_length){
        length = width =height = cube_length;
    }

int getlength(){
        return this.length;
}
int getwidth(){
        return this.width;
}
int getheight(){
        return this.height;
}

int lengthupdater(int len){
        this.length =len;
        return len;
}
int volume(){
    return length*width*height;
}

static void boxtype(Box b){
    System.out.println("redbox length : "+b.getlength());
    System.out.println("redbox width : "+b.getwidth());
    System.out.println("redbox height : "+b.getheight());
}
 void equalto(Box b){

     if(b.length == length && b.width==width && b.height ==height){
         System.out.println("it's equal");
     }
     else{
         System.out.println("it's not equal");
     }

 }

    public static void main(String[] args) {
        Box redBox = new Box (13,10,12);//object instantiation
        Box blackBox =new Box(18,12,2);
        Box cube = new Box(10);

        System.out.println("redbox length : "+redBox.getlength());
        System.out.println("redbox width : "+redBox.getwidth());
        System.out.println("redbox height : "+redBox.getheight());
        boxtype(redBox);
        boxtype(cube);
        boxtype(blackBox);

        redBox.equalto(blackBox);

        //to update redbox information

        int redbox_volume = redBox.volume();
        int blackbox_volume = blackBox.volume();

        System.out.println("the volume of the red = "+ redbox_volume);
        System.out.println("the volume of the black = "+ blackbox_volume);

        System.out.println("red Box information: length " +redBox.length);
    }
}
