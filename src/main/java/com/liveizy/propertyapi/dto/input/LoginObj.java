/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.dto.input;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author richard.oyeleke
 */
@Data
@NoArgsConstructor
@Getter
@Setter
public class LoginObj {

    private String email;
    private String password;
    private String username;
}
