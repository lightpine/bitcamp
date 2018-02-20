package test.dao;

import java.util.List;
import java.util.Map;

import test.domain.Library;

public interface LibraryDao {

    List<Library> findAll(Map<String,Object> params);
    Library findByNo(int no);
    int insert(Library library);
    int update(Library library);
    int delete(int no);
    int countAll();
}

