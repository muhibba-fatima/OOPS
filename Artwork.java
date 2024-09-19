class Artwork{
   private String title;
   private int year;
   private Artist artist;

 Artwork(String title, int year, Artist artist){
     this.title = title;
     this.year = year;
     this.artist = artist;

}

Artwork(String title, int year){
     this.title = title;
     this.year = year;
}
Artwork(Artwork a){
     this.title = a.title;
     this.year = a.year;
     this.artist = new Artist(a.getArtist());

}

public String getTitle(){
    return title;
}
public int getYear(){
    return year;
}
public Artist getArtist(){
    return artist;
}

public void display1(){
    System.out.println("Artwork title : "+title);
    System.out.println("Artwork year : "+year);
    System.out.println("Artist : "+artist.getartistName());
}

}