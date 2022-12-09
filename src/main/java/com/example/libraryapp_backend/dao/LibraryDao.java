package com.example.libraryapp_backend.dao;

import com.example.libraryapp_backend.model.Library;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibraryDao extends CrudRepository <Library,Integer>{
    @Query(value = "SELECT `id`, `author`, `description`, `distributor`, `image`, `language`, `price`, `publisher`, `releaseyear`, `title` FROM `books` WHERE `title`=:title",nativeQuery = true)
    List<Library> BookSearch(@Param("title") String title);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `books` WHERE `id`=:id",nativeQuery = true)
    void BookDelete(@Param("id") Integer id);

}
