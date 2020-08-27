package homework.day14.checkpoint02.test1;

public class Son extends Father {
    //a) 验证：重写方法不能抛出与父类平级的其他异常。
//    @Override
//    public void eat() throws TonguePainException {
//        throw new TonguePainException("舌头疼");
//    }

    //b) 验证：重写方法不能抛出比父类高级的异常。
//    @Override
//    public void eat() throws PainExecption {
//        throw new PainExecption("疼");
//    }

    //c) 验证：重写方法可以抛出和父类同样的异常
//    @Override
//    public void eat() throws ToothPainException {
//        throw new ToothPainException("牙疼");
//    }
    //d) 验证：重写方法:可以抛出父类抛出异常的子类异常.
//   @Override
//    public void eat() throws BigToothPainException {
//        throw new BigToothPainException("大牙疼");
//    }

    //e) 验证： 重写方法可以抛出多个 "父类抛出异常的子类异常".
    @Override
    public void eat() throws BigToothPainException, FrontToothPainExcption {
        if (true) {
            throw new BigToothPainException();
        } else {
            throw new FrontToothPainExcption();
        }
    }

    //f) 验证：父类不抛出异常,子类也不能抛出异常(编译时异常)
//    @Override
//    public void drink() throws ToothPainException{
//        super.drink();
//    }
    //g) 验证：如果子类内部抛出了异常(或调用抛出异常的方法)只能自己处理,不允许向外抛.
    @Override
    public void drink() {
        try {
            System.out.println("喝到了100度的水");
            throw new ToothPainException("舌头疼");
        } catch (ToothPainException t) {
            t.printStackTrace();
        }

    }
}
