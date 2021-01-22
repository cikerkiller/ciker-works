package com.hf.ciker.works.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.hf.ciker.works.po.BasePO;

/**
 * @author ciker
 * @version 1.0
 * @date 2021/1/1 16:25
 */
public class MybatisPlusGen {
    public static void main(String[] args) {

        AutoGenerator mpg = new AutoGenerator();
        String[] tables = new String[]{"ck_batch_data"};
        String projectPath = System.getProperty("user.dir");

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(projectPath + "/src/main/java");  //生成路径(一般都是生成在此项目的src/main/java下面)
        gc.setFileOverride(true);
        gc.setIdType(IdType.UUID);
        gc.setSwagger2(true);
//        gc.setEnableCache(false);// XML 二级缓存
//        gc.setBaseResultMap(true);// XML ResultMap
//        gc.setBaseColumnList(true);// XML columList
        gc.setServiceName("%sService");
        gc.setAuthor("ciker");// 作者
        gc.setOpen(false);
        gc.setDateType(DateType.ONLY_DATE);
        mpg.setGlobalConfig(gc);


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://localhost:3306/ciker?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setTablePrefix(new String[]{"ck_"});
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(tables); // 需要生成的表
        strategy.setSuperServiceClass(null);
        strategy.setSuperServiceImplClass(null);
        strategy.setSuperMapperClass(null);
        strategy.setSuperEntityClass(BasePO.class);
        strategy.setRestControllerStyle(true);

//        strategy.setLogicDeleteFieldName("is_delete");
//        strategy.setVersionFieldName("version");

        //开启lombook支持
        strategy.setEntityLombokModel(true);

      /*  TableFill updatedDate = new TableFill("updated_date", FieldFill.INSERT_UPDATE);
        TableFill createdDate = new TableFill("created_date", FieldFill.INSERT);

        strategy.setTableFillList(Lists.newArrayList(updatedDate,createdDate));*/

        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.hf.ciker.works");
        pc.setController("action");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("mapper");
        pc.setEntity("po");
        pc.setXml("mapper.impl");
        mpg.setPackageInfo(pc);
        // 执行生成
        mpg.execute();
    }
}
