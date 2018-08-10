package HomeWork_3;

public class GroupOfStudentsIsOvercrowdedException extends Exception {

    private  String MassageText;

    public GroupOfStudentsIsOvercrowdedException(String massageText) {
        super();
        MassageText = massageText;
    }

    public GroupOfStudentsIsOvercrowdedException(){
        super();
    }

    public String getMassageText() {
        return MassageText;
    }

    public void setMassageText(String massageText) {
        MassageText = massageText;
    }

}
