package models.audience;

import java.util.Objects;

public abstract class AbstractAudience {

    private String name;

    public AbstractAudience(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractAudience that = (AbstractAudience) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
