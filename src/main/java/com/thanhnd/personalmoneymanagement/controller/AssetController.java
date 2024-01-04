package com.thanhnd.personalmoneymanagement.controller;

import com.thanhnd.personalmoneymanagement.model.tables.pojos.Asset;
import com.thanhnd.personalmoneymanagement.service.AssetService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/assets")
public class AssetController {
    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    private final AssetService assetService;

    @GetMapping
    public List<Asset> getAssets(){
        return assetService.getAssets();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createAsset(@RequestBody Asset asset){
        assetService.insertAsset(asset);
    }
}
