package org.lib.model;

/**
 *
 * @author valenad1
 */
public class BookId implements Comparable<BookId> {

    private final int id;

    public BookId(int id) {
        this.id = id;
    }

    public int compareTo(BookId o) {
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
        final BookId other = (BookId) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

}
