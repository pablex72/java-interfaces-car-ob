public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }

    String save = "Save in databases";
    String findAll = "Find all the information";
    String delete = "Delete data";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }

}
