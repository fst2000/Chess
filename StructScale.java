
class StructScale implements Float2
{
    float x;
    float y;
    
    public StructScale(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void accept(Float2Acceptor acceptor)
    {
        acceptor.call(x, y);
    }
}