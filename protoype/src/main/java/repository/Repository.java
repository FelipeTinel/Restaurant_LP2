package repository;

public interface Repository<T> {

    public void insert(T object);
    public void delete(int id);
    public void update(T object);
    public void select(int id);

}
