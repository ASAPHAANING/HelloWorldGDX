package com.haaning;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

/**
 * Created by haaning on 6/8/15.
 */
public class Scene2D extends ApplicationAdapter {

    class MyActor extends Actor
    {
        Texture texture = new Texture(Gdx.files.internal("pingu.jpg"));
        @Override
        public void draw(Batch batch, float parentAlpha) {
            batch.draw(texture,0,0);
        }
    }
    Stage stage;

    @Override
    public void create ()
    {
        stage = new Stage(new ScreenViewport());
        MyActor actor = new MyActor();
        stage.addActor(actor);
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render ()
    {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.draw();
    }

}
