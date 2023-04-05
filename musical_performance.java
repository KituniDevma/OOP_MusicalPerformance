public class musical_performance {

    public static void main (String[] args){
        live_performance Eras_Tour = new live_performance("Taylor Swift", "Eras Tour", 2023, "Glendale",new String[]{"Lavender Haze", "All Too Well", "the lakes", "The Man", "Love Story"},new String[] {"Jeslyn", "Melanie"},new String[] {"Stephanie", "Jake"});
        
        
    }
}

//Class of performance.
abstract class performance{
    String mainArtist ;              //Attributes of class performance.
    private String performanceName ;  
    private   int year ;
    private String venue ;
    String[] tracks ;
    int num_tracks ;
    String[] backup_dancers ;
    String[] backup_singers ;

    public performance(String mainArtist, String performanceName, int year, String venue, String[] tracks, String[] backup_dancers, String[] backup_singers) {
        this.mainArtist = mainArtist ;              //Attributes of class performance.
        this.performanceName = performanceName ;
        this.year = year ;
        this.venue = venue ;
        this.tracks = tracks ;
        this.backup_dancers = backup_dancers;
        this.backup_singers = backup_singers;

        System.out.println("Welcome to the performance "+ performanceName + " by " + mainArtist + " !\n");
        
        main_artist Taylor_swift = new main_artist();
        Taylor_swift.sing(mainArtist);

        for (String dancer : backup_dancers)  {
            backup_dancer x = new backup_dancer();
            x.dance(dancer);
        }

        for (String singer : backup_singers)  {
            backup_singer x = new backup_singer();
            x.sing(singer);
        }
    }
    
    public String get_venue(){       // Venue attribute is only viewable.
        return this.venue;
    }

    public int get_year(){          // year attribute is only viewable.
        return this.year;
    }

    public String get_performanceName(){    // peformanceName attribute is viewable.
        return this.performanceName;
    }

    public void set_performanceName(String performanceName){    //performanceName attribute id changeable.
        this.performanceName = performanceName ;
    }

    public void set_tracks(String[] tracks, int num_tracks){     //tracks attribute is only changeable.
        this.tracks = tracks;
        this.num_tracks = num_tracks;
    }

    abstract public void record();


}

class live_performance extends performance{

    public live_performance(String mainArtist, String performanceName, int year, String venue, String[] tracks, String[] backup_dancers, String[] backup_singers) {
        super(mainArtist, performanceName, year, venue, tracks, backup_dancers, backup_singers);
    }
   
    public void interact(){     //interact method.
        System.out.println("This is the method interact in the calss live_performance !!\n");
        return;
    }

    public void record(){       //Record method.
        System.out.println("This is the abstact method record in the class live_performance!!\n");
    }
}

class studio_performance extends performance{

    public studio_performance(String mainArtist, String performanceName, int year, String venue, String[] tracks, String[] backup_dancers, String[] backup_singers) {
        super(mainArtist, performanceName, year, venue, tracks, backup_dancers, backup_singers);
    }
    
    public void audio_processing(){   //Audio processing method.
        System.out.println("This is the method audio_processing in the class studio_performance!!\n");
    }

    public void record(){      //Record method.
        System.out.println("This is the abstact method record in the class studio_performance!!\n");
    }
}

interface Artists{
    public String name_artist = " ";    //Name attribute of the artist class.

}

interface iBackup{
    public void backup();
}

interface singers{

    public void sing(String singer);
}

class main_artist implements Artists, singers{

    public void sing(String singer){
        System.out.println(singer + " sings. This is the method sing in the class main_artist!!\n");
    }  
}

//Class of backup singers which is inherited by Artists interface and iBackup interface.
class backup_singer implements Artists, iBackup, singers{
    
    public int num_singers(String[] singers){     //Getting the number of backup singers.
        return singers.length;
    }

    public void sing(String singer){           //Method sing.
        System.out.println(singer + " sings. This is the method sing in the class backup_singers!!\n");
    }

    public void backup(){         //Method backup inherited from iBackup interface.
        System.out.println( "This is method backup in the class backup_singers!!\n");
    }
}

//Class of backup dancers which is implemented by Artists interface and iBackup interface.
class backup_dancer implements Artists, iBackup{
    
    public int num_dancers(String[] dancers){    //Getting the number of backup dancers.
        return dancers.length;
    }

    public void dance(String dancer){           //Method dance.
        System.out.println(   dancer + " dances. This is the method dance in the class backup_dancers!!\n");
    }

    public void backup(){         //Method backup inherited from iBackup interface.
        System.out.println("This is method backup in the class backup_dancers!!\n");
    }
}


//Class of track.
class track{
    String name_track ;
    int duration ;

    track(String name_track, int duration){
        this.name_track = name_track;
        this.duration = duration;
    }
}
