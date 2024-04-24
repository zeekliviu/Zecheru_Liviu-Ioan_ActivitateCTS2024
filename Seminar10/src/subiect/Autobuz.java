package subiect;

public class Autobuz extends Subiect{
    @Override
    public void anuntaPlecare() {
        System.out.printf("Autobuzul pleacă din stație!%n");
    }

    public void anuntaDeranjament()
    {
        super.trimiteMesaje("A intervenit un deranjament!");
    }
}
