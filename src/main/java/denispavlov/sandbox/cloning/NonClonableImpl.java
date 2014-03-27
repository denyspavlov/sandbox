package denispavlov.sandbox.cloning;

/**
 * User: denispavlov
 * Date: 24/03/2014
 * Time: 10:56
 */
public class NonClonableImpl {

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

    private NonClonableImpl obj1;
    private NonClonableImpl obj2;
    private NonClonableImpl obj3;
    private NonClonableImpl obj4;
    private NonClonableImpl obj5;
    private NonClonableImpl obj6;
    private NonClonableImpl obj7;
    private NonClonableImpl obj8;
    private NonClonableImpl obj9;
    private NonClonableImpl obj10;

    public NonClonableImpl() {
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

    public NonClonableImpl getObj1() {
        return obj1;
    }

    public void setObj1(final NonClonableImpl obj1) {
        this.obj1 = obj1;
    }

    public NonClonableImpl getObj2() {
        return obj2;
    }

    public void setObj2(final NonClonableImpl obj2) {
        this.obj2 = obj2;
    }

    public NonClonableImpl getObj3() {
        return obj3;
    }

    public void setObj3(final NonClonableImpl obj3) {
        this.obj3 = obj3;
    }

    public NonClonableImpl getObj4() {
        return obj4;
    }

    public void setObj4(final NonClonableImpl obj4) {
        this.obj4 = obj4;
    }

    public NonClonableImpl getObj5() {
        return obj5;
    }

    public void setObj5(final NonClonableImpl obj5) {
        this.obj5 = obj5;
    }

    public NonClonableImpl getObj6() {
        return obj6;
    }

    public void setObj6(final NonClonableImpl obj6) {
        this.obj6 = obj6;
    }

    public NonClonableImpl getObj7() {
        return obj7;
    }

    public void setObj7(final NonClonableImpl obj7) {
        this.obj7 = obj7;
    }

    public NonClonableImpl getObj8() {
        return obj8;
    }

    public void setObj8(final NonClonableImpl obj8) {
        this.obj8 = obj8;
    }

    public NonClonableImpl getObj9() {
        return obj9;
    }

    public void setObj9(final NonClonableImpl obj9) {
        this.obj9 = obj9;
    }

    public NonClonableImpl getObj10() {
        return obj10;
    }

    public void setObj10(final NonClonableImpl obj10) {
        this.obj10 = obj10;
    }

    private NonClonableImpl(NonClonableImpl nonClonable) {
        prop1 = nonClonable.prop1;
        prop2 = nonClonable.prop2;
        prop3 = nonClonable.prop3;
        prop4 = nonClonable.prop4;
        prop5 = nonClonable.prop5;
        prop6 = nonClonable.prop6;
        prop7 = nonClonable.prop7;
        prop8 = nonClonable.prop8;
        prop9 = nonClonable.prop9;
        prop10 = nonClonable.prop10;

        obj1 = nonClonable.obj1 != null ? nonClonable.obj1.copy() : null;
        obj2 = nonClonable.obj2 != null ? nonClonable.obj2.copy() : null;
        obj3 = nonClonable.obj3 != null ? nonClonable.obj3.copy() : null;
        obj4 = nonClonable.obj4 != null ? nonClonable.obj4.copy() : null;
        obj5 = nonClonable.obj5 != null ? nonClonable.obj5.copy() : null;
        obj6 = nonClonable.obj6 != null ? nonClonable.obj6.copy() : null;
        obj7 = nonClonable.obj7 != null ? nonClonable.obj7.copy() : null;
        obj8 = nonClonable.obj8 != null ? nonClonable.obj8.copy() : null;
        obj9 = nonClonable.obj9 != null ? nonClonable.obj9.copy() : null;
        obj10 = nonClonable.obj10 != null ? nonClonable.obj10.copy() : null;
    }

    public NonClonableImpl copy() {
        return new NonClonableImpl(this);
    }

}
