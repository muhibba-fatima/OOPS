public class Demo3{
   public static void main(String args[]){
     Artist ar = new Artist();
     ar.display();
     
     Artist ar1 = new Artist("Ali");
     Artwork aw = new Artwork("Painting",2024,ar1);
     aw.display1();

     Artwork aw2 = new Artwork("Writing",2023,new Artist("Aslam"));
     System.out.println(aw2);
}

}