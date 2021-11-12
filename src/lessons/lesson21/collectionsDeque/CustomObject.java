package lessons.lesson21.collectionsDeque;

import java.util.Objects;

public class CustomObject {
    private String customField;
    private int customInt;
    private int id;

    public CustomObject() {
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    public int getCustomInt() {
        return customInt;
    }

    public void setCustomInt(int customInt) {
        this.customInt = customInt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomObject)) return false;
        CustomObject that = (CustomObject) o;
        return getCustomInt() == that.getCustomInt()
                && getId() == that.getId()
                && getCustomField().equals(that.getCustomField());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomField(), getCustomInt(), getId());
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "customField='" + customField + '\'' +
                ", customInt=" + customInt +
                ", id=" + id +
                '}';
    }
}
