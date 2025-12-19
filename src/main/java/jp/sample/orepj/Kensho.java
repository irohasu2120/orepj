package jp.sample.orepj;

import jp.sample.orepj.parent_module.child_module.MsiModule;
import jp.sample.orepj.sub.simple.CommonDto;
import jp.sample.orepj.sub.simple.CommonParts;

public class Kensho {
    public void execute() {
        System.out.println("Kensho Execute");
        CommonDto dto = CommonParts.findData();
        System.out.println(dto.getId());
        System.out.println(dto.getName());


        MsiModule msi = new MsiModule();
        msi.func1();
    }
}
