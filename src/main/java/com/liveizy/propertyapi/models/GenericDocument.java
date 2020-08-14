package com.liveizy.propertyapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Document
@Getter
@Setter
public class GenericDocument implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @JsonIgnore
    private String id;

    @Indexed(unique = true)
    @NotNull
    @NotEmpty
    private String uuid;

    @CreatedDate
    @NotNull
    private LocalDateTime createdDate;

    @CreatedBy
    @NotNull
    @Indexed
    private String createdBy;

    @LastModifiedDate
    @NotNull
    private LocalDateTime lastModifiedDate;

    @LastModifiedBy
    @NotNull
    private String lastModifiedBy;

    @NotNull
    @JsonIgnore
    private String tenantId;

    @NotNull
    private boolean active;

}
