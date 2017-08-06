package models;

import com.example.kushal.labourershub.R;

import java.util.ArrayList;

/**
 * Created by KUSHAL on 7/25/2017.
 */
public class ProfessionalModel {
    private int imageID;
    private String title;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageID() {
        return imageID;
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

    public static ArrayList<ProfessionalModel> getObList() {

        ArrayList<ProfessionalModel> dataaList = new ArrayList<>();

        int[] images = getImages();
        String[] titles=getTitles();
        String[] description=getdescription();
        for (int i = 0; i < 8; i++) {
            ProfessionalModel professionalModel=new ProfessionalModel();
           // SkilledModel skilledModel = new SkilledModel();
            professionalModel.setImageID(images[i]);
          //  professionalModel.setTitle(titles[i]);
            professionalModel.setTitle(titles[i]);
            professionalModel.setDescription(description[i]);
            dataaList.add(professionalModel);
        }
        return dataaList;
    }

    private static int[] getImages () {

        int[] images = {R.drawable.lawyer,R.drawable.teacher,R.drawable.computer_repair_technician,R.drawable.interior_design,R.drawable.medical_laboratory_scientist
        ,R.drawable.pysical_therapy,R.drawable.wedding_planner,R.drawable.yoga_trainer
        };
        return images;
    }
    private static String[] getTitles(){

        String[] titles={"Lawyer","teacher","Computer Repair Technician","Interior Designer","Medical Laboritory Scientist","Physical Therapy"
        ,"Wedding Planner","Yoga Trainer"
        };
        return titles;

    }

    private static String[] getdescription(){

        String[] description={"A lawyer is a person who practices law, as an advocate, barrister, attorney, counselor or solicitor or chartered legal executive.[1] Working as a lawyer involves the practical application of abstract legal theories and knowledge to solve specific individualized problems, or to advance the interests of those who hire lawyers to perform legal services.\n" +
                "\n" +
                "The role of the lawyer varies greatly across legal jurisdictions, and so it can be treated here in only the most general terms"
        ,"A teacher (also called a school teacher or, in some contexts, an educator) is a person who helps others to acquire knowledge, competences or values.\n" +
                "\n" +
                "Informally the role of teacher may be taken on by anyone (e.g. when showing a colleague how to perform a specific task). In some countries, teaching young people of school age may be carried out in an informal setting, such as within the family, (homeschooling) rather than in a formal setting such as a school or college. Some other professions may involve a significant amount of teaching (e.g. youth worker, pastor).\n" +
                "\n" +
                "In most countries, formal teaching is usually carried out by paid professional teachers. This article focuses on those who are employed, as their main role, to teach others in a formal education context, such as at a school or other place of initial formal education or training."
                ,"A computer repair technician is a person who repairs and maintains computers and servers. The technician's responsibilities may extend to include building or configuring new hardware, installing and updating software packages, and creating and maintaining computer networks."
                ,"Interior design is the art and science of enhancing the interiors, sometimes including the exterior, of a space or building, to achieve a healthier and more aesthetically pleasing environment for the end user. An interior designer is someone who plans, researches, coordinates, and manages such projects. Interior design is a multifaceted profession that includes conceptual development, space planning, site inspections, programming, research, communicating with the stakeholders of a project, construction management, and execution of the design."
                ,"A medical laboratory scientist (MLS), clinical laboratory scientist (CLS) medical laboratory technologist (MLT), is a healthcare professional who performs chemical, hematological, immunologic, histopathological, cytopathological, microscopic, and bacteriological diagnostic analyses on body fluids such as blood, urine, sputum, stool, cerebrospinal fluid (CSF), peritoneal fluid, pericardial fluid, and synovial fluid, as well as other specimens. Medical laboratory scientists work in clinical laboratories at hospitals, reference labs, biotechnology labs and non-clinical industrial labs."
                ,"Physical therapy (PT), mostly known as Physiotherapy, is a primary care specialty in western medicine that, by using mechanical force and movements [Bio-mechanics or Kinesiology], Manual therapy, exercise therapy, electrotherapy and various physical therapies who practice evidence based treatments, remediates impairments and promotes mobility, function, and quality of life through examination, diagnosis, prognosis, and physical intervention. It is performed by physical therapists."
                ,"A wedding planner is a professional who assists with the design, planning and management of a client's wedding. Weddings are significant events in people's lives and as such, couples are often willing to spend considerable amount of money to ensure that their weddings are well-organized. Wedding planners are often used by couples who work long hours and have little spare time available for sourcing and managing wedding venues and wedding suppliers."
        ,"Yoga is a group of physical, mental, and spiritual practices or disciplines which originated in ancient India. There is a broad variety of yoga schools, practices, and goals[2] in Hinduism, Buddhism, and Jainism.[3][4][5] Among the most well-known types of yoga are Hatha yoga and Rāja yoga."

        };

    return description;
    }

}
