package com.ecolink.api.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "videos")
public class Video {

    @Id
    private String id;

    // GridFS fil-ID for selve videofilen (binær)
    private ObjectId videoFileId;

    // Påkrævet felt
    private String title;

    // Valgfrit felt
    private String description;

    // GridFS fil-ID for det auto-genererede thumbnail
    private ObjectId thumbnailFileId;

    // GridFS fil-ID for undertekster (.vtt eller .srt)
    private ObjectId captionsFileId;

    // Videoens varighed i sekunder
    private Integer duration;

    // Hvem der uploadede videoen
    private String createdBy;

    // Videoer er som standard kladde skal udgives manuelt
    @Builder.Default
    private boolean isPublished = false;

    private Instant uploadedAt;
    private Instant updatedAt;

    // Indlejret metadata-objekt gemmes direkte i Video-dokumentet i MongoDB
    private VideoMetadata metadata; 

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class VideoMetadata {
        private Long fileSize;       // filstørrelse i bytes
        private String format;       // fx "mp4", "webm", "mov"
        private String resolution;   // fx "1920x1080"
    }
}