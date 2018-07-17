package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 11318 on 2018/7/10.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
