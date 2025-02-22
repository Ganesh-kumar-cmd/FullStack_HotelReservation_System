package com.ganesh.hotelBooking_App.service;

import com.ganesh.hotelBooking_App.model.Role;
import com.ganesh.hotelBooking_App.model.User;

import java.util.List;


public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}