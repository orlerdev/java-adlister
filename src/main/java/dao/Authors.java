package dao;
import java.util.List;

public interface Authors {
  List<Authors> all();

  void insert(models.Authors authors);
}
