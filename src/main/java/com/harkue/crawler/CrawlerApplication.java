package com.harkue.crawler;

import com.harkue.crawler.libraries.servise.PlatformService;

public class CrawlerApplication {
    public static void main(String[] args) {
        PlatformService service = new PlatformService();
        service.start();
    }
}
