package immutableClassExample;

import java.util.*;

//class must be final
public final class ImmutableClassExample {

    //fields must be private
    private String stringField;
    private List<String> list;
    private Map<String, String> map;

    //immutable class must have parametrized constructor(-s)
    public ImmutableClassExample(String stringField, List<String> list, Map<String, String> map) {
        this.stringField = stringField;
        //and deep copies for Collections
        this.list = new ArrayList<>(list);
        this.map = new HashMap<>(map);
    }

    public String getStringField() {
        return stringField;
    }
    //in getters too
    public List<String> getList() {
        return new ArrayList<>(list);
    }

    public Map<String, String> getMap() {
        return new HashMap<>(map);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImmutableClassExample that = (ImmutableClassExample) o;
        return Objects.equals(getStringField(), that.getStringField())
                && Objects.equals(getList(), that.getList())
                && Objects.equals(getMap(), that.getMap());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStringField(), getList(), getMap());
    }


    @Override
    public String toString() {
        return "ImmutableClassExample{" +
                "stringField='" + stringField + '\'' +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
