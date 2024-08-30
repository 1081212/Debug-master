package com._dsa_os.debugmaster.model.bugs;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class Bug {
    private Integer bugId;
    private String title;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
