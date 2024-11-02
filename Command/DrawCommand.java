package Command;

import java.awt.Point;

public class DrawCommand implements Command{
    
    protected Drawable drawable;

    private Point position;

    public DrawCommand(DrawCommand drawCommand, Point position){
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute(){
        drawable.draw(position.x, position.y);
    }

}
