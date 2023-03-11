package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.SecureRandom;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Answer {
    private int caws;
    private int bulls;
    private String userInput;



}
