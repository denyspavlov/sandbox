package denispavlov.sandbox.cloning;

/**
 * User: denispavlov
 * Date: 24/03/2014
 * Time: 10:57
 */
public class ClonableBasicImpl implements Cloneable {

    private String prop1;
    private String prop2;
    private String prop3;
    private String prop4;
    private String prop5;
    private String prop6;
    private String prop7;
    private String prop8;
    private String prop9;
    private String prop10;

    public ClonableBasicImpl() {
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(final String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(final String prop2) {
        this.prop2 = prop2;
    }

    public String getProp3() {
        return prop3;
    }

    public void setProp3(final String prop3) {
        this.prop3 = prop3;
    }

    public String getProp4() {
        return prop4;
    }

    public void setProp4(final String prop4) {
        this.prop4 = prop4;
    }

    public String getProp5() {
        return prop5;
    }

    public void setProp5(final String prop5) {
        this.prop5 = prop5;
    }

    public String getProp6() {
        return prop6;
    }

    public void setProp6(final String prop6) {
        this.prop6 = prop6;
    }

    public String getProp7() {
        return prop7;
    }

    public void setProp7(final String prop7) {
        this.prop7 = prop7;
    }

    public String getProp8() {
        return prop8;
    }

    public void setProp8(final String prop8) {
        this.prop8 = prop8;
    }

    public String getProp9() {
        return prop9;
    }

    public void setProp9(final String prop9) {
        this.prop9 = prop9;
    }

    public String getProp10() {
        return prop10;
    }

    public void setProp10(final String prop10) {
        this.prop10 = prop10;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        final ClonableBasicImpl clone = (ClonableBasicImpl) super.clone(); // shallow copy for immutable

        return clone;
    }
}
