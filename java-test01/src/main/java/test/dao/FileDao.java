package test.dao;

import java.util.List;

import test.domain.UploadFile;

public interface FileDao {

    List<UploadFile> findByLibraryNo(int no);
    
    // insert/update/delete 개수를 리턴하고 싶다면 리턴타입을 int로 선언한다.
    // 굳이 리턴할 이유가 없다면 void로 선언한다.
    void insert(UploadFile file);
    
    void deleteAllByLibraryNo(int no);
}
