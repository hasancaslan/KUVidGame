package dmme.kuvid.ui;

import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import dmme.kuvid.domain.KUVidGame;
import dmme.kuvid.domain.GameObjects.GameObject;
import dmme.kuvid.utils.IconImporter;
import dmme.kuvid.utils.observer.PropertyEvent;
import dmme.kuvid.utils.observer.PropertyListener;

public class sigmaBlockerUI extends MoleculeUI implements PropertyListener{
	
	private static int L=KUVidGame.getInstance().getL();
	
	private GameObject block;
	private GamePanel panel;
	private Dimension dim;
	private int id;
	
	public sigmaBlockerUI(GameObject block, GamePanel panel2) {
		super(IconImporter.getIconFromFileName("sigma-b.png","blockers",new Dimension((int) (10 * L), (int) (10 * L))));
        Dimension dimension = new Dimension((int) (10 * L), (int) (10 * L));
        this.setSize(dimension);
        
        block.addPropertyListener("active",this);
        block.addPropertyListener("position",this);
        this.block=block;
        this.panel=panel2;
        this.dim=dimension;
	}
	
	
	@Override
    public void onPropertyEvent(PropertyEvent e) {
        if (e.getPropertyName().equals("active")) {
        	this.setLocation(this.block.getPosition().getX(),this.block.getPosition().getY());
        	if((boolean) e.getNewValue()) {
        		this.panel.add(this);
        	}else {
        		this.panel.remove(this);
        	}
        }else if (e.getPropertyName().equals("position")) {
        	if(this.block.isActive()) {
        		this.setLocation(this.block.getPosition().getX(),this.block.getPosition().getY());
        	}
        }
    }
	
}
