package com.person.poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class CreateOrdersTemplate {
    public static void main(String[] args) throws IOException {
        //创建工作簿
        Workbook wk = new HSSFWorkbook();
        String title="采购单";
        //创建工作表
        Sheet sheet = wk.createSheet(title);
        Row row = sheet.createRow(0);
        row.setHeight((short) 1000);
        //创建字体
        Font font_content = wk.createFont();
        font_content.setFontName("宋体");
        font_content.setFontHeightInPoints((short) 11);
        //创建标题的样式
        CellStyle style_title = wk.createCellStyle();
        //创建标题的字体
        Font font_title= wk.createFont();
        //创建单元格格式
        font_title.setFontName("黑体");
        font_title.setFontHeightInPoints((short) 18);

        //创建单元格
        CellStyle style_content = wk.createCellStyle();
        //居中
        style_content.setAlignment(CellStyle.ALIGN_CENTER);
        style_content.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        //复制样式
        style_title.cloneStyleFrom(style_content);
        //置标题的字体
        style_title.setFont(font_title);
        //设置标题的的单元格
        Cell cell_title = sheet.getRow(0).createCell(0);
        cell_title.setCellStyle(style_title);
        //实质单元格的边框
        style_content.setBorderBottom(CellStyle.BORDER_THIN);
        style_content.setBorderLeft(CellStyle.BORDER_THIN);
        style_content.setBorderTop(CellStyle.BORDER_THIN);
        style_content.setBorderRight(CellStyle.BORDER_THIN);
        //设置样式的字体
        style_content.setFont(font_content);
        //创建日期的样式
        CellStyle style_date =wk.createCellStyle();
        style_date.cloneStyleFrom(style_content);
        //格式化
        DataFormat dataFormat=wk.createDataFormat();
        style_date.setDataFormat(dataFormat.getFormat("yyyy-MM-dd"));

        //合并单元格
        //标题
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,3));
        //供应商
        sheet.addMergedRegion(new CellRangeAddress(2, 2, 1, 3));
        //明细
        sheet.addMergedRegion(new CellRangeAddress(7,7,0,3));

        for(int i=2;i<12;i++){
            row =sheet.createRow(i);
            //设置行高
            row.setHeight((short) 500);
            for(int j=0;j<4;j++){
                //设置单元格的样式
                row.createCell(j).setCellStyle(style_content);
            }
        }
        //设置列宽
        for(int i=0;i<4;i++){
            sheet.setColumnWidth(i,5000);
        }
        //设置内容
        //标题
        cell_title.setCellValue(title);
        //供应商
        sheet.getRow(2).getCell(0).setCellValue("供应商");
        //日期
        sheet.getRow(3).getCell(0).setCellValue("下单日期");
        sheet.getRow(4).getCell(0).setCellValue("审核日期");
        sheet.getRow(5).getCell(0).setCellValue("采购日期");
        sheet.getRow(6).getCell(0).setCellValue("入库日期");

        //设置日期格式
        sheet.getRow(3).getCell(1).setCellStyle(style_date);
        sheet.getRow(4).getCell(1).setCellStyle(style_date);
        sheet.getRow(5).getCell(1).setCellStyle(style_date);
        sheet.getRow(6).getCell(1).setCellStyle(style_date);

        sheet.getRow(3).getCell(2).setCellValue("经办人");
        sheet.getRow(4).getCell(2).setCellValue("经办人");
        sheet.getRow(5).getCell(2).setCellValue("经办人");
        sheet.getRow(6).getCell(2).setCellValue("经办人");

        sheet.getRow(7).getCell(0).setCellValue("订单明细");
        sheet.getRow(8).getCell(0).setCellValue("商品名称");
        sheet.getRow(8).getCell(1).setCellValue("数量");
        sheet.getRow(8).getCell(2).setCellValue("价格");
        sheet.getRow(8).getCell(3).setCellValue("金额");
        //设置日期值
        sheet.getRow(3).getCell(1).setCellValue(new Date());

        //保存到本地
        wk.write(new FileOutputStream(new File("E:/dataSorcerer/POI/order.xls")));
        wk.close();
    }
}
