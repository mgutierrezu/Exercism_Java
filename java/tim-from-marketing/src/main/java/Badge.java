class Badge {
    public String print(Integer id, String name, String department) {

        if (id == null && department == null) {
            String formato = String.format("%s - OWNER", name);
            return formato;
        }

        else if (id == null) {
            department = department.toUpperCase();
            String formato = String.format("%s - %s", name, department);
            return formato;
        } else if (department == null) {
            String sid = id.toString();
            String formato = String.format("[%s] - %s - OWNER", sid, name);
            return formato;

        } else {
            department = department.toUpperCase();
            String sid = id.toString();
            String formato = String.format("[%s] - %s - %s", sid, name, department);
            return formato;
        }

    }
}
