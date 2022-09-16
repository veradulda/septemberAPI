package com.khamam;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString

@JsonIgnoreProperties(ignoreUnknown = true)
public class k_listOfspartansCustomClass {


    private List<k_spartanCustomClass3> content;


}
