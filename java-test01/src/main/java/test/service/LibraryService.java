package test.service;

import java.util.List;
import java.util.Map;

import test.domain.Library;
import test.domain.UploadFile;

public interface LibraryService {
    List<Library> list(int pageNo, int pageSize, Map<String,Object> options);
    Library get(int no);
    int getTotalCount();
    int add(Library library);
    int update(Library library);
    int delete(int no);
    void addFiles(List<UploadFile> files, int libraryNo);
    
    
}
