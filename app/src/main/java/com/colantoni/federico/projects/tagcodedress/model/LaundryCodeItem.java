package com.colantoni.federico.projects.tagcodedress.model;

public class LaundryCodeItem {

    private int imageRes;

    private String name;

    private String description;

    public LaundryCodeItem() {}

    public int getImageRes() {return this.imageRes;}

    public void setImageRes(int imageRes) {this.imageRes = imageRes;}

    public String getName() {return this.name;}

    public void setName(String name) {this.name = name;}

    public String getDescription() {return this.description;}

    public void setDescription(String description) {this.description = description;}

    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }
        if (!(o instanceof LaundryCodeItem)) {
            return false;
        }
        final LaundryCodeItem other = (LaundryCodeItem) o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.imageRes != other.imageRes) {
            return false;
        }
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        final Object this$description = this.description;
        final Object other$description = other.description;
        return this$description == null ? other$description == null : this$description.equals(other$description);
    }

    public int hashCode() {

        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.imageRes;
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 0 : $name.hashCode());
        final Object $description = this.description;
        result = result * PRIME + ($description == null ? 0 : $description.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {return other instanceof LaundryCodeItem;}

    public String toString() {return "com.colantoni.federico.projects.tagcodedress.model.LaundryCodeItem(imageRes=" + this.imageRes + ", name=" + this.name + ", description=" + this.description + ")";}
}
