
class StructFloat implements Float
{
    float f;

    public StructFloat(float f) {
        this.f = f;
    }

    @Override
    public void accept(FloatAcceptor acceptor)
    {
        acceptor.call(f);
    }
}