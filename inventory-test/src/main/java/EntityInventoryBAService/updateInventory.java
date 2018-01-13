package EntityInventoryBAService;

//import com.newretail.logisticscenter.addressbasecenter.client.service.AddressbaseService;
import com.newretail.logisticscenter.inventorycenter.dto.InventoryDTO;
import com.newretail.logisticscenter.inventorycenter.service.InventoryWriteBAService;
import inventory.Newretail_InventoryTransferObject;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.samplers.SampleResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.config.Arguments;


public class updateInventory extends AbstractJavaSamplerClient {
    //需要测试的接口
    @Autowired
    private InventoryWriteBAService inventoryWriteBAService;
    private long start = 0;//记录测试开始时间；
    private long end = 0;//记录测试结束时间；
    private String inventoryModel=null;
    private String sellerId=null;
    private String sellerName=null;
    private String supplierId=null;
    private String supplierName=null;
    private String itemId=null;
    private String skuId=null;
    private String itemCode=null;
    private String inventoryType=null;
    private String channelType=null;
    private String quantity=null;
    private String lockQuantity=null;
    private String marking=null;
    private String bizType=null;
    private String operatorId=null;
    private String operatorName=null;
    private String storeCode=null;
    private String storeType=null;

    //初始化操作
    //@Override
    public void setupTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "dubbo-consumer.xml");
        context.start();
        inventoryWriteBAService = (InventoryWriteBAService)context.getBean("InventoryWriteBAService");
    }
    /*** 设置默认值*
      * @return
     */
    public Arguments getDefaultParameters() {
        Arguments params = new Arguments();
        params.addArgument("inventoryModel",inventoryModel);
        params.addArgument("sellerId", sellerId);
        params.addArgument("sellerName", sellerName);
        params.addArgument("supplierId", supplierId);
        params.addArgument("supplierName", supplierName);
        params.addArgument("itemId", itemId);
        params.addArgument("skuId", skuId);
        params.addArgument("itemCode", itemCode);
        params.addArgument("inventoryType", inventoryType);
        params.addArgument("channelType", channelType);
        params.addArgument("quantity", quantity);
        params.addArgument("lockQuantity", lockQuantity);
        params.addArgument("marking", marking);
        params.addArgument("bizType", bizType);
        params.addArgument("operatorId", operatorId);
        params.addArgument("operatorName", operatorName);
        params.addArgument("storeCode", storeCode);
        params.addArgument("storeType", storeType);

        return params;
    }
    /**
     * 获取jmeter输入的参数值
     *
     * @return
     */
    public void setValues(JavaSamplerContext arg0) {
        inventoryModel = arg0.getParameter("inventoryModel",inventoryModel);
        sellerId = arg0.getParameter("sellerId",sellerId);
        sellerName = arg0.getParameter("sellerName",sellerName);
        supplierId = arg0.getParameter("supplierId",supplierId);
        supplierName = arg0.getParameter("cardNo",supplierName);
        itemId = arg0.getParameter("itemId",itemId);
        skuId = arg0.getParameter("cardNo",skuId);
        itemCode = arg0.getParameter("itemCode",itemCode);
        inventoryType = arg0.getParameter("inventoryType",inventoryType);
        channelType = arg0.getParameter("channelType",channelType);
        quantity = arg0.getParameter("quantity",quantity);
        lockQuantity = arg0.getParameter("lockQuantity",lockQuantity);
        marking = arg0.getParameter("marking",marking);
        bizType = arg0.getParameter("bizType",bizType);
        operatorId = arg0.getParameter("operatorId",operatorId);
        operatorName = arg0.getParameter("operatorName",operatorName);
        storeCode = arg0.getParameter("storeCode",storeCode);
        storeType = arg0.getParameter("storeType",storeType);
    }
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        SampleResult sr = new SampleResult();
        setValues(javaSamplerContext);
        sr.sampleStart();
        start = System.currentTimeMillis();
        try {


            InventoryDTO inventoryDTO= Newretail_InventoryTransferObject.getInventoryDTO(inventoryModel, sellerId, sellerName,
                    supplierId, supplierName, itemId, skuId, itemCode,
                    inventoryType, channelType, quantity, lockQuantity, marking,
                    bizType, operatorId, operatorName, storeCode, storeType);

            Object result = inventoryWriteBAService.updateInventory(inventoryDTO);
            System.out.println(result);
        } catch (Exception e) {
            //getLogger().error("LqueryTakeRegNo response error : " + e.getMessage());
            e.printStackTrace();
            sr.setSuccessful(false);
            getLogger().error("LqueryTakeRegNo response is null");
        } finally {
            sr.sampleEnd();
        }
        return sr;
    }
    @Override
    public void teardownTest(JavaSamplerContext arg0) {
        try {
            end = System.currentTimeMillis();
            System.out.println("    cost time: " + (end - start) + "ms");
            getLogger().error("LqueryTakeRegNo response is null");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
