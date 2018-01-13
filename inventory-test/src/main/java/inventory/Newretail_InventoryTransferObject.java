package inventory;

import com.newretail.basecenter.item.dto.ItemDTO;
import com.newretail.basecenter.item.dto.SkuDTO;
import com.newretail.logisticscenter.inventorycenter.dto.InventoryDTO;
import com.newretail.logisticscenter.inventorycenter.dto.WmsInventoryDTO;
import com.newretail.logisticscenter.inventorycenter.dto.WmsInventoryItemDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Newretail_InventoryTransferObject {
    public static InventoryDTO getInventoryDTO(String inventoryModel, String sellerId, String sellerName,
                                               String supplierId, String supplierName, String itemId, String skuId, String itemCode,
                                               String inventoryType, String channelType, String quantity, String lockQuantity, String marking,
                                               String bizType, String operatorId, String operatorName, String storeCode, String storeType) {

        InventoryDTO inventoryDTO=new InventoryDTO();

        if (!inventoryModel.equals("null") && !inventoryModel.equals("")) {
            inventoryDTO.setInventoryModel(Integer.valueOf(inventoryModel));
        }

        if (!sellerId.equals("null") && !sellerId.equals("")) {
            inventoryDTO.setSellerId(Long.valueOf(sellerId));
        }
        if (!bizType.equals("null") && !bizType.equals("")) {
            inventoryDTO.setBizType(bizType);
        }
        if (!sellerName.equals("null") && !sellerName.equals("")) {
            inventoryDTO.setSellerName(sellerName);
        }
        if (!supplierId.equals("null") && !supplierId.equals("")) {
            inventoryDTO.setSupplierId(Long.valueOf(supplierId));
        }
        if (!supplierName.equals("null") && !supplierName.equals("")) {
            inventoryDTO.setSupplierName(supplierName);
        }
        if (!itemId.equals("null") && !itemId.equals("")) {
            inventoryDTO.setItemId(Long.valueOf(itemId));
        }
        if (!skuId.equals("null") && !skuId.equals("")) {
            inventoryDTO.setSkuId(Long.valueOf(skuId));
        }
        if (!itemCode.equals("null") && !itemCode.equals("")) {
            inventoryDTO.setItemCode(itemCode);
        }
        if (!inventoryType.equals("null") && !inventoryType.equals("")) {
            inventoryDTO.setInventoryType(Integer.valueOf(inventoryType));
        }
        if (!channelType.equals("null") && !channelType.equals("")) {
            inventoryDTO.setChannelType(Integer.valueOf(channelType));
        }
        if (!quantity.equals("null") && !quantity.equals("")) {
            inventoryDTO.setQuantity(Long.valueOf(quantity));
        }
        if (!lockQuantity.equals("null") && !lockQuantity.equals("")) {
            inventoryDTO.setLockQuantity(Long.valueOf(lockQuantity));
        }
        if (!marking.equals("null") && !marking.equals("")) {
            inventoryDTO.setMarking(Integer.valueOf(marking));
        }
        if (!operatorId.equals("null") && !operatorId.equals("")) {
            inventoryDTO.setOperatorId(operatorId);
        }
        if (!operatorName.equals("null") && !operatorName.equals("")) {
            inventoryDTO.setOperatorName(operatorName);
        }
        if (!storeCode.equals("null") && !storeCode.equals("")) {
            inventoryDTO.setStoreCode(storeCode);
        }
        if (!storeType.equals("null") && !storeType.equals("")) {
            inventoryDTO.setStoreType(Integer.valueOf(storeType));
        }

        return inventoryDTO;

    }

    public static Map<String, Object> InvTradeDTOMap(String bizUniqueKey, String orderCode, String orderType, ItemDTO itemDTO, String storeCode,
                                                     String operateType, String increaseQuantity, String decQuantity, String lockQuantity,
                                                     String unlockQuantity, String sellerId, String operatorId, String operatorName) {

        Map<String, Object> InvTradeDTO = new HashMap<String, Object>();

        if (!bizUniqueKey.equals("null") && !bizUniqueKey.equals("")) {
            InvTradeDTO.put("bizUniqueKey", bizUniqueKey);
        }
        if (!orderCode.equals("null") && !orderCode.equals("")) {
            InvTradeDTO.put("orderCode", orderCode);
        }
        if (!orderType.equals("null") && !orderType.equals("")) {
            InvTradeDTO.put("orderType", orderType);
        }
        if (!storeCode.equals("null") && !storeCode.equals("")) {
            InvTradeDTO.put("storeCode", storeCode);
        }
        if (!operateType.equals("null") && !operateType.equals("")) {
            InvTradeDTO.put("operateType", operateType);
        }
        if (!increaseQuantity.equals("null") && !increaseQuantity.equals("")) {
            InvTradeDTO.put("increaseQuantity", increaseQuantity);
        }
        if (!decQuantity.equals("null") && !decQuantity.equals("")) {
            InvTradeDTO.put("decQuantity", decQuantity);
        }
        if (!lockQuantity.equals("null") && !lockQuantity.equals("")) {
            InvTradeDTO.put("lockQuantity", lockQuantity);
        }
        if (!unlockQuantity.equals("null") && !unlockQuantity.equals("")) {
            InvTradeDTO.put("unlockQuantity", unlockQuantity);
        }
        if (!sellerId.equals("null") && !sellerId.equals("")) {
            InvTradeDTO.put("sellerId", sellerId);
        }
        if (!operatorId.equals("null") && !operatorId.equals("")) {
            InvTradeDTO.put("operatorId", operatorId);
        }
        if (!operatorName.equals("null") && !operatorName.equals("")) {
            InvTradeDTO.put("operatorName", operatorName);
        }

        if (!itemDTO.equals("null") && !itemDTO.equals("")) {
            InvTradeDTO.put("itemDTO", itemDTO);
        }
        return InvTradeDTO;
    }

    public static Map<String, Object> Inv_skuDTOMAP(String skuDTOskuId, String skuDTOskuName, String skuIdDTOitemId, String skuDTOsalePrice,
                                                    String skuDTOmarkPrice, String skuDTOquantity, String barCode, String skuDTOspecification,
                                                    String skuDTOsaleProperty, String skuDTOversion, String skuDTOresources, String skuDTOgmtCreate,
                                                    String skuDTOgmtModified, List<Map<String,Object>> resourceDTOS) {
        Map<String, Object> Inv_skuDTO = new HashMap<String, Object>();
        if (!skuDTOskuId.equals("null") && !skuDTOskuId.equals("")) {
            Inv_skuDTO.put("skuDTOskuId", skuDTOskuId);
        }
        if (!skuDTOskuName.equals("null") && !skuDTOskuName.equals("")) {
            Inv_skuDTO.put("skuDTOskuName", skuDTOskuName);
        }
        if (!skuIdDTOitemId.equals("null") && !skuIdDTOitemId.equals("")) {
            Inv_skuDTO.put("skuDTOskuId", skuIdDTOitemId);
        }
        if (!skuDTOsalePrice.equals("null") && !skuDTOsalePrice.equals("")) {
            Inv_skuDTO.put("skuDTOsalePrice", skuDTOsalePrice);
        }
        if (!skuDTOmarkPrice.equals("null") && !skuDTOmarkPrice.equals("")) {
            Inv_skuDTO.put("skuDTOmarkPrice", skuDTOmarkPrice);
        }
        if (!skuDTOquantity.equals("null") && !skuDTOquantity.equals("")) {
            Inv_skuDTO.put("skuDTOquantity", skuDTOquantity);
        }
        if (!barCode.equals("null") && !barCode.equals("")) {
            Inv_skuDTO.put("barCode", barCode);
        }
        if (!skuDTOspecification.equals("null") && !skuDTOspecification.equals("")) {
            Inv_skuDTO.put("skuDTOspecification", skuDTOspecification);
        }
        if (!skuDTOsaleProperty.equals("null") && !skuDTOsaleProperty.equals("")) {
            Inv_skuDTO.put("skuDTOsaleProperty", skuDTOsaleProperty);
        }
        if (!skuDTOversion.equals("null") && !skuDTOversion.equals("")) {
            Inv_skuDTO.put("skuDTOversion", skuDTOversion);
        }
        if (!skuDTOresources.equals("null") && !skuDTOresources.equals("")) {
            Inv_skuDTO.put("skuDTOresources", skuDTOresources);
        }
        if (!skuDTOgmtCreate.equals("null") && !skuDTOgmtCreate.equals("")) {
            Inv_skuDTO.put("skuDTOgmtCreate", skuDTOgmtCreate);
        }
        if (!skuDTOgmtModified.equals("null") && !skuDTOgmtModified.equals("")) {
            Inv_skuDTO.put("skuDTOgmtModified", skuDTOgmtModified);
        }
        Inv_skuDTO.put("resourceDTO", resourceDTOS);
        return Inv_skuDTO;
    }
    /*public static SkuDTO Inv_skuDTO(String skuid)
    {
        SkuDTO skuDTO=new SkuDTO();
        if (!skuid.equals("null") && !skuid.equals("")) {
            skuDTO.setSkuId(Long.valueOf(skuid));
        }
        return skuDTO;
    }*/
    public static List<SkuDTO> Inv_SkuDTOs(String skuid) {
       /* Map<String,String[]> stringMap = new HashMap<String,String[]>();
        Map<String,String[]> stringMap = new HashMap<String,String[]>();*/
        if(skuid.equals("null") || skuid.equals("")) {
           // stringMap.put("skuid",skuid.split(","));
            return null;
        }
        List<SkuDTO> skuDTOs = new ArrayList<SkuDTO>();
            SkuDTO skuDTO = new SkuDTO();
            skuDTO.setSkuId(Long.valueOf(skuid));
            skuDTOs.add(skuDTO);

        return skuDTOs;
    }
    public static ItemDTO Inv_itemDTO(String flag, String itemId, String sellerId, String itemCode, List<SkuDTO> skudtos)
    {
        ItemDTO Inv_itemDTO=new ItemDTO();
        if (!flag.equals("null") && !flag.equals("")) {
            Inv_itemDTO.setFlag(Long.valueOf(flag));
        }
        if (!itemId.equals("null") && !itemId.equals(""))
        {
            Inv_itemDTO.setItemId(Long.valueOf(itemId));
        }
        if (!sellerId.equals("null")&&!sellerId.equals("")){
            Inv_itemDTO.setSellerId(Long.valueOf(sellerId));
        }
        if (!itemCode.equals("null")&&!itemCode.equals("")){
            Inv_itemDTO.setItemCode(itemCode);
        }
        if (!org.springframework.util.CollectionUtils.isEmpty(skudtos)) {
            Inv_itemDTO.setSkuDTOS(skudtos);
        }
        return Inv_itemDTO;

    }
    public static List<ItemDTO> Inv_itemDTOs(String flag, String itemId, String sellerId, String itemCode, List<SkuDTO> skudtos)
    {

        List<ItemDTO> Inv_itemDTOs=new ArrayList<ItemDTO>();
        Map<String,String[]> stringMap = new HashMap<String,String[]>();
        if(!flag.equals("null") && !flag.equals("")) {
            stringMap.put("flag",flag.split(","));
        }
        if(!itemId.equals("null") && !itemId.equals("")) {
            stringMap.put("itemId",itemId.split(","));
        }
        if(!sellerId.equals("null") && !sellerId.equals("")) {
            stringMap.put("sellerId",sellerId.split(","));
        }
        if(!itemCode.equals("null") && !itemCode.equals("")) {
        stringMap.put("itemCode",itemCode.split(","));
        }
        if (!org.springframework.util.CollectionUtils.isEmpty(skudtos))
        {
            stringMap.put("skudtos",itemCode.split(","));
        }
        for(int i = 0;i <2;i++) {
            ItemDTO itemDTO=new ItemDTO();
                itemDTO.setFlag(Long.valueOf(stringMap.get("flag")[i]));
                itemDTO.setItemId(Long.valueOf(stringMap.get("itemId")[i]));
                itemDTO.setSellerId(Long.valueOf(stringMap.get("sellerId")[i]));
                itemDTO.setItemCode(stringMap.get("itemCode")[i]);
                itemDTO.setSkuDTOS(skudtos);
                Inv_itemDTOs.add(itemDTO);
        }

        return Inv_itemDTOs;

    }
    public static Map<String,Object> Inv_itemDTOMap(String flag,String itemId,String sellerId,String itemCode,List<SkuDTO> skudtos)
    {
        Map<String, Object> Inv_itemDTOMap = new HashMap<String, Object>();
        if (!flag.equals("null") && !flag.equals("")) {
            Inv_itemDTOMap.put("flag",Long.valueOf(flag));
        }
        if (!itemId.equals("null") && !itemId.equals(""))
        {
            Inv_itemDTOMap.put("ItemId",Long.valueOf(itemId));
        }
        if (!sellerId.equals("null")&&!sellerId.equals("")){
            Inv_itemDTOMap.put("SellerId",Long.valueOf(sellerId));
        }
        if (!itemCode.equals("null")&&!itemCode.equals("")){
            Inv_itemDTOMap.put("ItemCode",itemCode);
        }
        if (!org.springframework.util.CollectionUtils.isEmpty(skudtos)) {
            Inv_itemDTOMap.put("SkuDTOS",skudtos);
        }
        return Inv_itemDTOMap;

    }

    public static WmsInventoryDTO wmsInventoryDTO(String supplierId, String supplierName, String storeCode, String inventoryType, String outOrderCode,
                                                  String orderType, String bizUniqueKey, String operatorId, String operatorName, String datetime,
                                                  List<WmsInventoryItemDTO> wmsItemList){
        WmsInventoryDTO wmsInventoryDTO=new WmsInventoryDTO();
        if(!supplierId.equals("null")&&!supplierId.equals("")){
            wmsInventoryDTO.setSupplierId(Long.valueOf(supplierId));
        }
        if(!supplierName.equals("null")&&!supplierName.equals("")){
            wmsInventoryDTO.setSupplierName(supplierName);
        }
        if(!storeCode.equals("null")&&!storeCode.equals("")){
            wmsInventoryDTO.setStoreCode(storeCode);
        }
        if(!inventoryType.equals("null")&&!inventoryType.equals("")){
            wmsInventoryDTO.setInventoryType(Integer.valueOf(inventoryType));
        }
        if(!outOrderCode.equals("null")&&!outOrderCode.equals("")){
            wmsInventoryDTO.setOutOrderCode(outOrderCode);
        }
        if(!orderType.equals("null")&&!orderType.equals("")){
            wmsInventoryDTO.setOrderType(Integer.valueOf(orderType));
        }
        if(!bizUniqueKey.equals("null")&&!bizUniqueKey.equals("")){
            wmsInventoryDTO.setBizUniqueKey(bizUniqueKey);
        }
        if(!operatorId.equals("null")&&!operatorId.equals("")){
            wmsInventoryDTO.setOperatorId(Long.valueOf(operatorId));
        }

        if(!operatorName.equals("null")&&!operatorName.equals("")){
            wmsInventoryDTO.setOperatorName(operatorName);
        }
        if(!datetime.equals("null")&&!datetime.equals("")){
            wmsInventoryDTO.setDateTime(datetime);
        }

        if(!org.springframework.util.CollectionUtils.isEmpty(wmsItemList)){
        wmsInventoryDTO.setWmsItemList(wmsItemList);
        }
        return wmsInventoryDTO;
    }
    public static List<WmsInventoryItemDTO> wmsItemListDTO(String itemid, String itemcode, String operateType, String quantity)
    {

        List<WmsInventoryItemDTO> wmsItemList=new ArrayList<WmsInventoryItemDTO>();

        Map<String,String[]> stringMap = new HashMap<String,String[]>();
        if(!itemid.equals("null") && !itemid.equals("")) {
            stringMap.put("itemId",itemid.split(","));
        }
        if(!itemcode.equals("null") && !itemcode.equals("")) {
            stringMap.put("itemCode",itemcode.split(","));
        }
        if(!operateType.equals("null") && !operateType.equals("")) {
            stringMap.put("operateType",operateType.split(","));
        }
        if(!quantity.equals("null") && !quantity.equals("")) {
            stringMap.put("quantity",quantity.split(","));
        }
        for(int i = 0;i <2;i++) {
            WmsInventoryItemDTO wmsInventoryItemDTO=new WmsInventoryItemDTO();
            //if(!(stringMap.get("itemId")[i]).equals("null")&&!(stringMap.get("itemId")[i]).equals(""))
            if(!org.springframework.util.CollectionUtils.isEmpty(stringMap))
                {
                wmsInventoryItemDTO.setItemId(Long.valueOf(stringMap.get("itemId")[i]));
                wmsInventoryItemDTO.setItemCode(stringMap.get("itemCode")[i]);
                wmsInventoryItemDTO.setOperateType(Integer.valueOf(stringMap.get("operateType")[i]));
                wmsInventoryItemDTO.setQuantity(Long.valueOf(stringMap.get("quantity")[i]));
                }

            wmsItemList.add(wmsInventoryItemDTO);
        }
        return wmsItemList;
    }
}

