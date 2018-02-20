package test.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dao.FileDao;
import test.dao.LibraryDao;
import test.domain.Library;
import test.domain.UploadFile;
import test.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService{
    
    
    @Autowired LibraryDao libraryDao;
    @Autowired FileDao fileDao;
    
    @Override
    public List<Library> list(int pageNo, int pageSize, Map<String, Object> options) {
        
        HashMap<String,Object> params = new HashMap<>();
        params.put("startIndex", ((pageNo - 1) * pageSize)) ;
        params.put("size", pageSize);
        
        if (options != null) {
            params.putAll(options);
        }
        return libraryDao.findAll(params);
        
    }

    @Override
    public Library get(int no) {
        Library library = libraryDao.findByNo(no);
        
        return library;
    }
    
    @Override
    public int getTotalCount() {
        return libraryDao.countAll();
    }

    @Override
    public int add(Library library){
        int count = libraryDao.insert(library);
        
        addFiles(library.getFiles(), library.getNo());
        
        return count;
    }

    @Override
    public int update(Library library) {
        
        int count = libraryDao.update(library);
        
        fileDao.deleteAllByLibraryNo(library.getNo());
        
        addFiles(library.getFiles(), library.getNo());
        
        return count;
    }

    @Override
    public int delete(int no) {
        
        return libraryDao.delete(no);
    }
    
    @Override
    public void addFiles(List<UploadFile> files, int libraryNo) {
        
        for (UploadFile file : files) {
            file.setLibraryNo(libraryNo);
            fileDao.insert(file);
        }
    }


}
