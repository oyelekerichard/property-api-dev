/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.dto.output;

import com.liveizy.propertyapi.models.Users;
import lombok.Data;

/**
 *
 * @author richard.oyeleke
 */
@Data
public class TokenDetails 
{
    public Users users;
    public String token;
}
