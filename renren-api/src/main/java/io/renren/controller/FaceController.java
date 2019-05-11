package io.renren.controller;

import io.renren.common.utils.R;
import io.renren.entity.UserEntity;
import io.renren.service.FaceService;
import io.renren.vo.face.MergeFaceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.tuple.MutablePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.net.URL;

/**
 * 旷视API
 *
 * @author sumeirui
 * @date 2019/5/11 11:01
 */
@RestController
@RequestMapping("/face")
@Api(tags = "图片处理")
public class FaceController {

    @Autowired
    private FaceService faceService;

    /**
     * 才，品，谱，型
     */
    private String[] imgUrls = new String[]{"http://ww1.sinaimg.cn/large/8e40f13ely1g2xfuwbc59j20ku0xian7.jpg"};

    @PostMapping("merge")
    @ApiOperation(value = "合成图片", response = UserEntity.class)
    public R mergeFace(@RequestParam(value = "srcFile", required = false, defaultValue = "") File srcFile,
                       @RequestParam(value = "tempUrl", required = false, defaultValue = "") String tempUrl,
                       @RequestParam(value = "index", required = false, defaultValue = "0") int index) {
        if (index >= imgUrls.length) {
            return R.error("选择模板图片错误");
        }

        URL resource = FaceService.class.getClassLoader().getResource("");
        String path = resource.getPath();
        srcFile = new File(path + "/static/img/th.jpg");
        File templateFile = new File(path + "/static/img/th3.jpg");
        MutablePair<Integer, MergeFaceResult> pair = faceService.mergeFace(templateFile, srcFile);
        if (pair.left != 0) {
            return R.error("上传的图片检测不到脸部");
        }
        return R.ok().put("url", pair.getRight().getImgUrl());
    }
}
