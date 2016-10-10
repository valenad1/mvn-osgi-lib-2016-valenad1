package org.lib.model;

/**
 *
 * @author valenad1
 */
public class Id implements Comparable<Id> {

    private final int id;

    public Id(int id) {
        this.id = id;
    }

    public int compareTo(Id o) {
        return id - o.id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Id other = (Id) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

}
