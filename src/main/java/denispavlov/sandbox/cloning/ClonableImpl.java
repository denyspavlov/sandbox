package denispavlov.sandbox.cloning;

/**
 * User: denispavlov
 * Date: 24/03/2014
 * Time: 10:57
 */
public class ClonableImpl implements Cloneable {

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

    private ClonableImpl obj1;
    private ClonableImpl obj2;
    private ClonableImpl obj3;
    private ClonableImpl obj4;
    private ClonableImpl obj5;
    private ClonableImpl obj6;
    private ClonableImpl obj7;
    private ClonableImpl obj8;
    private ClonableImpl obj9;
    private ClonableImpl obj10;

    public ClonableImpl() {
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

    public ClonableImpl getObj1() {
        return obj1;
    }

    public void setObj1(final ClonableImpl obj1) {
        this.obj1 = obj1;
    }

    public ClonableImpl getObj2() {
        return obj2;
    }

    public void setObj2(final ClonableImpl obj2) {
        this.obj2 = obj2;
    }

    public ClonableImpl getObj3() {
        return obj3;
    }

    public void setObj3(final ClonableImpl obj3) {
        this.obj3 = obj3;
    }

    public ClonableImpl getObj4() {
        return obj4;
    }

    public void setObj4(final ClonableImpl obj4) {
        this.obj4 = obj4;
    }

    public ClonableImpl getObj5() {
        return obj5;
    }

    public void setObj5(final ClonableImpl obj5) {
        this.obj5 = obj5;
    }

    public ClonableImpl getObj6() {
        return obj6;
    }

    public void setObj6(final ClonableImpl obj6) {
        this.obj6 = obj6;
    }

    public ClonableImpl getObj7() {
        return obj7;
    }

    public void setObj7(final ClonableImpl obj7) {
        this.obj7 = obj7;
    }

    public ClonableImpl getObj8() {
        return obj8;
    }

    public void setObj8(final ClonableImpl obj8) {
        this.obj8 = obj8;
    }

    public ClonableImpl getObj9() {
        return obj9;
    }

    public void setObj9(final ClonableImpl obj9) {
        this.obj9 = obj9;
    }

    public ClonableImpl getObj10() {
        return obj10;
    }

    public void setObj10(final ClonableImpl obj10) {
        this.obj10 = obj10;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        final ClonableImpl clone = (ClonableImpl) super.clone(); // shallow copy for immutable

        // deep copy for objects
        clone.obj1 = this.obj1 != null ? (ClonableImpl) this.obj1.clone() : null;
        clone.obj2 = this.obj2 != null ? (ClonableImpl) this.obj2.clone() : null;
        clone.obj3 = this.obj3 != null ? (ClonableImpl) this.obj3.clone() : null;
        clone.obj4 = this.obj4 != null ? (ClonableImpl) this.obj4.clone() : null;
        clone.obj5 = this.obj5 != null ? (ClonableImpl) this.obj5.clone() : null;
        clone.obj6 = this.obj6 != null ? (ClonableImpl) this.obj6.clone() : null;
        clone.obj7 = this.obj7 != null ? (ClonableImpl) this.obj7.clone() : null;
        clone.obj8 = this.obj8 != null ? (ClonableImpl) this.obj8.clone() : null;
        clone.obj9 = this.obj8 != null ? (ClonableImpl) this.obj9.clone() : null;
        clone.obj10 = this.obj10 != null ? (ClonableImpl) this.obj10.clone() : null;

        return clone;
    }
}
