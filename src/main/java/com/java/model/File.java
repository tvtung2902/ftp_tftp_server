package com.java.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class File extends Item implements Serializable {

    @Column(name = "file_name", nullable = false, length = 255)
    private String fileName;

    @Column(name = "file_path", nullable = false, length = 255)
    private String filePath;

    @Column(name = "file_size", nullable = false)
    private Long fileSize;

    @Column(name = "file_type", length = 255)
    private String fileType;

    @Column(name = "download_count", nullable = false)
    private Long downloadCount;

    @Column(name = "view_count", nullable = false)
    private Long viewCount;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Folder parentFolder;
}
