package com.mytube;

public class VideoProcessor {
    public void process(Video video) {
        var encoder = new VideoEncoder2020();
        encoder.encode(video);

        var database = new VideoDatabase2020();
        database.store(video);

        var emailService = new EmailService2020();
        emailService.sendEmail(video.getUser());
    }
}

