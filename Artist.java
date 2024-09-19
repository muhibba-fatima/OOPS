class Artist{
     private String artistName;

  Artist(){
     artistName = "John";
}
  Artist(String artistName){
     this.artistName = artistName;
}
public String getartistName(){
    return artistName;
}

public void display(){
    System.out.println("Artist name : "+artistName);

}
}