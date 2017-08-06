package models;

import com.example.kushal.labourershub.R;

import java.util.ArrayList;

/**
 * Created by KUSHAL on 7/25/2017.
 */
public class SkilledModel {


    private int imageID;
    private String title;
    private String description;

    public int getImageID() {
        return imageID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static ArrayList<SkilledModel> getObjectList() {

        ArrayList<SkilledModel> dataList = new ArrayList<>();

        int[] images = getImages();
        String[] titles=getTitles();
        String[] description=getdescription();
        for (int i = 0; i < 11; i++) {

            SkilledModel skilledModel = new SkilledModel();
            skilledModel.setImageID(images[i]);
            skilledModel.setTitle(titles[i]);
            skilledModel.setDescription(description[i]);
            dataList.add(skilledModel);
        }
        return dataList;
    }

    public static int[] getImages() {

        int[] images = {R.drawable.carpenter,R.drawable.plumber,R.drawable.electrician,R.drawable.automobile_mechanic,R.drawable.event_manager,
                R.drawable.furniture_designer,R.drawable.hairdresser,R.drawable.painter,R.drawable.photographer,R.drawable.skulpture,R.drawable.welder
        };
        return images;
    }
    private static String[] getTitles(){

        String[] titles={"Carpenter","Plumber","Electrician","Automobile Mechanic","Event Manager","Furniture Designer", "Hairdresser","Painter"
        ,"Photographer","Skulpture","Welder"};
        return titles;

    }

private static String[] getdescription() {

    String[] description={"Carpentry is a skilled trade in which the primary work performed is the cutting, shaping and installation of building materials during the construction of buildings, ships, timber bridges, concrete formwork, etc. Carpenters traditionally worked with natural wood and did the rougher work such as framing, but today many other materials are also used[1] and sometimes the finer trades of cabinetmaking and furniture building are considered carpentry."
    ,"A plumber is a tradesperson who specializes in installing and maintaining systems used for potable (drinking) water, sewage and drainage in plumbingsystems. "
            ,"An electrician is a tradesperson specializing in electrical wiring of buildings, stationary machines, and related equipment. Electricians may be employed in the installation of new electrical components or the maintenance and repair of existing electrical infrastructure.[1] Electricians may also specialize in wiring ships, airplanes, and other mobile platforms, as well as data and cable."
            ,"An auto mechanic (automotive technician in most of North America, car mechanic in British English and motor mechanic in Australian English) is a mechanic with a variety of automobile makes or either in a specific area or in a specific make of automobile. In repairing cars, their main role is to diagnose the problem accurately and quickly. They often have to quote prices for their customers before commencing work or after partial disassembly for inspection. Their job may involve the repair of a specific part or the replacement of one or more parts as assemblies"
            ,"Event management is the application of project management to the creation and development of large scale events such as festivals, conferences, ceremonies, formal parties, concerts, or conventions. It involves studying the brand, identifying it's target audience, devising the event concept, and coordinating the technical aspects before actually launching the event."
            ,"people whose primary occupation is furniture design"
            ,"A hairdresser is a person whose occupation is to cut or style hair in order to change or maintain a person's image. This is achieved using a combination of hair coloring, haircutting, and hair texturing techniques. Most hairdressers are professionally licensed as either a hairdresser, a barber or a cosmetologist."
            ,"Painting is the practice of applying paint, pigment, color or other medium[1] to a solid surface (support base). The medium is commonly applied to the base with a brush, but other implements, such as knives, sponges, and airbrushes, can be used"
            ,"A photographer is a person who makes photographs."
            ,"Sculpture is the branch of the visual arts that operates in three dimensions. It is one of the plastic arts. Durable sculptural processes originally used carving(the removal of material) and modelling (the addition of material, as clay), in stone, metal, ceramics, wood and other materials but, since Modernism, there has been an almost complete freedom of materials and process. A wide variety of materials may be worked by removal such as carving, assembled by welding or modelling, or molded, or cast."
            ,"A welder or lit operator is a tradesperson who specializes in fusing materials together. The term welder refers to the operator, the machine is referred to as the welding power supply. The materials to be joined can be metals (such as steel, aluminum, brass, stainless steel etc.) or varieties of plastic or polymer. Welders typically have to have good dexterity and attention to detail, as well as some technical knowledge about the materials being joined and best practices in the field."
    };
    return description;
}


}
