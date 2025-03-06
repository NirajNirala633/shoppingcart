package com.shoppingcart.shoppingcart.service.user;

import com.shoppingcart.shoppingcart.dto.UserDto;
import com.shoppingcart.shoppingcart.model.User;
import com.shoppingcart.shoppingcart.request.CreateUserRequest;
import com.shoppingcart.shoppingcart.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
