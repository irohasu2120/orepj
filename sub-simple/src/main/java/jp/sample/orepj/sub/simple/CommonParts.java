package jp.sample.orepj.sub.simple;

public class CommonParts {
    public static CommonDto findData() {
        CommonDto dto = new CommonDto();
        dto.setId(1);
        dto.setName("test");
        return dto;
    }
}
