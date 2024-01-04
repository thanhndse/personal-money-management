package com.thanhnd.personalmoneymanagement.service;

import com.thanhnd.personalmoneymanagement.model.Tables;
import com.thanhnd.personalmoneymanagement.model.tables.pojos.Asset;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AssetService {

    private final DSLContext dslContext;

    public AssetService(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public List<Asset> getAssets() {
        return dslContext.selectFrom(Tables.ASSET)
                .fetchInto(Asset.class);
    }

    public void insertAsset(Asset asset){
        var record = dslContext.newRecord(Tables.ASSET, asset);
        record.store();
    }
}
