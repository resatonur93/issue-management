package com.onurk.issuemanagement.service;

import com.onurk.issuemanagement.dto.UserDto;
import com.onurk.issuemanagement.entity.User;
import com.onurk.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    UserDto save(UserDto user);

    UserDto getById(Long id);

    TPage<UserDto> getAllPageable(Pageable pageable);

    UserDto getByUsername(String username);
}
