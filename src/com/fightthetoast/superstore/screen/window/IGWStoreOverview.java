package com.fightthetoast.superstore.screen.window;

import org.isjaki.util.vec2f;

import com.fightthetoast.superstore.Isle;
import com.fightthetoast.superstore.screen.ScreenInGame;

public class IGWStoreOverview extends IngameWindow{

	
	private boolean showFront = true;
	
	public IGWStoreOverview(ScreenInGame sig) {
		super(sig);
	}

	@Override//
	public void render() {
		
		
		sig.game.backdrop.render(new vec2f(0,0));
		int c = 0;
		for(Isle i : sig.isles)
		{	
			
			drawIsle(i,300+(40*c), 290+c*15);
			c++;
		
		}
		drawBezel();
	}
	
	private void drawBezel()
	{

		
	}
	
	
	private void drawIsle(Isle isle, int x, int y)
	{
		sig.game.sheetTiles.render(new vec2f(x, y), new vec2f(0,0), 0);
		sig.game.sheetTiles.render(new vec2f(x, y+32), new vec2f(0,1), 0);
		sig.game.sheetTiles.render(new vec2f(x+32, y), new vec2f(1,0), 0);
		sig.game.sheetTiles.render(new vec2f(x+32, y+32), new vec2f(1,1), 0);
		//if(isle.hasIsleSign())
			//sig.game.sheetTiles.render(new vec2f(x+42, y-10), new vec2f(3,0), 0);
	}

}
