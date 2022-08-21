package bbyuk.excel.common.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Data
public class ExcelDto {
    private List<String> header;
    private List<LinkedHashMap<String, String>> body;

    public ExcelDto() {
        header = new ArrayList<>();
        body = new ArrayList<>();
    }
}
