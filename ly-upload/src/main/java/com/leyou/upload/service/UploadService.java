package com.leyou.upload.service;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.leyou.upload.controller.UploadController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author meihewang
 * @date 2020/02/07  14:40
 */
@Service
public class UploadService {

    @Autowired
    private FastFileStorageClient storageClient;

    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

    // 支持的文件类型
    private static final List<String> suffixes = Arrays.asList("image/png", "image/jpeg");

    public String upload(MultipartFile file) {
        try {
            // 1、图片信息校验
            // 1)校验文件类型
            String type = file.getContentType();
            if (!suffixes.contains(type)) {
                return null;
            }
            // 2)校验图片内容
            BufferedImage image = ImageIO.read(file.getInputStream());
            if (image == null) {
                logger.info("上传失败，文件内容不符合要求");
                return null;
            }
            // 2、保存图片
            String extension = Objects.requireNonNull(file.getOriginalFilename()).substring(file.getOriginalFilename().lastIndexOf(".")+1);
            StorePath storePath = storageClient.uploadFile(file.getInputStream(), file.getSize(), extension, null);
            return "http://image.leyou.com/" + storePath.getFullPath();
        } catch (Exception e) {
            return null;
        }
    }
}
