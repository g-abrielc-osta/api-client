package com.apicliente.demo.domain.exceptions;

import java.time.ZonedDateTime;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class ValidationExceptionModel {
    private int status;
    private ZonedDateTime ZonedDataTimestamp;
    private List errosList;
}
